package com.recursion.basic;

public class Recursion {
	public static void main(String[] args) {
		doRecursiveCall(5);
	}

	public static void doRecursiveCall(int num) {
		if (num == 0) {
			return;
		}
		doRecursiveCall(--num);
		System.out.println(num);
	}
}
