package com.designpattern.construction.factorydesignpattern;

public class Test {
	public static void main(String[] args) {
		Student s1 = StudentFactory.getStudent("CS");
		s1.getCourse();
		Student s2 = StudentFactory.getStudent("ME");
		s2.getCourse();
	}
}
