package com.designpattern.behavioral.iterative;

public interface Aggregate<T> {
	Iterator<T> createIterator();
}
