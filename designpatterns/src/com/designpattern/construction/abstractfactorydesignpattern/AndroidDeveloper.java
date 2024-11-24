package com.designpattern.construction.abstractfactorydesignpattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int[] getSal() {
		return new int[] { 10000, 15000, 20000 };
	}

	@Override
	public String[] getSkill() {
		return new String[] { "JAVA", "Kotlin", "Flutter" };
	}

}
