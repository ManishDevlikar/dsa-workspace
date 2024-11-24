package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCharRepetations {
	public static void main(String[] args) {
		String str = "java is one";
		Map<Character, Integer> cHash = countRepetations(str);
		System.out.println(cHash);
		count(str);
	}

	public static Map<Character, Integer> countRepetations(String str) {
		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> charHash = new HashMap<>();
		for (char ch : charArr) {
			if (ch != ' ') {
				if (charHash.containsKey(ch)) {
					charHash.put(ch, charHash.get(ch) + 1);
				} else {
					charHash.put(ch, 1);
				}
			}
		}
		return charHash;
	}

	public static void count(String str) {
		char[] charArr = str.toCharArray();
		boolean[] isRepete = new boolean[charArr.length];

		for (int i = 0; i < charArr.length; i++) {
			int count = 1;

			if (!isRepete[i] && charArr[i] != ' ') {
				for (int j = i + 1; j < charArr.length; j++) {
					if (charArr[i] == charArr[j]) {
						count++;
						isRepete[j] = true;
					}
				}
				System.out.println(charArr[i] + " ->" + count);
			}
		}
	}
}
