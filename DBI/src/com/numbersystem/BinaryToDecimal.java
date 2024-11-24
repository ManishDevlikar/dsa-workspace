package com.numbersystem;

public class BinaryToDecimal {
	public static void main(String[] args) {
		toDecimal(01);
	}

	public static void toDecimal(int num) {
		int res = 0;
		int base = 1;

		while (num != 0) {
			int rem = num % 10;
			res = res + rem * base;
			base = base * 2;
			num = num / 10;
		}
		System.out.println(res);
	}
}
