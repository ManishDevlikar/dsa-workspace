package com.designpattern.construction.abstractfactorydesignpattern;

public class EmployeeFactory {
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.creatEmployee();
	}
}
