package com.app.poc.netcracker.interview;

public class BestPractice {

	public static void main(String[] args) {
		
		LRUMap<Integer, String> lruMap = new LRUMap<>(2);
		
		lruMap.put(1, "A");
		lruMap.put(2, "B");
		lruMap.get(1);
		
		lruMap.display();  //  {1=A,2=B,}
		
		lruMap.put(3, "C");
		
		lruMap.display();  //{3=C,1=A,}
	}
}

/*
data structure of N capacity with LRU(Least recently used) mechanism

ex: datastructure of capacity 2
.put(1, A); // {1=A}
.put(2, B); // {1=A, 2=B}
.get(1);    // return A
.put(3, C); // LRU key was 2, key 2 is removed,{1=A, 3=C}
.get(2);    // if not found,returns null 
.put(4, D)  // LRU key was 1, key 1 is removed , {4=D, 3=C}
.get(3);    // return C

*/

