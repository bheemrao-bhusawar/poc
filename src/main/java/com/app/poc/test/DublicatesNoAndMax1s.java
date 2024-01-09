package com.app.poc.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class DublicatesNoAndMax1s {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,0,0,1,0,1,1,0,1,1,1,0,0,1);
		
		//Predicate<Integer> pred = i-> Collections.frequency(list, i)>1 ;
		
		Predicate<Integer> pred = i-> Collections.frequency(list, i)>1 ? false:true;
		
		list.stream().filter(pred).distinct().forEach(System.out::println);
		
		//print max frequency element
		
		int max=0;
		int count=0;
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)==1)
				count++;
			else
				count=0;
			
			max = Math.max(max, count);
			
		}
		

		System.out.println("Max Frequency for same no:"+max);
		
	}

}
