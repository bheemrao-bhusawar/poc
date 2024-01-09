package com.app.poc.test.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

	}

	
	/*
	public int[] twoSum1(int[] nums, int target) {
		
		HashMap<Integer, Integer> preComputed = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (preComputed.containsKey(target - nums[i])) {
				
				return new int[] { preComputed.get(target - nums[i]), i };
				
			}
			
			preComputed.put(nums[i], i);
			
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}
	*/
	
	
	public int[] twoSum(int[] nums,int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length;i++) {
			
			if(map.containsKey(target-nums[i]))
				return new int[] {map.get(target-nums[i]) ,i};
			
			map.put(nums[i], i);
			
		}
		
		throw new IllegalArgumentException("No two sum solution");
		
	}
	

}
