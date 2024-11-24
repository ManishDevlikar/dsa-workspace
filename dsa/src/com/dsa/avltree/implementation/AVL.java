package com.dsa.avltree.implementation;

// Self Balancing Tree
//Adelson-Velskii-Landis
public class AVL {

	private class Node {
		int value;
		Node left;
		Node right;
		int height;

		public Node(int value) {
			this.value = value;
		}
	}

	public AVL() {

	}

	Node root;

	public int getHeight(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;

	}

	public void getHeight() {
		int height = getHeight(root);
		System.out.println(height);
	}

	public Node createRoot(Node node, int value) {
		if (node == null) {
			node = new Node(value);
			return node;
		}

		if (value > node.value) {
			node.right = createRoot(node.right, value);
		}
		if (value < node.value) {
			node.left = createRoot(node.left, value);
		}

		node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

		return rotate(node);
	}

	public void createRoot(int value) {
		root = createRoot(root, value);
	}

	public boolean isBalanced(Node node) {
		if (node == null)
			return true;
		return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && isBalanced(node.left)
				&& isBalanced(node.right);
	}

	public boolean isBalance() {
		return isBalanced(root);
	}

	public void create(int arr[]) {
		for (int i : arr) {
			createRoot(i);
		}
	}

	public void createSorted(int start, int end, int[] arr) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		createRoot(mid);
		createSorted(0, mid, arr);
		createSorted(mid + 1, end, arr);
	}

	public void createSorted(int arr[]) {
		createSorted(0, arr.length, arr);
	}

	public void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	public void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	public void postOrderTraversal(Node node) {
		if (node == null)
			return;

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.value);
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	public void display(Node node, String details) {
		if (node == null)
			return;

		System.out.println(details + node.value);
		display(node.left, "left Child of node" + node.value + " :");
		display(node.right, "right child of node" + node.value + " :");
	}

	public void display() {
		display(root, "root Node:");
	}

	public Node rotate(Node node) {
		// check for left heavy tree
		if (getHeight(node.left) - getHeight(node.right) > 1) {
			// left left
			if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
				return rightRotate(node);
			}
			// left right
			if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
				node.left = leftRotate(node.left);
				return rightRotate(node);
			}
		}

		// check for right heavy tree
		if (getHeight(node.left) - getHeight(node.right) < -1) {
			// right right
			if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
				return leftRotate(node);
			}
//			right left
			if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
				node.right = rightRotate(node.right);
				return leftRotate(node);
			}
		}

		return node;
	}

	// left heavy
	public Node rightRotate(Node p) {
		Node c = p.left;
		Node t = c.right;

		c.right = p;
		p.left = t;
		c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
		p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);

		return c;
	}

	// right heavy
	public Node leftRotate(Node c) {
		Node p = c.right;
		Node t = p.left;

		p.left = c;
		c.right = t;
		p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
		c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
		return p;
	}

	public static void main(String[] args) {
		AVL avl = new AVL();
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		avl.create(arr);
//		avl.preOrderTraversal();
//		avl.inOrderTraversal();
//		avl.postOrderTraversal();
		avl.display();
		System.out.println(avl.isBalance());
		avl.getHeight();
	}
}
