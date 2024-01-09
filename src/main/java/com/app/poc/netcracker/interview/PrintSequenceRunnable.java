package com.app.poc.netcracker.interview;

public class PrintSequenceRunnable implements Runnable {

	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	PrintSequenceRunnable(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		
		while (number < PRINT_NUMBERS_UPTO) {
			synchronized (lock) {
				
				while (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
		
	}
	
}