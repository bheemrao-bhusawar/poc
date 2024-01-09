package com.app.poc.test.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		
		  //List<Integer> numList = new ArrayList<>();
	      //numList.add(78);
	      //numList.add(10);
	      //Function<Integer, Integer> fun = i -> i / 2;
	      //numList.stream().map(fun).forEach(System.out::println);
	      
	      
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(12);
		list.add(15);
		list.add(18);
		
		Function<Integer, Integer> fun = i -> i/5;
		
		list.stream().map(fun).forEach(System.out::println);
	    
		System.out.println("***************************************");
		
		Predicate<Integer> pred = i -> i%2==0;
		
		list.stream().filter(pred).forEach(System.out::println);
		
	}
	
	
	// kafka.server:192.168.1.33:9092
	// kafka.consumer.group: "vca"
	// kafka.consumer.poll.size: 5M
	// kafka.consumer.auto.commit:true
	
	
	
	//Write query to pull non-null values in one column?
			
	//		Student:
		//		cols: id  name  dept (ECE,CSE);
	
	
	
//select * from student st where st.dept is not null;
	
	//select * from student st where st.dept is null;
	
	//select count(*) noOfStudents from student st ;
	

}
