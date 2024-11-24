package com.designpattern.construction.abstractfactorydesignpattern;

public class Test {
	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		System.out.println("Required Skills");
		for (String s : e1.getSkill()) {
			System.out.println(s);
		}
		System.out.println("Possible salaries");
		for (int i : e1.getSal()) {
			System.out.println(i);
		}
	}
}
