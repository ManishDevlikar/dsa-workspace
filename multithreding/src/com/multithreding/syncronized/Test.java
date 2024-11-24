package com.multithreding.syncronized;

public class Test {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d, "anna");
		t1.start();
		t2.start();
	}
}
