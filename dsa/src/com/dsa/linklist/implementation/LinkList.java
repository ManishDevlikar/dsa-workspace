package com.dsa.linklist.implementation;

public class LinkList {
	private Node head;
	private Node tail;
	private int size;

	public LinkList() {
		this.size = 0;
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

	public void insertFirst(int val) {
		Node node = new Node(val);

		node.next = head;
		head = node;

		if (tail == null) {
			tail = node;
		}
		size++;
	}

	public void insertLast(int val) {
		Node node = new Node(val);
		if (tail == null) {
			insertFirst(val);
			return;
		} else {

			tail.next = node;
			tail = node;
			size++;
		}
	}

	public void insertAt(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		} else if (index == size) {
			insertLast(val);
			return;
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			Node node = new Node(val, temp.next);
			temp.next = node;
			size++;
//			Node prev = temp.next;
//			node.next = prev;
		}
	}

	public void deleteFirst() {
		if (size == 0) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
		if (head == null) {
			tail = null;
			return;
		}
		size--;
	}

	public void deleteLast() {
		Node temp = head;
		for (int i = 0; i < size - 2; i++) {
			temp = temp.next;
		}
		tail = temp;
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
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
//			Node deleted = temp.next;
			temp.next = temp.next.next;
//			deleted.next = null;
			size--;
		}
	}

	public void update(int val, int index) {
		if (index < size) {
			Node node = get(index);
			node.val = val;
		} else {
			System.out.println("insert valid index");
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("end");
	}

	public Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean find(int value) {
		if (size == 0) {
			return false;
		} else {
			Node temp = head;
			for (int i = 0; i < size; i++) {
				if (temp.val == value) {
					return true;
				} else {
					temp = temp.next;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		ll.insertFirst(100);
		ll.insertFirst(200);
		ll.insertFirst(300);
		ll.insertFirst(400);
		ll.insertFirst(500);
		ll.insertLast(1000);
		ll.insertLast(2000);
		ll.insertFirst(0);
		ll.insertAt(-90, 1);
		System.out.println("initial");
		ll.display();
		ll.deleteFirst();
		System.out.println("after deleted first");
		ll.display();
		ll.deleteLast();
		ll.deleteLast();
		System.out.println("after deleting last");
		ll.display();
		ll.deleteAt(4);
		System.out.println("after deleted at specific position");
		ll.display();
		ll.update(-900, ll.size - 1);
		System.out.println("after updating at specific position");
		ll.display();
		System.out.println("size " + ll.size);
		if (ll.size != 0) {
			System.out.println("head " + ll.head.val);
			System.out.println("tail " + ll.tail.val);

		}

	}
}
