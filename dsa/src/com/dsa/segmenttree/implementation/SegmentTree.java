package com.dsa.segmenttree.implementation;

public class SegmentTree {
	private class Node {
		int data;
		Node left;
		Node right;
		int startInterval;
		int endInterval;

		public Node(int startInterval, int endInterval) {
			this.startInterval = startInterval;
			this.endInterval = endInterval;

		}
	}

	Node node;

	public void constructTree(int arr[]) {
		node = constructTree(arr, 0, arr.length - 1);
	}

	public Node constructTree(int arr[], int start, int end) {
		if (start == end) {
			Node leaf = new Node(start, end);
			leaf.data = arr[start];
			return leaf;
		}

		Node node = new Node(start, end);
		int mid = (start + end) / 2;

		node.left = constructTree(arr, start, mid);
		node.right = constructTree(arr, mid + 1, end);

		node.data = node.left.data + node.right.data;
		return node;
	}

	public void display(Node node) {
		if (node == null)
			return;

		display(node.left);
		display(node.right);
		System.out.println("Node Range: [" + node.startInterval + ", " + node.endInterval + "] with sum: " + node.data);
	}

	public void display() {
		display(node);
	}

	public static void main(String[] args) {
		SegmentTree segmentTree = new SegmentTree();
		int arr[] = { 3, 4, 9, 2, 7 };
		segmentTree.constructTree(arr);
		segmentTree.display();
		System.out.println(segmentTree.query(0, 2));
		segmentTree.updateNode(0, 20);
		segmentTree.display();

	}

	public int query(Node node, int si, int ei) {
		if (node.startInterval >= si && node.endInterval <= ei) {
			return node.data;
		} else if (node.startInterval > ei || node.endInterval < si) {
			return 0;
		} else {
			return query(node.left, si, ei) + query(node.right, si, ei);
		}
	}

	public int query(int si, int ei) {
		return query(node, si, ei);
	}

	public void updateNode(int index, int val) {
		node.data = updateNode(node, index, val);
	}

	private int updateNode(Node node, int index, int val) {
		if (index >= node.startInterval && index <= node.endInterval) {
			if (index == node.startInterval && index == node.endInterval) {
				node.data = val;
				return node.data;
			} else {
				int leftAns = updateNode(node.left, index, val);
				int rightAns = updateNode(node.right, index, val);
				node.data = leftAns + rightAns;
				return node.data;
			}
		}
		return node.data;
	}
}
