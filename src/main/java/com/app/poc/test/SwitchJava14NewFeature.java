package com.app.poc.test;

public class SwitchJava14NewFeature {

	public static void main(String[] args) {

		final String SUNDAY="SUNDAY";
		final String MONDAY="MONDAY";
		final String TUESDAY="TUESDAY";
		final String WEDNESDAY="WEDNESDAY";
		
		int a = switch(WEDNESDAY) {
		
		case SUNDAY,MONDAY,TUESDAY 	-> 1;
		case WEDNESDAY 				-> 2;
		
		default -> 0;
		
		};
		
		System.out.println(a);
		
	}

}
