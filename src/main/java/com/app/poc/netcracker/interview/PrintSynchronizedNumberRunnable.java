package com.app.poc.netcracker.interview;

public class PrintSynchronizedNumberRunnable implements Runnable {

    int printUpToThis = 10;
    static int counter = 1;
    int remainder;
    static Object lock = new Object();
	
    
	public PrintSynchronizedNumberRunnable(int remainder) {
		super();
		this.remainder = remainder;
	}


	@Override
	public void run() {
		
		while(counter < printUpToThis ) {
			
			synchronized (lock) {
				
				while(counter % 2 != remainder) {
					
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
