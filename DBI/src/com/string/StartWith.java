package com.string;

public class StartWith {
	public static void main(String[] args) {
		isStartWith("manish sunny sua raj");
	}

	public static void isStartWith(String str) {
		String[] arr = str.split(" ");
		String res = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith("s"))
				continue;
			else
				res = res + arr[i] + " ";
		}
		System.out.println(res.strip());
	}
}
