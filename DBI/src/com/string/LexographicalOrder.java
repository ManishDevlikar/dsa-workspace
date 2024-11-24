package com.string;

import java.util.Arrays;

public class LexographicalOrder {
	public static void main(String[] args) {
		String[] str = { "aea", "coffee", "banana", "manish", "zaptos", "apple", "aa" };
		sortInLexical(str);
	}

	public static void sortInLexical(String str[]) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
