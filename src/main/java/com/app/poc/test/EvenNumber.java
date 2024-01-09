package com.app.poc.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args) {
		
		Integer[] nums = {2,3,4,5,6,7,8,9};
		
		Function<Integer, Integer> fun = i-> i*i;
		
		List<Integer> intList =  Arrays.asList(nums);	
		
		//intList.stream().map(fun).forEach(System.out::println);
		
		Predicate<Integer> pred = i-> i%2==0;
		
		intList.stream().filter(pred).forEach(System.out::println);
		
	}
	
}
