package com.dsa.linklist.interviewqna;

public class ListNode {
	private int val;
	private ListNode next;

	public ListNode() {

	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode insert(int val, ListNode head) {
		ListNode node = new ListNode(val);
		if (head == null) {
			head = node;
		} else {

			ListNode pres = head;

			while (pres.next != null) {
				pres = pres.next;
			}
			pres.next = node;
		}
		return head;
	}

	public static ListNode getMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static ListNode merge(ListNode list1, ListNode list2) {
		ListNode head = new ListNode();
		ListNode tail = head;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}

		tail.next = (list1 != null) ? list1 : list2;

		return head.next;
	}

	public static ListNode sort(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode mid = seperate(head);
		ListNode left = sort(head);
		ListNode right = sort(mid);

		return merge(left, right);
	}

	private static ListNode seperate(ListNode head) {
		if (head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if (prev != null) {
			prev.next = null;
		}
		return slow;
	}

	private static ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head;
		ListNode next = curr.next;
		ListNode prev = null;

		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
		}
		return prev;
	}

	private static ListNode reverseInbetween(ListNode head, int start, int end) {
		if (head == null && start >= end)
			return head;

		ListNode prev = null;
		ListNode curr = head;

		for (int i = 0; curr != null && i < start - 1; i++) {
			prev = curr;
			curr = curr.next;
		}
		ListNode newPrev = prev;
		ListNode newCurr = curr;
		ListNode next = curr.next;

		for (int i = 0; curr != null && i < end - start + 1; i++) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
			if (newPrev != null) {
				newPrev.next = prev;
			} else {
				head = prev;
			}
		}
		newCurr.next = curr;
		return head;
	}

	private static ListNode reverseInbetween2(ListNode head, int start, int end) {
		if (head == null || start >= end)
			return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;

		// Move `prev` to the node before `start`
		for (int i = 0; i < start - 1; i++) {
			if (prev == null)
				return head; // if start is out of bounds
			prev = prev.next;
		}

		ListNode curr = prev.next;
		ListNode next = curr.next;

		// Reverse the nodes between start and end
		for (int i = 0; i < end - start; i++) {
			if (next == null)
				return head; // if end is out of bounds
			curr.next = next.next;
			next.next = prev.next;
			prev.next = next;
			next = curr.next;
		}

		return dummy.next;
	}

//	private static boolean isPalindrome(ListNode head) {
//		if (head == null)
//			return false;
//	}

	private static void createCycle(ListNode head, int pos) {
		if (head == null)
			return;

		ListNode dummyHead = head;
		ListNode cycleNode = null;
		int count = 0;

		while (dummyHead.next != null) {
			if (pos == count) {
				cycleNode = dummyHead;
			}
			dummyHead = dummyHead.next;
			count++;
		}
		if (cycleNode != null) {
			dummyHead.next = cycleNode;
		}
	}

	private static boolean isCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow)
				return true;
		}
		return false;
	}

	private static int getCycleLength(ListNode head) {
		if (head == null)
			return -1;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				ListNode temp = slow;
				int length = 0;
				do {
					temp = temp.next;
					length++;
				} while (temp != slow);
				return length;
			}
		}
		return -1;
	}

	private static ListNode getCycleStartingNode(ListNode head) {
		if (head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				ListNode temp = slow;
				int length = 0;
				do {
					temp = temp.next;
					length++;
				} while (temp != slow);

				for (int i = 0; i < length; i++) {
					if (head == temp) {
						return temp;
					} else {
						head = head.next;
						temp = temp.next;
					}
				}
			}
		}
		return null;
	}

	private static ListNode getCycleStartingNode2(ListNode head) {
		if (head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				ListNode start = head;

				while (start != slow) {
					start = start.next;
					slow = slow.next;
				}
				return start;
			}
		}
		return null;
	}

	public static void display(ListNode head) {
		if (head == null)
			return;
		ListNode dummyHead = head;
		while (dummyHead != null) {
			System.out.println(dummyHead.val);
			dummyHead = dummyHead.next;
		}
	}

	public static int getSize(ListNode head) {
		if (head == null)
			return -1;
		int size = 0;
		ListNode dummyHead = head;
		while (dummyHead != null) {
			size++;
			dummyHead = dummyHead.next;
		}
		return size;
	}

	public static ListNode reverse(ListNode head) {
		while (head == null)
			return head;

		ListNode prev = null;
		ListNode pres = head;
		ListNode next = pres.next;

		while (pres != null) {
			pres.next = prev;
			prev = pres;
			pres = next;
			if (next != null) {
				next = next.next;
			}

		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode head = null;

		head = insert(10, head);
		head = insert(20, head);
		head = insert(30, head);
		head = insert(40, head);
		head = insert(50, head);

		ListNode head2 = null;

		head2 = insert(60, head2);
		head2 = insert(70, head2);
		head2 = insert(80, head2);
		head2 = insert(90, head2);
		head2 = insert(100, head2);

//		System.out.println(getMid(head).val);
		ListNode list = merge(head, head2);
//		System.out.println(getMid(head2).val);

		while (list != null) {
//			System.out.print(list.val + " ");
			list = list.next;
		}
//		System.out.println();

		ListNode head3 = null;
		head3 = insert(10, head3);
		head3 = insert(30, head3);
		head3 = insert(20, head3);
		head3 = insert(90, head3);
		head3 = insert(70, head3);
		head3 = insert(60, head3);

		ListNode sortedList = sort(head3);

		while (sortedList != null) {
//			System.out.print(sortedList.val + " ");
			sortedList = sortedList.next;
		}

		ListNode head4 = null;
		head4 = insert(10, head4);
		head4 = insert(20, head4);
		head4 = insert(30, head4);
		head4 = insert(40, head4);
		head4 = insert(50, head4);

//		createCycle(head4, 4);
//		System.out.println(isCycle(head4));
//		System.out.println(getCycleLength(head4));
//		System.out.println(getCycleStartingNode(head4).val);
//		System.out.println(getCycleStartingNode2(head4).val);

//		ListNode my = seperate(head4);
//		display(my);
//		ListNode r = reverse(head4);
//		System.out.println("//////////////////");
//		display(r);

//		System.out.println(getSize(head4) / 2);
//		ListNode res = rotateRight(head4, 2);
//		ListNode reversedList = (reverseList(head4));
//		ListNode reverseInBet = reverseInbetween2(head4, 1, 6);
//
//		while (res != null) {
//			System.out.print(res.val + " ");
//			res = res.next;
//		}

	}

}
