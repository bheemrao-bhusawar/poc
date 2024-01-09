package com.app.poc.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                 .filter(n -> n % 2 != 0)
		                 .mapToInt(n -> n)
		                 .sum();
		System.out.println(sum);
		
		List<Integer> list = Arrays.asList(5,6,7,8,9);
		
	    //int sum2  = list.stream().mapToInt(n -> n).min().getAsInt();
		
		int sum2  = list.stream().mapToInt(n -> n).max().getAsInt();
		
		int max = list.stream().mapToInt(n->n).min().getAsInt();
		System.out.println("Min : "+max);
		
		System.out.println(sum2);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer maxNum = list2.stream().mapToInt(i->i).max().getAsInt();
		Integer minNum = list2.stream().mapToInt( i -> i).min().getAsInt();
		Double avg = list2.stream().mapToInt( i -> i).average().getAsDouble();
		
		Integer sumValue = list2.stream().mapToInt( i -> i).sum();
		
		List<Integer> descOrderList = list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("max : "+maxNum);
		System.out.println("min : "+minNum);
		System.out.println("Avg : "+avg);
		System.out.println("sum value : "+sumValue);
		System.out.println("Desc Order List : "+descOrderList);
		
		
		
	}
}
