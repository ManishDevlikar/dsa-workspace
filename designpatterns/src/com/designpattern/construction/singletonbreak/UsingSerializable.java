package com.designpattern.construction.singletonbreak;

import java.io.Serializable;

public class UsingSerializable implements Serializable {

	private static UsingSerializable serilize = null;

	private UsingSerializable() {
		// TODO Auto-generated constructor stub
	}

	public static UsingSerializable getInstance() {

		if (serilize == null) {
			synchronized (UsingSerializable.class) {
				if (serilize == null) {
					serilize = new UsingSerializable();
				}
			}
		}
		return serilize;
	}

	public Object readResolve() {
		return serilize;
	}

}
