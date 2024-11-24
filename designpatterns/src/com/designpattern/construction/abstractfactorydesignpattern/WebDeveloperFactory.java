package com.designpattern.construction.abstractfactorydesignpattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee creatEmployee() {
		return new WebDeveloper();
	}

}
