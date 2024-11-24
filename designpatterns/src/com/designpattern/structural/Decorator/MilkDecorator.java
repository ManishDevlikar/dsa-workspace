package com.designpattern.structural.Decorator;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(com.designpattern.structural.Decorator.Coffee Coffee) {
		super(Coffee);
	}

	@Override
	public String description() {
		return super.description() + " milk";
	}

	@Override
	public float cost() {

		return (float) (super.cost() + 0.5);
	}

}
