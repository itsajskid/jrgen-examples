package com.github.jrgen.example.domain.test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.github.jrgen.context.JrgenContext;
import com.github.jrgen.settings.Settings;

public class ImmutableTypeTests {

	private static final Log log = LogFactory.getLog(ImmutableTypeTests.class);
	private JrgenContext jrgenContext;
	
	public ImmutableTypeTests() throws URISyntaxException {
		Settings settings = Settings.getInstance();
		settings.getResources().clear();
		settings.getResources().add(
				new URI("/myresources/myresources.json"));
		
		jrgenContext = new JrgenContext(settings).initalizeContext();
	}
	
	@Test
	public void fileTest() {
		//Files are immutable...by the class definition and by JRGEN's
		//inability to describe it.
		File file = jrgenContext.generate(File.class);
		log.info("file: " + file);
		TestCase.assertNotNull(file);
	}
}
