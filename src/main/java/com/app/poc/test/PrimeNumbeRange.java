package com.app.poc.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbeRange {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		int range = 100;
		
		for(int n=1; n<=range; n++) {
			
			int count=0;
			for(int i=1;i<=n;i++) {
				
				if(n%i==0)
					count++;
			}
			
			if(count==2)
				list.add(n);
		}
		
		System.out.println("List:"+list);
		
	}
	
}

