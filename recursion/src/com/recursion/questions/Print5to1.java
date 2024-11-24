package com.recursion.questions;

public class Print5to1 {
	public static void main(String[] args) {
		print(5);
	}

	public static void print(int num) {
		if (num == 0) {
			return;
		}
		print(num - 1);
		System.out.println(num);
	}
}
