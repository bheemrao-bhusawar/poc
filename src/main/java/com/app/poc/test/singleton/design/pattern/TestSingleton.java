package com.app.poc.test.singleton.design.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {

		SerializedSingleton one = SerializedSingleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		
		out.writeObject(one);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		
		SerializedSingleton two = (SerializedSingleton) in.readObject();
		in.close();
		
		System.out.println("one : "+one.hashCode());
		System.out.println("two : "+two.hashCode());
		
		System.out.println("clone one : "+one.clone().hashCode());
		System.out.println("clone two : "+two.clone().hashCode());
		
	}
}
