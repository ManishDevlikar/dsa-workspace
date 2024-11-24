package com.dsa.linklist.interviewqna;

public class HappyNumber {
	public static void main(String[] args) {
		isHappy(19);
//		System.out.println(getSqure(19));
	}

	public static void isHappy(int num) {
		int slow = num;
		int fast = num;

		do {
			slow = getSqure(slow);
			fast = getSqure(getSqure(fast));
			System.out.println(fast + " " + slow);
		} while (slow != fast);

		System.out.println((slow == 1 ? "happy" : "Not Happy"));

	}

	public static int getSqure(int num) {
		int res = 0;
		while (num > 0) {
			int mod = num % 10;
			res += mod * mod;
			num /= 10;
		}
		return res;
	}
}
