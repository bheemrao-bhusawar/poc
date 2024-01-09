package com.app.poc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OnlyDublicateList {
	
	public static <T> Set<T> findDublicateList( List<T> list){
		
		//Predicate<T> pred = i -> Collections.frequency(list, i)>1;
		//return list.stream().filter(pred).collect(Collectors.toSet());
		
		//return list.stream().distinct().collect(Collectors.toSet());
		
		
		Predicate<T> pred = i -> Collections.frequency(list, i)>1;
		
		return list.stream().filter(pred).collect(Collectors.toSet());
		
		//return null;
	}
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0,1,2,3,4,3,2,1,5,6,7,8,9,0,2);
		
		System.out.println(findDublicateList(list));
		
		
		
	}
	
	
	

}
