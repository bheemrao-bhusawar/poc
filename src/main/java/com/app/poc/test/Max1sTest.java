package com.app.poc.test;

import java.util.ArrayList;
import java.util.List;

public class Max1sTest {
	
	private static final  List<String> list = new ArrayList<>();
    
	public static void main(String[] args) {
	
		int[] nums =  {1,0,1,0,0,1,1};
		
	
		int count = 0;
		int max = 0;
		
		for(int num : nums) {
			
			if(num == 1)
				count++;
			else count=0;
			
			max = Math.max(count, max);
			
		}
		
		System.out.println("maximum 1s : "+max);
		
	}

}
