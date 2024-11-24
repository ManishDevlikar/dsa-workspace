package com.dsa.queue.implementation;

public class CircularQueue {
	public static int[] storage;
	public static final int DEFAULT_SIZE = 10;
	public static int front = 0;
	public static int end = 0;
	public static int size = 0;

	public CircularQueue() {
		this(DEFAULT_SIZE);
	}

	public CircularQueue(int size) {
		this.storage = new int[size];
	}

	public static boolean isFull() {
		return size == storage.length + 1;
	}

	public static boolean isEmpty() {
		return size == 0;
	}

	public boolean offer(int data) {
		if (isFull()) {

			return false;
		}
		storage[end++] = data;
		end = end % storage.length;
		size++;
		return true;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int data = storage[front++];
		front = front % storage.length;
		size--;
		return data;
	}

	public void display() {
		if (isFull()) {
			System.out.println("full");
			return;
		}
		int i = front;
		do {
			System.out.println(storage[i]);
			i++;
			i %= storage.length;
		} while (i != end);
	}

	public static void main(String[] args) throws Exception {
		CircularQueue sq = new CircularQueue(5);
		sq.offer(10);
		sq.offer(20);
		sq.offer(30);
		sq.offer(40);
		sq.offer(50);
		System.out.println(size);
		System.out.println(storage.length);
		System.out.println(storage[0]);
//		System.out.println(end);
//		System.out.println(front);
//		System.out.println(sq.remove());
//		System.out.println(sq.remove());

		sq.display();
	}
}
