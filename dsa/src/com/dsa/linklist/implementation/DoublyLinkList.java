package com.dsa.linklist.implementation;

public class DoublyLinkList {
	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkList() {
		this.size = 0;
	}

	private class Node {
		private int val;
		private Node next;
		private Node prev;

		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}

		public Node(int val) {
			this.val = val;
		}

	}

	public void insertFirst(int val) {
		Node node = new Node(val);

		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		if (tail == null) {
			tail = node;
			tail.next = null;
		}
		size++;
	}

	public void insertLast(int val) {
		if (size == 0) {
			insertFirst(val);
			return;
		} else {
			Node node = new Node(val);
			tail.next = node;
			node.prev = tail;
			node.next = null;
			tail = node;
			size++;
		}
	}

	public void insertAt(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		} else if (index == size - 1) {
			insertLast(val);
		} else {
			Node preNode = get(index - 1);
			Node nextNode = preNode.next;
			Node node = new Node(val, preNode.next, preNode);
			preNode.next = node;
			nextNode.prev = node;
			size++;
		}
	}

	public void deleteFirst() {
		if (size == 0) {
			System.out.println("list is empty");
			return;
		}
		if (size == 1) {
			head = null;
			tail = null;
			size--;
			return;
		}
		head = head.next;
		head.prev = null;
		if (head == null) {
			tail = null;
			return;
		}
		size--;

	}

	public void deleteLast() {
		if (size == 0) {
			System.out.println("List is empty");
			return;
		}
		if (size == 1) {
			head = null;
			tail = null;
			size--;
			return;
		}
		tail = tail.prev;
		tail.next = null;
		size--;
	}

	public void deleteAt(int index) {
		if (index == 0) {
			deleteFirst();
			return;
		} else if (index == size - 1) {
			deleteLast();
			return;
		} else {
			Node node = get(index - 1);
			Node nextNode = node.next.next;
			node.next = nextNode;
			nextNode.prev = node;
			size--;
		}
	}

	public Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;

		for (int i = 0; i < size; i++) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}

		System.out.println("End");
	}

	public void reverse() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.prev;
		}
		System.out.println("End");
	}

	public static void main(String[] args) {
		DoublyLinkList list = new DoublyLinkList();
		list.insertFirst(100);
		list.insertFirst(200);
		list.insertFirst(300);
		list.insertLast(1000);
		list.insertAt(20000, list.size - 1);
		list.insertLast(0);
		list.deleteFirst();
		list.deleteLast();
		list.deleteAt(list.size - 1);
		list.display();
		list.reverse();
//		System.out.println("head ->" + list.head.val);
//		System.out.println("tail ->" + list.tail.val);
//		try {
//			System.out.println("next tail " + list.tail.next);
//			System.out.println("prev tail " + list.tail.prev);
//			System.out.println("next head " + list.head.next);
//			System.out.println("prev head " + list.head.prev);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
