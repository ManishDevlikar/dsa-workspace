package com.multithreding.syncronized.intercomm;

public class MyThreadA {
	public static void main(String[] args) throws InterruptedException {
		MyThreadB b = new MyThreadB();
		MyThraedC c = new MyThraedC();
		b.start();
		synchronized (b) {
			System.out.println("main thread trying to call wait()");
			b.wait();
			System.out.println("main thread got notification");
			System.out.println(b.total);
		}
		c.start();
		synchronized (c) {
			System.out.println("main thread trying to call wait()");
			c.wait();

			System.out.println("main thread got notification");
			System.out.println(c.total);
		}
	}
}
