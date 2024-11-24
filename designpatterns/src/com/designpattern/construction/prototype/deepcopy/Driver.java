package com.designpattern.construction.prototype.deepcopy;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee1 = new Employee();
		employee1.setEmpLoc("thane");
		employee1.setName("manish");
		Designation SDE = new Designation();
		SDE.setDepId(101);
		SDE.setName("SDE");
		Designation JFD = new Designation();
		JFD.setDepId(102);
		JFD.setName("JFD");
		employee1.setDesignation(SDE);
		Employee employee2 = (Employee) employee1.clone();
		System.out.println("emp1->" + employee1);
		employee1.getDesignation().setName("AI");
		System.out.println("emp2->" + employee2);
	}
}
