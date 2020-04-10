/**
 * 
 */
package com.arvind.service.impl;

import com.arvind.service.GreetingsService;

/**
 * @author Akrishnan37
 *
 */
public class GreetingsServiceImpl implements GreetingsService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}
}
