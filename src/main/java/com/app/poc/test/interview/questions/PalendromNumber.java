package com.app.poc.test.interview.questions;

public class PalendromNumber {

	public static void main(String[] args) {
		
		Integer n = 121;
		
		int rev = 0;
		int remainder = 0;
		
		int originalNum = n;
		int sum=0;
		
		while(n>0) {
			
			remainder = n%10;
			
			rev = rev*10 + remainder;
			
			sum += remainder;
			
			n = n/10;
		}
		
		System.out.println("Original number: "+originalNum);
		System.out.println("reversed number: "+rev);
		System.out.println("sum of the digits : "+sum);
		
		if(rev == originalNum)
			System.out.println(originalNum+ " is a palendrom number");
		else
			System.out.println(originalNum+ " is not a palendrom number");
		
	}
}




//integer: 123
//result: 321


//
