package com.designpattern.construction.singletonbreak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		UsingSerializable ob1 = UsingSerializable.getInstance();
		System.out.println(ob1.hashCode());
		UsingSerializable ob2 = UsingSerializable.getInstance();
		System.out.println(ob2.hashCode());

		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		output.writeObject(ob2);
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("abc.ob"));
		UsingSerializable ob3 = (UsingSerializable) input.readObject();
		System.out.println(ob3.hashCode());

		// to prevent this we override readResolve()
	}
}
