package com.app.poc.test;

public interface TestIntegerface {

	 default void defaultTest() {
		
		System.out.println("Hello i am default");
	}
	
	 static void staticTest() {
		System.out.println("Hello i am static");
	}
	
}
