package com.designpattern.structural.Decorator;

public abstract class CoffeeDecorator implements Coffee {
	Coffee Coffee;

	public CoffeeDecorator(Coffee Coffee) {
		this.Coffee = Coffee;
	}

	@Override
	public String description() {
		return Coffee.description();
	}

	@Override
	public float cost() {
		return Coffee.cost();
	}

}
