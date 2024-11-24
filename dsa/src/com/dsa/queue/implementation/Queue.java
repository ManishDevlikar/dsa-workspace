package com.dsa.queue.implementation;

public class Queue {
	public static int[] storage;
	public static int index = 0;
	public static final int DEFAULT_LENGTH = 10;

	public Queue() {
		this(DEFAULT_LENGTH);
	}

	public Queue(int length) {
		this.storage = new int[length];
	}

	public static boolean isFull() {
		return index == storage.length - 1;

	}

	public static boolean isEmpty() throws Exception {
		return index == 0;
	}

	public boolean offer(int data) {
		if (isFull()) {
			return false;
		}
		storage[index++] = data;
		return false;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty");
		}
		int data = storage[0];
		for (int i = 1; i < index; i++) {
			storage[i - 1] = storage[i];
		}
		index--;
		return data;
	}

	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(storage[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Queue queue = new Queue();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.display();
		queue.remove();
		System.out.println("After deletion");
		queue.offer(300);
		queue.display();

	}
}

/*
 * 
 * add(element): Adds an element to the rear of the queue. If the queue is full,
 * it throws an exception.
 * 
 * offer(element): Adds an element to the rear of the queue. If the queue is
 * full, it returns false.
 * 
 * remove(): Removes and returns the element at the front of the queue. If the
 * queue is empty, it throws an exception.
 * 
 * poll(): Removes and returns the element at the front of the queue. If the
 * queue is empty, it returns null.
 * 
 * element(): Returns the element at the front of the queue without removing it.
 * If the queue is empty, it throws an exception.
 * 
 * peek(): Returns the element at the front of the queue without removing it. If
 * the queue is empty, it returns null.
 * 
 * The Queue interface is implemented by several classes in Java, including
 * LinkedList, ArrayDeque, and PriorityQueue. Each of these classes provides
 * different implementations of the queue interface, with different performance
 * characteristics and features.
 * 
 * Overall, the Queue interface is a useful tool for managing collections of
 * elements in a specific order, and is widely used in many different
 * applications and industries.
 * 
 */