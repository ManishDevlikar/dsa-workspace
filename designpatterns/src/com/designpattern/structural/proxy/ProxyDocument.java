package com.designpattern.structural.proxy;

public class ProxyDocument implements Document {

	private String fileName;
	private RealDocument document;

	public ProxyDocument(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void read() {
		if (document == null) {
			document = new RealDocument(fileName);
		}
		document.read();
	}

}
