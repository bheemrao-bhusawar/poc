package com.app.poc.test;

public class EvenDigitNumbers {

	public static void main(String[] args) {

		int[] nums = {12,345,2,6,7896};
		
		int count=0;
		
		for(int num : nums) {
			
			if(String.valueOf(num).length()%2 == 0)
				count++;
			
		}
		
		System.out.println("event number of digits: "+count);
	}
}
