package com.numbersystem;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		toHexadecimal(1000);
	}

	public static void toHexadecimal(int num) {
		String res = "";
		while (num != 0) {
			int rem = num % 16;
			if (rem == 10) {
				res = "A" + res;
			} else if (rem == 11) {
				res = "B" + res;
			} else if (rem == 12) {
				res = "C" + res;
			} else if (rem == 13) {
				res = "D" + res;
			} else if (rem == 14) {
				res = "E" + res;
			} else if (rem == 15) {
				res = "F" + res;
			} else {
				res = rem + res;
			}
			num = num / 16;
		}
		System.out.println(res);
	}
}
