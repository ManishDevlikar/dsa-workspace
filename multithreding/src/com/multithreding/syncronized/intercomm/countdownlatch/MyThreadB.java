package com.multithreding.syncronized.intercomm.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThreadB extends Thread {
	private final CountDownLatch LATCH;
	int total = 0;

	public MyThreadB(CountDownLatch latch) {
		this.LATCH = latch;
	}

	@Override
	public void run() {
		System.out.println("child B Starts Calculating");
		for (int i = 0; i < 9; i++) {
			total += i;
		}
		System.out.println("child trying to notify");
		LATCH.countDown();

	}
}
