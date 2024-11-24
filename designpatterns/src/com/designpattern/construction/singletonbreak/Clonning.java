package com.designpattern.construction.singletonbreak;

import java.io.Serializable;

public class Clonning implements Serializable, Cloneable {
	private static Clonning clonning = null;

	private Clonning() {

	}

	public static Clonning getInstatnce() {
		if (clonning == null) {
			synchronized (Clonning.class) {
				if (clonning == null) {
					clonning = new Clonning();
				}
			}
		}
		return clonning;
	}

	public Object readResolve() {
		return clonning;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return clonning;
	}
}
