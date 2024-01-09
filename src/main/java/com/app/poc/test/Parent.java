package com.app.poc.test;

public class Parent {

	 int x = 10;

	public Parent() {
		printX();
		x = 20;
	}

	public void printX() {
		System.out.println("X: " + x);
	}

}
