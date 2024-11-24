package com.designpattern.behavioral.iterative;

public interface Iterator<T> {
	boolean hasNext();

	T next();

	T remove();
}
