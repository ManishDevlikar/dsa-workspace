package com.designpattern.construction.factorydesignpattern;

public class StudentFactory {

	public static Student getStudent(String courseName) {
		if (courseName.trim().equalsIgnoreCase("ME")) {
			return new MEStudent();
		} else if (courseName.trim().equalsIgnoreCase("CS")) {
			return new CSStudent();
		} else {
			return null;
		}
	}
}
