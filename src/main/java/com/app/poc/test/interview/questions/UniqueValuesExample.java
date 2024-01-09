package com.app.poc.test.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueValuesExample {

	public static void main(String[] args) {
    
	/*
		List<String> fruits = new ArrayList<>();
		
		  fruits.add("Apple");
	      fruits.add("Orange");
	      fruits.add("Banana");
	      fruits.add("Orange");
	      fruits.add("Mango");
	      fruits.add("Apple");
	      
	     // HashSet<String> dist = new HashSet<>(fruits);
	      //System.out.println(dist);
	      
	      //List<String> dist = fruits.stream().distinct().collect(Collectors.toList());
	      //System.out.println(dist);
	      
	      Set<String> distSet = new HashSet<>(fruits);
	      System.out.println(distSet);
	*/
		/*
		List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		
		System.out.println("Original List : "+list);
		
		List<Integer> subList =  list.subList(3, 9);
		System.out.println("subList:"+subList);
		
		subList.clear();
		System.out.println("subList:"+subList);
		
		System.out.println("Original list:"+list);
		*/
		
		/*
		char[] helloArray = {'h','e','l','l','o'};
		String s = new String(helloArray);
		System.out.println(s);
		*/
		
		Set<Integer> set = new HashSet<>(Arrays.asList(9,4,3,2,4,5,6,3,2,1,3,5));
		System.out.println(set);
		
		//SortedSet<Integer> set2 = new SortedSet<Integer>() {};
		
	}
}
