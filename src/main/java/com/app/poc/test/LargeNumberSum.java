package com.app.poc.test;

public class LargeNumberSum {

	public static void main(String[] args) {

		System.out.println(add("2000", "108090"));
		
	}
	
	
	public static String add(String str1, String str2) {
		
		String result = "";
		
		if(str1.length() > str2.length()) {
			
			String temp = str2;
			str2 = str1;
			str1=temp;
			
		}
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		
		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();
		
		int carry = 0;
		
		for(int i=0;i<n1;i++) {
			
			//System.out.println((int)str1.charAt(i)+"------------>"+ (int)'0' +"="  + ( str1.charAt(i)-'0' ));
			
			
			int sum = (str1.charAt(i)-'0') + (str2.charAt(i)-'0')+carry ;
			
			//System.out.println(sum+"------------->"+(char)(sum%10+'0'));
			result += (char)(sum%10+'0');
			
			carry = sum/10;
			
		}
		
		for(int i=n1; i<n2;i++) {
			
			int sum = (str2.charAt(i)-'0')+carry;
			
			result += (char)(sum%10+'0');
			
			carry = sum/10;
			
		}
		
		if(carry>0) {
			result += (char)(carry+'0');
		}
		
		result = new StringBuilder(result).reverse().toString();
		
		return result;
		
	}

}


