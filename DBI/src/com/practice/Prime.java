package com.practice;

public class Prime {
	public static void main(String[] args) {
		isPrime(7);
	}

	public static void isPrime(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
