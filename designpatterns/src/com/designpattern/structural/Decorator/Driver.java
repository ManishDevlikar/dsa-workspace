package com.designpattern.structural.Decorator;

public class Driver {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffie();
		coffee = new MilkDecorator(coffee);

		System.out.println(coffee.description());
	}
}
