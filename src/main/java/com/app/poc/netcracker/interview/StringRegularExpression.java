package com.app.poc.netcracker.interview;

public class StringRegularExpression {

	public static void main(String[] args) {

		String originalStr = "BheemRao is employee of Cordis company, BHEEMRAO is from Bangalore, BHEEMRAO! is good in java.";
		
		originalStr = originalStr.replaceAll("[^a-zA-Z\s]", "");
		
		System.out.println(originalStr);
		
	}
}
