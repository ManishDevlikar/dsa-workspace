package com.multithreding.syncronized.intercomm;

public class MyThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child B thraed start calculating");
			for (int i = 0; i < 10; i++) {
				total += i;
			}
			System.out.println("child B thraed trynig to give notification");
			this.notify();
		}
	}

}
