package com.string;

public class CountTheNumberOfCharacter {
	public static void main(String[] args) {
		String str = "buttlerb";
		getEachTotalCharCount(str);
	}

	public static void getEachTotalCharCount(String str) {
		boolean b[] = new boolean[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (b[i] == false && str.charAt(i) != ' ') {
				int count = 1;
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(str.charAt(i) + " " + count);
			}
		}
	}
}
