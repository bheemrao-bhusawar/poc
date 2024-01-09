package com.app.poc.test.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringApp {
	
	 /*public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        
	        if (n == 0) return 0;
	        
	        Map<Character, Integer> map = new HashMap< Character, Integer > ();
	        int maxLength = 0;
	        int currentLength = 0;
	        for (int i = 0 , start = 0; i < n; ++i) {
	            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) {
	                start = map.get(s.charAt(i)) + 1;
	            }
	            
	            map.put(s.charAt(i), i);
	            currentLength = i - start + 1;
	            maxLength = Math.max(currentLength, maxLength);
	        }
	        return maxLength;
	    }*/
	
	
	
	 
	 
	
	public static void main(String[] args) {
		
		System.out.println(longestSubStringLength("abcabcbb"));

	}
	
	/*
	public static int lengthOfLongestSubstring(String s) {
		
		int n = s.length();
		
		if(n == 0)
			return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int maxLength=0;
		int currentLength=0;
		
		for(int i=0, start=0; i<n; i++) {
			
			if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start ) {
				start = map.get(s.charAt(i)) + 1;
			}
			
			map.put(s.charAt(i),i);
			
			currentLength = i-start+1;
			
			maxLength = Math.max(maxLength, currentLength);
		}
		
		return maxLength;
	}*/
	
	
	public static int longestSubStringLength(String s) {
		
		int n = s.length();
		
		if(n==0) return 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		int maxLength=0;
		int currentLength=0;
		
		for(int i=0,start=0; i<n; i++) {
			
			if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) {
				start = map.get(s.charAt(i))+1;
			}
			
			map.put(s.charAt(i), i);
			currentLength = i-start +1;
			
			maxLength = Math.max(maxLength, currentLength);
			
		}
		
		return maxLength;
	}

}
