package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatingWords {
	public static void main(String[] args) {
		String str = "java is a programming language java is a";
		count(str);
		countDuplicates(str);
	}

	public static void count(String str) {
		String[] stream = str.split(" ");
		boolean[] isRepeadted = new boolean[stream.length];

		for (int i = 0; i < isRepeadted.length; i++) {
			int wordCount = 1;
			if (!isRepeadted[i]) {
				for (int j = i + 1; j < isRepeadted.length; j++) {
					if (stream[i].equals(stream[j])) {
						isRepeadted[j] = true;
						wordCount++;
					}
				}
				System.out.println(stream[i] + "->" + "count: " + wordCount);
			}
		}
	}

	public static void countDuplicates(String str) {
		String[] stream = str.split(" ");
		Map<String, Integer> wordHash = new HashMap<>();

		for (String word : stream) {
			if (wordHash.containsKey(word)) {
				wordHash.put(word, wordHash.get(word) + 1);
			} else {
				wordHash.put(word, 1);
			}
		}
		System.out.println(wordHash);
	}
}
