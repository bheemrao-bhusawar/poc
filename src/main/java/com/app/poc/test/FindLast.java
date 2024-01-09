package com.app.poc.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindLast {
	
	public static <T>  T findLastElement(List<T> list ) {
		
		//return list.stream().reduce(  (first,second) -> second).orElse(null);
		//return list.stream().skip(list.size()-1).findFirst().orElse(null);
	
		//return list.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null);
	
		//sort and find out 3rd max or first max
		//List<T> descList =  list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		//System.out.println(descList.get(2));
		
		//Integer max =  list.stream().distinct().sorted(Collections.reverseOrder()).mapToInt( i -> i).max().getAsInt();
		//System.out.println("max : "+max);
		
		return list.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null);
		
		//return list.stream().sorted(Collections.reverseOrder()).mapToInt(i->i).max().getAsInt();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,5);
		System.out.println(findLastElement(list));
	}
}
