package com.app.poc.test;

public class PalendromScore {
	
	public static Boolean isPalendrom(String str) {
		
        char[] ch =  str.toCharArray();
		
		String rev = "";
		
		for(int i = ch.length-1 ; i>=0; i--) {
			
			rev = rev+ch[i];
			
		}
		
		String newStr = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) // if(str.equals(newStr))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		String str = "madam";
		
		if(isPalendrom(str))
			System.out.println("Palendrom");
		else
			System.out.println("Not Palendrom");
		
		String str2 = "madamhTThmadam";
		int score = 0;
		int base = 0;
		
		for(int i=4 ; i<str2.length(); i++, base++) {
			
			String subStr = str2.substring(base, i);
			
			if(subStr.length()==4 && isPalendrom(subStr)) {
				
					score =score+5;
			}
			
			if(i+1 < str2.length()) {
				
				String subStr2 = str2.substring(base,i+1);
				
				if(subStr2.length() == 5 && isPalendrom(subStr2))
					score =score+10;
				
			}
			
		}
		
		System.out.println("Score: "+score);
	}
}

