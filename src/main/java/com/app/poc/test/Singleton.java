package com.app.poc.test;

/*public class Singleton {

	private static Singleton obj;
	
	private Singleton() {};
	
	public static synchronized Singleton getInstance() {
		
		if(obj == null)
			obj = new Singleton();
		
		return obj;
		
	}
	
}
*/

/*
public class Singleton {
	
	private static Singleton obj = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return obj;
	}
	
} */

/*
public class Singleton {
	
	private static volatile Singleton obj = null;
	
	private Singleton() {}
	
	private static Singleton getInstance() {
		
		if(obj == null) {
			
			synchronized (Singleton.class) {
				
				if(obj==null)
					obj = new Singleton();
				
			}
			
		}
		
		return obj;
	}
	
}
*/

public class Singleton{
	
	private static volatile Singleton obj = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(obj == null) {
			
			synchronized (Singleton.class) {
				
				if(obj==null)
					obj=new Singleton();
				
			}
			
		}
		
		return obj;
	}
	
}