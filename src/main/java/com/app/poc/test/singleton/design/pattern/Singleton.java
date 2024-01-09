package com.app.poc.test.singleton.design.pattern;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 2153655962778740860L;

	private Singleton() {
	};

	private static class SingletonHelper {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return SingletonHelper.INSTANCE;
	}

	private Object readResolve() {
		return SingletonHelper.INSTANCE;
	}

}
