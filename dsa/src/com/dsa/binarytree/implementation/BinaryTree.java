package com.dsa.binarytree.implementation;

import java.util.Scanner;

public class BinaryTree {

	public BinaryTree() {

	}

	private class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public Node rootNode;

	private void createRootNode(Scanner scanner) {
		System.out.println("Enter Root Node value :");
		int value = scanner.nextInt();
		rootNode = new Node(value);
		createChildrens(scanner, rootNode);
	}

	private void createChildrens(Scanner scanner, Node root) {
		System.out.println("Do you want to add Left of node " + root.value);
		boolean left = scanner.nextBoolean();
		if (left) {
			System.out.println("Enter left node value :");
			int leftValue = scanner.nextInt();
			root.left = new Node(leftValue);
			createChildrens(scanner, root);
		}

		System.out.println("Do you want to add right of node" + root.value);
		boolean right = scanner.nextBoolean();
		if (right) {
			System.out.println("Enter right node value");
			int rightValue = scanner.nextInt();
			root.right = new Node(rightValue);
			createChildrens(scanner, root);
		}
	}

	public void display() {
		display(rootNode, 0);
	}

	public void display(Node node, int level) {
		if (node == null)
			return;

		display(node.right, level + 1);

		if (level != 0) {
			for (int i = 0; i < level - 1; i++) {
				System.out.println("|\t\t");
			}
			System.out.println("-------->" + node.value);
		} else {
			System.out.println(node.value);
		}
		display(node.left, level + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createRootNode(scanner);
		binaryTree.display();
	}

}
