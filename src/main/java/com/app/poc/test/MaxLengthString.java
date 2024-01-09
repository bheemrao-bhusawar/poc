package com.app.poc.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MaxLengthString {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Bengaluruu","Hyderabad","pune","punepunepunepune");
		
		
		String maxLengthString = "";
		int count = 0;
		
		/*
		 * Map<Integer, String> listTemp = new HashMap<>();
		 * 
		 * list.stream().forEach(str -> {
		 * 
		 * listTemp.put(str.length(), str);
		 * 
		 * });
		 */
		
		//String maxLength = list.stream().reduce( (str1, str2) -> str1.length() > str2.length() ?  str1 : str2).get();
		
		//String maxLength =   list.stream().reduce(  (str1,str2)-> str1.length() > str2.length() ? str1:str2).get();
		
		//System.out.println(maxLength);
		
		
		
		
		 String maxLengthString2 =   list.stream().reduce( (str1,str2)-> str1.length() > str2.length() ? str1:str2 ).get();
		
		 System.out.println("maxLengthString2 : "+maxLengthString2);
		 
		
		/*
		 * for(Integer length: listTemp.keySet()) {
		 * 
		 * if(length > count) {
		 * 
		 * count = length; 
		 * maxLengthString = listTemp.get(length);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("Max length string: "+maxLengthString);
		 */
		
	}

}


//[ "abc", "xyz" ]  // string[] , // longest string pring