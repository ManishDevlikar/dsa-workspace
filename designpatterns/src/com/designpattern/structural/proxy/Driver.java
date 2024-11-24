package com.designpattern.structural.proxy;

public class Driver {
	public static void main(String[] args) {
		Document resume = new ProxyDocument("resume.pdf");
		resume.read();
		resume.read();
	}
}
