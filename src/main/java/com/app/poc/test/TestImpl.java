package com.app.poc.test;

public class TestImpl implements TestIntegerface{

	
	public static void main(String[] args) {
	
		TestIntegerface ti = new TestImpl();
		ti.defaultTest();
		TestIntegerface.staticTest();

	}

}
