package com.designpattern.structural.bridge;

public class Windows implements OperatingSystem {

	@Override
	public void loadFile(String fileName) {
		System.out.println("Loading the file " + fileName);

	}

	@Override
	public void playFile() {
		System.out.println("playing file using windows");

	}

}
