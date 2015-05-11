package com.github.jrgen.example.domain.test;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.github.jrgen.context.JrgenContext;
import com.github.jrgen.example.domain.VendingItem;
import com.github.jrgen.example.domain.VendingProduct;
import com.github.jrgen.settings.Settings;

public class VendingTests {

	private static final Log log = LogFactory.getLog(VendingTests.class);
	private JrgenContext jrgenContext;
	
	public VendingTests() throws URISyntaxException {
		//Change the default JSON Resource URI...
		Settings settings = Settings.getInstance();
		settings.getResources().clear();
		settings.getResources().add(new URI("/myresources/vending.json"));
		
		//Change the integer generation settings.
		settings.setMinIntValue(0);
		settings.setMaxIntValue(10);
		
		//Instantiate the JrgenContext...
		jrgenContext = new JrgenContext(settings);
		
		//Register an abstract type with a concrete type...
		jrgenContext
			.getAbstractTypeHandler()
			.registerAbstractType(VendingItem.class, VendingProduct.class);
		
		
		//Initialize the JrgenContext...
		jrgenContext.initalizeContext();
	}
	
	@Test
	public void vendingItemTest() {
		VendingItem v = jrgenContext.generate(VendingItem.class);
		log.info(v);
	}
}
