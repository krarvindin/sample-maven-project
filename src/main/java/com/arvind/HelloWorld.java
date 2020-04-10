/**
 * 
 */
package com.arvind;

import com.arvind.service.GreetingsService;
import com.arvind.service.impl.GreetingsServiceImpl;

/**
 * @author Akrishnan37
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		
		GreetingsService greetingsService = new GreetingsServiceImpl();
		System.out.println(greetingsService.sayHello("Arvind"));
	}
}
