package com.multithreding.syncronized;

public class Display {
	public synchronized void display(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("iteration :" + i + name);
		}
	}

	public synchronized void display() {
		for (int i = 0; i < 5; i++) {
			System.out.println((char) 67 + i);
		}
	}
}
