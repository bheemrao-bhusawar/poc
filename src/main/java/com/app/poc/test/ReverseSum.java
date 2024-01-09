package com.app.poc.test;

public class ReverseSum {

	public static void main(String[] args) {
		
		int num = 253;
		
		int rev=0, sum=0;
		
		do {
			
			int rem = num%10;
			rev = rev*10+rem;
			sum = sum+rem;
			num = num/10;
			
		}while(num>0);
		
		if(rev > 0) {
			System.out.println("rev : "+rev);
		    System.out.println("sum : "+sum);
		}

	}

}
