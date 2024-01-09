package com.app.poc.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class EvenOrOddNumSum {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Predicate<Integer> pred = i->i%2!=0;
		
		int evenSum = list.stream().filter(pred).mapToInt(i -> i).sum();
		
		System.out.println("Even Number Sum : "+evenSum);
		
		Function<Integer, Integer> fun = i-> i%2==0 ? 2*i:i;
		
		list.stream().map(fun).forEach(System.out::println);
		
		
		//Print Map into string format
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(20, 2);
		map.put(24, 1);
		map.put(25, 1);
		map.put(30, 2);
				
		System.out.println(map.toString());
		

	}

}
