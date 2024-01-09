package com.app.poc.netcracker.interview;

public class PrintSequenceRunnable2 implements Runnable {

	private int remainder;
	private int max_number_print=10;
	
	static int counter=1;
	static Object lock = new Object();
	
	
	
	public PrintSequenceRunnable2(int remainder) {
		super();
		this.remainder = remainder;
	}



	@Override
	public void run() {

		while(counter < max_number_print) {
			
			synchronized (lock) {
				
				while(counter % 2 !=remainder) {
					
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				System.out.println(Thread.currentThread().getName()+" : "+counter);
				counter++;
				lock.notifyAll();
				
			}
			
		}
		
	}

}
