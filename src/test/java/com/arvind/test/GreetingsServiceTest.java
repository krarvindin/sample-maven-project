/**
 * 
 */
package com.arvind.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.arvind.service.GreetingsService;
import com.arvind.service.impl.GreetingsServiceImpl;

/**
 * @author Akrishnan37
 *
 */
public class GreetingsServiceTest {

	@Test
	public void testSayHello() {
		
		GreetingsService greetingsService = new GreetingsServiceImpl();
		String actual = greetingsService.sayHello("Karthic");
		String expected = "Hello, Karthic";
		assertEquals(actual, expected);
	}
}
