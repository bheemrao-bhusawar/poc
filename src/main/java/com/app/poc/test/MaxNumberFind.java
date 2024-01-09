package com.app.poc.test;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberFind {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		int n=20;
		
		for(int i=1; i<=n; i++) {
			
			if(i%3==0 && i%5==0)
				list.add("FizzBuzz");
			else if(i%3==0)
				list.add("Fizz");
			else if(i%5==0)
				list.add("Buzz");
			else
				list.add(Integer.toString(i));
		}
		
		System.out.println(list);
		
	}
}

//TC:O(n), SC: O(n)




