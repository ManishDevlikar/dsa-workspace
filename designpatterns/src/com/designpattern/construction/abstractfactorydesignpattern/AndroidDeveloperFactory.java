package com.designpattern.construction.abstractfactorydesignpattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee creatEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
