package com.numbersystem;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
		toDecimal("BB10");
	}

	public static void toDecimal(String num) {
		int res = 0;
		int base = 1;
		for (int i = num.length() - 1; i >= 0; i--) {
			char ch = num.charAt(i);
			int value = digitToValue(ch);
			res = res + (value * base);
			base = base * 16;
		}
		System.out.println(res);
	}

	public static int digitToValue(char digit) {
		if (digit >= '0' && digit <= '9') {
			return digit - '0';
		} else if (digit >= 'A' && digit <= 'F') {
			return 10 + (digit - 'A');
		} else if (digit >= 'a' && digit <= 'f') {
			return 10 + (digit - 'a');
		}
		return 0;
	}
}
