package com.designpattern.structural.facade;

public class Amplifier {
	public void on() {
		System.out.println("Amplifier is on.");
	}

	public void off() {
		System.out.println("Amplifier is off.");
	}

	public void setVolume(int level) {
		System.out.println("Amplifier volume set to " + level);
	}
}
