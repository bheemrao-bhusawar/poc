package com.app.poc.test;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		List<List<Integer>> childList = new ArrayList<>(); 
		
		int size=4;
		
		
		for(int i=0; i<arr.length;) {
			
			List<Integer> list = new ArrayList<>();
			int count=0;
			for(int j=i; j<arr.length;j++,i++) {
				count++;
				
				
				if(count<=size)
					list.add(arr[j]);
				else {
					//System.out.println("i="+i+",  j="+j);
					break;
				}
			}
			
			childList.add(list);
			
		}

		System.out.println(childList);
		
	}
}
