package com.designpattern.structural.Decorator;

public class SugerDecorator extends CoffeeDecorator {

	public SugerDecorator(com.designpattern.structural.Decorator.Coffee Coffee) {
		super(Coffee);
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return super.description() + " suger";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) (super.cost() + 0.5);
	}

}
