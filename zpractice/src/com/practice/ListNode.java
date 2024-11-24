package com.practice;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	// Method to insert an element at the end of the linked list
	public static ListNode insert(ListNode head, int val) {
		ListNode newNode = new ListNode(val);
		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return head;
	}

	// Method to find the middle element of the linked list
	public static ListNode getMiddle(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}

	// Merge two sorted lists
	public static ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode();
		ListNode tail = dummyHead;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		tail.next = (list1 != null) ? list1 : list2;
		return dummyHead.next;
	}

	// Merge sort for linked list
	public static ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode mid = getMiddle(head);
//		ListNode midNext = mid.next;
//		mid.next = null;

		ListNode left = mergeSort(head);
		ListNode right = mergeSort(mid);

		return merge(left, right);
	}

	// Method to get all elements of the linked list
	public static ListNode getAllElements(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
		return head;
	}

	public static void main(String[] args) {
		ListNode head = null;

		// Insert elements into the linked list
		head = insert(head, 5);
		head = insert(head, 3);
		head = insert(head, 7);
		head = insert(head, 2);
		head = insert(head, 1);
		System.out.println(head.val);
		// Print all elements of the linked list before sorting
//		System.out.println("Original list:");
//		getAllElements(head);

		// Sort the linked list using merge sort
//		head = mergeSort(head);

		// Print all elements of the linked list after sorting
//		System.out.println("Sorted list:");
//		getAllElements(head);
	}
}
