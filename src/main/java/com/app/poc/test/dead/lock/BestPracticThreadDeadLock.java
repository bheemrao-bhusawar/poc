package com.app.poc.test.dead.lock;

public class BestPracticThreadDeadLock {

	public static void main(String[] args) {

		Productvo lock1 = new Productvo("Orange", 20.5);
		Productvo lock2 = new Productvo("Orange", 20.5);

		Thread t1 =  new Thread( new Runnable() {

			@Override
			public void run() {
				
				synchronized (lock1) {
					
					System.out.println("holding lock1");
					
					System.out.println("Waiting for lock2");
					
					synchronized (lock2) {
						
						System.out.println("got the lock1 and lock 2");
					}
					
				}
				
			}
		});
		
		Thread t2 =  new Thread(  new Runnable() {

			@Override
			public void run() {

				synchronized (lock2) {
					
					System.out.println("holding lock2..");
					
					System.out.println("waiting for lock 1");
					
					synchronized (lock1) {
						System.out.println("Got the lock 1 and 2");
						
					}
					
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
