package com.designpattern.construction.builder;

public class Driver {
	public static void main(String[] args) {
		Student manish = new Student.StudentBuilder().setName("manish").setRank(1).setRollNo(07)
				.setEmail("manish.devlikar5003@gmail.com").setCourceName("CSE").build();

		System.out.println(manish.getCourceName());
	}

}
