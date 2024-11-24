package com.multithreding.syncronized.intercomm;

public class MyThraedC extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child C start calculating");
			for (int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println("child C trying to give notification");
			this.notify();
		}
	}
}
