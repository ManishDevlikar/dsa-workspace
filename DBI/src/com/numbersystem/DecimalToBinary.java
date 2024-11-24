package com.numbersystem;

public class DecimalToBinary {

	public static void main(String[] args) {
		toBinary(10);
		System.out.println(Integer.toBinaryString(10));
	}

	public static void toBinary(int num) {
		String res = "";

		while (num != 0) {
			int rem = num % 2;
			res = rem + res;
			num = num / 2;
		}
		System.out.println(res);
	}
}
