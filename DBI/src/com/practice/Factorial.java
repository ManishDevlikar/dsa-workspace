package com.practice;

public class Factorial {
	public static void main(String[] args) {

		System.out.println(getFact(6));
	}

	public static int getFact(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		return res;
	}
}
