package com.github.jrgen.example.domain.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import junit.framework.TestCase;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.github.jrgen.context.JrgenContext;
import com.github.jrgen.example.domain.NutritionFacts;
import com.github.jrgen.settings.Settings;

public class SettingsTests {

	private static final Log log = LogFactory.getLog(SettingsTests.class);
	private JrgenContext jrgenContext;
	private Settings settings;
	
	public SettingsTests() {
		jrgenContext = new JrgenContext().initalizeContext();
		settings = jrgenContext.getSettings();
	}
	
	@Test
	public void changeResourcesURITest() throws URISyntaxException {
		settings.getResources().clear();
		settings.getResources().add(new URI("/myresources/myresources.json"));
		
		//DO NOT FORGET TO REINITIALIZE THE JRGENCONTEXT...
		jrgenContext.initalizeContext();
		
		log.info(jrgenContext.getTypeMap());
		TestCase.assertFalse(jrgenContext.getTypeMap().isEmpty());
	}
	
	@Test
	public void stringGenerationSettingsTest() {
		//No alphas
		settings.setAlphaUsed(false);
		settings.setDigitsUsed(true);
		settings.setSpecialsUsed(true);
		String noAlpha = jrgenContext.generate(String.class);
		log.info("noAlpha: " + noAlpha);
		TestCase.assertFalse(StringUtils.isAlpha(noAlpha));
		
		//No digits
		settings.setAlphaUsed(true);
		settings.setDigitsUsed(false);
		settings.setSpecialsUsed(true);
		String noDigits = jrgenContext.generate(String.class);
		log.info("noDigits: " + noDigits);
		TestCase.assertFalse(StringUtils.isNumeric(noDigits));	
		
		//change the default length
		settings.setDefaultStringLength(5);
		String strOfFiveLength = jrgenContext.generate(String.class);
		log.info("strOfFiveLength: " + strOfFiveLength);
		TestCase.assertTrue(strOfFiveLength.length() == 5);
	}
	
	@Test
	public void numberGenerationSettingsTest() {
		settings.setMinIntValue(-1000);
		settings.setMaxIntValue(-1);
		int negNum = jrgenContext.generate(int.class);
		log.info("negNum: " + negNum);
		TestCase.assertTrue(negNum < 0);
		
		settings.setMinFloatValue(-1000.5f);
		settings.setMaxFloatValue(0.00001f);
		float negFloat = jrgenContext.generate(float.class);
		log.info("negFloat: " + negFloat);
		TestCase.assertTrue(negFloat <= 0.00001f);
	}
	
	@Test
	public void generateUndefindedTest() throws URISyntaxException {
		//set the resource location...
		settings.getResources().clear();
		settings.getResources().add(new URI("/myresources/myresources.json"));
		jrgenContext.initalizeContext();
		
		//Will generate all nutrition facts properties, from configuration
		//first, then automatically.
		NutritionFacts nFacts = 
				jrgenContext.generate(NutritionFacts.class);
		log.info("nFacts: " + nFacts);
		
		//Turn off generation from undefined properties in the configuration
		//file. Only properties defined in the configuration will be defined.
		settings.setGenerateUndefined(false);
		nFacts = jrgenContext.generate(NutritionFacts.class);
		log.info("nFacts: " + nFacts);
	}
	
	@Test
	public void nullOnEmptySetTest() {
		//We force an empty collection, array, or map.
		settings.setRandomContainerSize(false);
		settings.setDefaultContainerSize(0);
		
		//Will return an empty collection, array or map.
		Integer[] nullList = jrgenContext.generate(Integer[].class);
		log.info("nullList: " + Arrays.toString(nullList));
		TestCase.assertNotNull(nullList);
		
		//We want a null value instead of a collection, array, or
		//map that contains no elements.
		settings.setNullOnEmptySet(true);

		nullList = jrgenContext.generate(Integer[].class);
		log.info("nullList: " + nullList);
		TestCase.assertNull(nullList);
	}
	
	@Test
	public void isNotNullTest() {
		//Getters and Setters maybe present...so we turn off auto generation
		settings.setGenerateUndefined(false);
		
		//By default notNull is turned off...will get back a null reference.
		SimpleDateFormat sdf = 
				jrgenContext.generate(SimpleDateFormat.class);
		log.info("isNotNull OFF. Generated SimpleDateFormat: " + sdf);
		TestCase.assertNull(sdf);
		
		//Turn on isNotNull...Jrgen will attempt to create a reference.
		settings.setNotNull(true);
		sdf = jrgenContext.generate(SimpleDateFormat.class);
		log.info("isNotNull ON. Generated SimpleDateFormat: " + sdf);
		TestCase.assertNotNull(sdf);
	}
}
