package com.basic;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

	public static boolean isArmstrong(int num) {
		int temp = num;
		int result = 0;
		int exponent = getExponent(num);
		while (temp != 0) {
			int rem = temp % 10;
			result = result + getPower(rem, exponent);
			temp = temp / 10;
		}
		if (num == result) {
			return true;
		} else {
			return false;
		}
	}

	public static int getExponent(int num) {
		int count = 0;
		for (int i = 0; i < num; num = num / 10) {
			count++;
		}
		return count;
	}

	public static int getPower(int base, int exponent) {
		int result = 1;

		for (int i = 0; i < exponent; i++) {
			result = base * result;
		}
		return result;
	}
}
