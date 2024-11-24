package com.numbersystem;

public class OctalToDecimal {
	public static void main(String[] args) {
		toDecimal(122);
	}

	public static void toDecimal(int num) {
		int res = 0;
		int base = 1;
		while (num != 0) {
			int rem = num % 10;
			res = res + rem * base;
			base = base * 8;
			num = num / 10;
		}
		System.out.println(res);
	}
}
