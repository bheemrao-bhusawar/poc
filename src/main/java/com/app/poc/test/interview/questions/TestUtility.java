package com.app.poc.test.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class TestUtility<T> {

	public List<T> findDistinct( List<T> a, List<T> b){
		
		List<T> distinctList = new ArrayList<>();
		
		distinctList.addAll(a);
		
		for( T element : b ) {
			
			if(distinctList.contains(element))
				distinctList.remove(element);
			else
				distinctList.add(element);
		}
		
		return distinctList;
	}
}
