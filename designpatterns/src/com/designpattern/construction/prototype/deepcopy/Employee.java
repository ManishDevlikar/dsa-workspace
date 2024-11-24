package com.designpattern.construction.prototype.deepcopy;

public class Employee implements Cloneable {
	private String loc;
	private String name;
	private Designation designation;

	public String getEmpId() {
		return loc;
	}

	public void setEmpLoc(String loc) {
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		clone.designation = (Designation) designation.clone();
		return clone;
	}

	@Override
	public String toString() {

		return "Emp_Name: " + name + " Emp_Loc: " + loc + " Designation: " + designation;
	}

}
