package com.designpattern.construction.abstractfactorydesignpattern;

public class WebDeveloper implements Employee {

	@Override
	public int[] getSal() {
		return new int[] { 20000, 15000, 25000 };
	}

	@Override
	public String[] getSkill() {
		return new String[] { "JS", "React" };
	}

}
