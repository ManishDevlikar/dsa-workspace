package com.designpattern.construction.singletonbreak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneTest {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		Clonning clon1 = Clonning.getInstatnce();
		System.out.println(clon1.hashCode());
		Clonning clon2 = Clonning.getInstatnce();
		System.out.println(clon2.hashCode());

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ab.ob"));
		out.writeObject(clon2);

		ObjectInputStream inp = new ObjectInputStream(new FileInputStream("ab.ob"));
		Clonning clon3 = (Clonning) inp.readObject();
		try {

			System.out.println(clon3.hashCode());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		Clonning clon4 = (Clonning) clon3.clone();
		System.out.println(clon4.hashCode());
	}
}
