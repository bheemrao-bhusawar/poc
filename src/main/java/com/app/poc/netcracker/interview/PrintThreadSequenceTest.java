package com.app.poc.netcracker.interview;

public class PrintThreadSequenceTest {

	public static void main(String[] args) {
		
		PrintSequenceRunnable2 runnable1 = new PrintSequenceRunnable2(1);
		PrintSequenceRunnable2 runnable2 = new PrintSequenceRunnable2(0);
		
		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		
		t1.start();
		t2.start();
		
		
	}
}
