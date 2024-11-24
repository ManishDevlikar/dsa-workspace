package com.designpattern.structural.Decorator;

public class SimpleCoffie implements Coffee {

	@Override
	public String description() {
		return "coffie with ";
	}

	@Override
	public float cost() {
		return 1;
	}

}
