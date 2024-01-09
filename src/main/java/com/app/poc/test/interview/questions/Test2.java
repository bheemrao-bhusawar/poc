package com.app.poc.test.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(49);
		list.add(25);
		list.add(98);
		list.add(98);
		list.add(32);
		list.add(15);
		
		list.stream().filter(no -> no>30).sorted().forEach(System.out::println);
		
		List<Integer> newList = list.stream().filter( no -> no%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		List<Integer> sortedList = newList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		newList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("***************start with 1 **************");
		newList.stream().filter(no -> no.toString().startsWith("1")).forEach(System.out::println);
		
		
		Integer[] intArr = new Integer[] {50,30,28,40,48,21,10,11};
		
		System.out.println("*************EVEN Number **********");
		Stream.of(intArr).filter(no -> no%2!=0).forEach(System.out::println);
		
		String[] newArray = "I am 24 years old and I want to be in tier I Company".split(" ");
		
		
		Stream.of(newArray).filter( str -> str.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);
		
		Stream.of(newArray).filter(str -> str.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);
		
		
		Stream.of(newArray).filter(str -> str.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);
		
		System.out.println("****************starting vovels printing words");
		Stream.of(newArray).filter(str -> str.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);
		
		
		List<String> newStrList = Arrays.asList("Hello","How","are","you","how","you","doing");
		
		System.out.println("**********Sequential stream**********");
		newStrList.stream().forEach(System.out::println);
		
		System.out.println("***********parallel Stream***************");
		
		newStrList.parallelStream().forEach(System.out::println);
		
		
		Integer[] newNumbers = {1,2,3,4,5,6,7,8,9};
		
		Long count = Arrays.stream(newNumbers).filter(x->x%3==0).count();
		
		System.out.println(count);
		
		System.out.println("*****************4 factor numbers***********************");
		
		Integer[] intArr3 = {1,2,3,4,5,6,7,8,9};
		
		long count2 = Arrays.stream(intArr3).filter(x -> x%4 == 0).count();
		
		System.out.println(count2);
		
		
		System.out.println("************2 factors and > 20");
		
		list.stream().filter( no -> no%2==0).filter(no -> no>20).forEach(System.out::println);
		
		
		System.out.println("******************distinct *****************");
		
		List<Integer> newList2 =  list.stream().distinct().collect(Collectors.toList());
	    
		System.out.println("distinct : "+newList2);
		
		List<Integer> list2 =  list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("sorted:"+list2);

		
		double str[] = {20,30,40,58,50,60,48};
		
		Arrays.stream(str).filter(x -> x%2==0).filter(x -> x>50).forEach(System.out::println);
		
		
	}

}
