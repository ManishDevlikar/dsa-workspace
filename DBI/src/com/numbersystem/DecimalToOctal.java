package com.numbersystem;

public class DecimalToOctal {
	public static void main(String[] args) {
		toOctal(9);
	}

	public static void toOctal(int num) {
		String res = "";
		while (num != 0) {
			int rem = num % 8;
			res = rem + res;
			num = num / 8;
		}

		System.out.println(res);
	}
}
