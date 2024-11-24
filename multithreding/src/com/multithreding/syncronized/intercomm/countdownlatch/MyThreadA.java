package com.multithreding.syncronized.intercomm.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThreadA {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch1 = new CountDownLatch(1);
		CountDownLatch latch2 = new CountDownLatch(1);
		MyThreadB b = new MyThreadB(latch1);
		MyThreadC c = new MyThreadC(latch2);

		b.start();
		latch1.await();
		System.out.println("main thread got notification");
		System.out.println(b.total);

		c.start();
		latch2.await();
		System.out.println("main thraed got the notification");
		System.out.println(c.total);
	}
}
