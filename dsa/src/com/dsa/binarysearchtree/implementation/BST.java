package com.dsa.binarysearchtree.implementation;

public class BST {
	private class Node {
		private int value;
		private Node left;
		private Node right;
		public int hight;

		public int getValue() {
			return this.value;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	public BST() {

	}

	public int height(Node node) {
		if (node == null)
			return -1;
		return node.hight;
	}

	private Node root;

	public void createNode(int value) {
		root = createNode(value, root);
	}

	public Node createNode(int value, Node node) {
		if (node == null) {
			node = new Node(value);
			return node;
		}
		if (node.value > value) {
			node.left = createNode(value, node.left);
		}
		if (node.value < value) {
			node.right = createNode(value, node.right);
		}

		node.hight = Math.max(height(node.left), height(node.right)) + 1;

		return node;
	}

	public boolean isBalanced(Node node) {
		if (node == null)
			return true;

		return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
	}

	public boolean isBalance() {
		return isBalanced(root);
	}

	public void display() {
		display(root, "Root Node");
	}

	public void display(Node node, String details) {
		if (node == null) {
			return;
		}
		System.out.println(details + node.value);
		display(node.left, "left child of :" + node.value + " : ");
		display(node.right, "right child of :" + node.value + " : ");
	}

	public void create(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			createNode(arr[i]);
		}
	}

	public void createSorted(int[] arr) {
		createSorted(arr, 0, arr.length);
	}

	public void createSorted(int arr[], int start, int end) {
		if (start >= end)
			return;
		int mid = start + (end - start) / 2;
		this.createNode(arr[mid]);
		createSorted(arr, 0, mid);
		createSorted(arr, mid + 1, end);
	}

	public void preOrederTraversal() {
		preOrderTraversal(root);
	}

	public void preOrderTraversal(Node node) {
		if (node == null)
			return;
		System.out.println(node.value);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void inOrderTravelsal() {
		inOrderTraversal(root);
	}

	public void inOrderTraversal(Node node) {
		if (node == null)
			return;

		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	public void postOrderTraversal(Node node) {
		if (node == null)
			return;

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.value);
	}

	public static void main(String[] args) {
		BST bst = new BST();
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		bst.createSorted(arr);
//		bst.preOrederTraversal();
//		bst.inOrderTravelsal();
		bst.postOrderTraversal();
//		bst.display();
//		System.out.println(bst.isBalance());

	}
}
