package com.designpattern.behavioral.iterative;

import java.util.List;

public class Company implements Aggregate<Employee> {
	List<Employee> empList;

	public Company(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public Iterator<Employee> createIterator() {
		return new EmployeeIterator(empList);
	}

}
