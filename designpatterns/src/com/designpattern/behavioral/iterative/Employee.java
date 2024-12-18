package com.designpattern.behavioral.iterative;

public class Employee {
	private int empId;
	private String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

}
