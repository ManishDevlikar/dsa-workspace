package com.practice;

import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Priority {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(1);
		q.add(0);
		q.add(9);
		q.add(8);
//		q.forEach(System.out::println);

//		while (!q.isEmpty()) {
//			System.out.println(q.remove());
//		}

		Stream.generate(q::poll).takeWhile(item -> item != null).forEach(System.out::println);
	}
}
