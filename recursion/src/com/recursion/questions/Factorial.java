package com.recursion.questions;

public class Factorial {
	public static void main(String[] args) {
		int res = print(4);
		System.out.println(res);
	}

	public static int print(int num) {
		if (num == 0) {
			return 1;
		}
		return num * print(num - 1);
	}
}
