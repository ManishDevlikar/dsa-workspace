package com.designpattern.behavioral.iterative;

import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {

	private int currentIndex;
	private List<Employee> empList;

	public EmployeeIterator(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public boolean hasNext() {

		return currentIndex < empList.size();
	}

	@Override
	public Employee next() {
		if (!hasNext()) {
			return null;
		}
		return empList.get(currentIndex++);
	}

	@Override
	public Employee remove() {
		if (currentIndex < 0 && currentIndex > empList.size()) {
			throw new IllegalAccessError("No Element Present");
		}
		return empList.remove(--currentIndex);
	}

}
