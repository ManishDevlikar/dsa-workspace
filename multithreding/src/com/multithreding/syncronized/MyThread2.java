package com.multithreding.syncronized;

public class MyThread2 extends Thread {
	Display d;
	String name;

	public MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}
