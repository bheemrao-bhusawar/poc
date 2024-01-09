package com.app.poc.test.singleton.design.pattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable,Cloneable{
	
	private static final long serialVersionUID = -1090188085669083020L;

	private SerializedSingleton() {}
	
	private static class SingletonHelper {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return SingletonHelper.INSTANCE;
	}
	
	public Object readResolve() {
		return SingletonHelper.INSTANCE;
	}
	
}
