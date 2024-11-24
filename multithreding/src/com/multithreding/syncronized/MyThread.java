package com.multithreding.syncronized;

public class MyThread extends Thread {
	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(this.name);
	}

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "manish");
		MyThread t2 = new MyThread(d, "sunny");
		t1.start();
		t2.start();
	}
}
