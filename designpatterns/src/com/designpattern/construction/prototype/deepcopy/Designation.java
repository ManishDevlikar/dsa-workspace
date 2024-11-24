package com.designpattern.construction.prototype.deepcopy;

public class Designation implements Cloneable {
	private int depId;
	private String name;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Designation designation = new Designation();
		designation.setDepId(depId);
		designation.setName(name);
		return designation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dep_Id: " + depId + " Dep_Name: " + name;
	}

}
