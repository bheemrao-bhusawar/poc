package com.app.poc.netcracker.interview;

import java.util.Arrays;

public class MaxPrefixString {

	public static void main(String[] args) {
		
		String[] arr = { "abcgf","abcgfk" };
		System.out.println(getMaxPrefix(arr));
		
	}
	
	public static String getMaxPrefix(String[] strArr) {
		
		String result="";
		
		int size = strArr.length;
		
		if(size == 0)
		return	result;
		
		if(size == 1)
			return strArr[0];
		
		Arrays.sort(strArr);
		
		int i=0;
		
		int end = Math.min(strArr[0].length(), strArr[size-1].length());
		
		while(i<end && strArr[0].charAt(i) == strArr[size-1].charAt(i)) {
			System.out.println(strArr[0].charAt(i)+"-------------"+strArr[size-1].charAt(i));
			i++;
			
		}
		
		result = strArr[0].substring(0,i);
		
		return result;
	}
	
}