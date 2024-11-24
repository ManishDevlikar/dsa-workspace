package com.designpattern.behavioral.iterative;

import java.util.LinkedList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(1, "manish"));
		list.add(new Employee(2, "sunny"));
		list.add(new Employee(3, "raj"));
		list.add(new Employee(4, "kushank"));
		list.add(new Employee(5, "khush"));

		Company company = new Company(list);

		Iterator<Employee> iter = company.createIterator();

		while (iter.hasNext()) {

			Employee employee = iter.next();
			if (employee.getName().equals("manish")) {
				iter.remove();
			} else {
				System.out.println(employee.getName());
			}

		}

	}
}
