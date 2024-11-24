package com.multithreding.syncronized.intercomm.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThreadC extends Thread {
	private final CountDownLatch LATCH;
	int total = 0;

	public MyThreadC(CountDownLatch latch) {
		this.LATCH = latch;
	}

	@Override
	public void run() {
		System.out.println("Child C starts calculating");
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println("c trying to notify");
		LATCH.countDown();
	}
}
