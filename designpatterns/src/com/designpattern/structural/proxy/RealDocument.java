package com.designpattern.structural.proxy;

public class RealDocument implements Document {
	private String fileName;

	public RealDocument(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading document " + fileName + " form disk");
	}

	@Override
	public void read() {
		System.out.println("Reading Document " + fileName);
	}

}
