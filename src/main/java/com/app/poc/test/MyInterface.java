package com.app.poc.test;

public interface MyInterface {
	int x = 5;

	default void printX() {
		System.out.println("X: " + x);
	}
}
