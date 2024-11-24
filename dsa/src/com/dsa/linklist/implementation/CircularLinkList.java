package com.dsa.linklist.implementation;

public class CircularLinkList {
	private Node head;
	private Node tail;

	public CircularLinkList() {
		this.head = null;
		this.tail = null;
	}

	private class Node {
		private int val;
		private Node next;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		public Node(int val) {
			this.val = val;
		}

	}

	public void insert(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}

	public void delete(int val) {
		Node node = head;
		if (node == null) {
			return;
		}
		if (node.val == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		do {
			Node n = node.next;
			if (n.val == val) {
				node.next = n.next;
				break;
			}
			node = node.next;
		} while (node != head);
	}

	public void display() {
		Node temp = head;
		if (head != null) {
			do {
				System.out.print(temp.val + "->");
				if (temp.next != null) {
					temp = temp.next;
				}
			} while (temp != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkList list = new CircularLinkList();
		list.insert(100);
		list.insert(200);
		list.insert(300);
		list.insert(500);
		list.display();
		list.delete(300);
		list.display();

	}
}
