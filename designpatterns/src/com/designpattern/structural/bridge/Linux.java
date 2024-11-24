package com.designpattern.structural.bridge;

public class Linux implements OperatingSystem {

	@Override
	public void loadFile(String fileName) {
		System.out.println("Loading file " + fileName);

	}

	@Override
	public void playFile() {
		System.out.println("using linux operating system");

	}

}
