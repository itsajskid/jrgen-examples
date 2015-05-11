package com.github.jrgen.example.domain.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.github.jrgen.context.JrgenContext;
import com.github.jrgen.example.domain.Category;
import com.github.jrgen.example.domain.NutritionFacts;
import com.github.jrgen.example.domain.PrimitiveNutritionFacts;
import com.github.jrgen.example.domain.VendingItem;
import com.github.jrgen.example.domain.VendingProduct;
import com.github.jrgen.settings.Settings;

public class DomainTests {
	
	private Log log = LogFactory.getLog(getClass());
	
	private JrgenContext jrgenContext;
	private Settings settings;
	
	public DomainTests() {
		settings = Settings.getInstance();
		settings.getResources().clear();
		jrgenContext = new JrgenContext(settings).initalizeContext();
	}
	
	@Test
	public void valueTest() {
		Integer myInt = jrgenContext.generate(Integer.class);
		log.info("myInt: " + myInt);
		
		Date myDate = jrgenContext.generate(Date.class);
		log.info("myDate: " + myDate);
		
		int myPrimInt = jrgenContext.generate(int.class);
		log.info("myPrimInt: " + myPrimInt);
		
		char myChar = jrgenContext.generate(char.class);
		log.info("myChar: " + myChar);
		
		Category category = jrgenContext.generate(Category.class);
		log.info("category: " + category);
	}
	
	@Test
	public void arrayTest() {		
		jrgenContext.getSettings().setRandomContainerSize(false);
		jrgenContext.getSettings().setDefaultContainerSize(8);
		
		char[] charArray = jrgenContext.generate(char[].class);
		log.info("charArray: " +  Arrays.toString(charArray));
		
		jrgenContext.getSettings().setDefaultContainerSize(3);
		Date[] dateArray = jrgenContext.generate(Date[].class);
		log.info("dateArray: " + Arrays.toString(dateArray));
		
		NutritionFacts[] nFactsArray = 
				jrgenContext.generate(NutritionFacts[].class);
		log.info("nFactsArray: " + Arrays.toString(nFactsArray));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void collectionsTest() {
		jrgenContext.getSettings().setRandomContainerSize(false);
		jrgenContext.getSettings().setDefaultContainerSize(3);
		
		//Basic collection
		Collection collection = jrgenContext.generate(Collection.class);
		log.info(String.format("collection type: %s, \ncollection data: %s", 
				collection.getClass(), collection));
		
		//Set of Date
		TypeFactory tf = TypeFactory.defaultInstance();
		JavaType javaType = tf.constructCollectionType(Set.class, Date.class);
		Set<Date> dateSet = (Set<Date>) jrgenContext.generate(javaType);
		log.info(String.format("dataSet type: %s, \ndateSet data: %s", 
				dateSet.getClass(), dateSet));
		
		//List of Set of NutritionFacts
		JavaType elementType = 
				tf.constructCollectionType(Set.class, NutritionFacts.class);
		JavaType listType =
				tf.constructCollectionType(List.class, elementType);
		List<Set<NutritionFacts>> nFactsSetList = 
				(List<Set<NutritionFacts>>) jrgenContext.generate(listType);
		log.info(String.format(
				"nFactsSetList type: %s, \nnFactsSetList data: %s", 
				nFactsSetList.getClass(), nFactsSetList));
		
		//TreeSet of Integer...should be in natural order
		JavaType setOfIntegerJavaType = 
				tf.constructCollectionType(Set.class, Integer.class);
		jrgenContext.getAbstractTypeHandler()
			.registerAbstractType(Set.class, TreeSet.class);
		Set<Integer> intSet = 
				(Set<Integer>) jrgenContext.generate(setOfIntegerJavaType);
		log.info(String.format(
				"intSet type: %s, \nintSet data: %s", 
				intSet.getClass(), intSet));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void mapsTest() {
		jrgenContext.getSettings().setRandomContainerSize(false);
		jrgenContext.getSettings().setDefaultContainerSize(3);
		
		Map map = jrgenContext.generate(Map.class);
		log.info("map: " + map);
		
		Map<Date, int[]> lottery = 
				jrgenContext.generate(Map.class, Date.class, int[].class);
		for (Entry<Date, int[]> lotteryEntry : lottery.entrySet()) {
			log.info(String.format("lottery date: %s, lottery numbers: %s",
					lotteryEntry.getKey(), 
					Arrays.toString(lotteryEntry.getValue())));
		}
		
		TypeFactory tf = TypeFactory.defaultInstance();
		JavaType setDateJavaType = 
				tf.constructCollectionType(Set.class, Date.class);
		JavaType mapJavaType = tf.constructParametrizedType(
				Map.class, 
				Map.class, 
				setDateJavaType, 
				tf.constructArrayType(NutritionFacts.class));
		
		Map<Set<Date>, NutritionFacts[]> dateNFactsMap = 
				(Map<Set<Date>, NutritionFacts[]>) 
					jrgenContext.generate(mapJavaType);
		
		for (Entry<Set<Date>, NutritionFacts[]> e : dateNFactsMap.entrySet()) {
			log.info(String.format("\nkey: %s, value: %s", 
					e.getKey(), Arrays.toString(e.getValue())));
		}
				
	}

	@Test
	public void nutritionFactsTest() {
		NutritionFacts nFacts = 
				jrgenContext.generate(NutritionFacts.class);
		
		log.info("nFacts: " + nFacts);
	}
	
	@Test
	public void primitiveNutritionFactsTest() {
		PrimitiveNutritionFacts pNFacts =
				jrgenContext.generate(PrimitiveNutritionFacts.class);
		
		log.info("pNFacts: "+ pNFacts);
	}
	
	@Test
	public void productTest() {
		VendingProduct product = jrgenContext.generate(VendingProduct.class);
		
		log.info("product: " + product);
	}
	
	@Test
	public void vendingItemTest() {
		jrgenContext
			.getAbstractTypeHandler()
			.registerAbstractType(VendingItem.class, VendingProduct.class);
		
		VendingItem vendingItem = jrgenContext.generate(VendingItem.class);
		
		log.info("vendingItem: " + vendingItem);
	}
}
