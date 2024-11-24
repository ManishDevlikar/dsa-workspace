package com.string;

public class CountTheNumberOfWordTime {
	public static void main(String[] args) {
		String str = "java is a java programming java";
		getWordCount(str);
		System.out.println("---------------------");
		getCharacterCount(str);
	}

	public static void getWordCount(String str) {
		String[] arr = str.split(" ");
		boolean[] flag = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int count = 1;
			if (flag[i] == false) {
				for (int j = i + 1; j < flag.length; j++) {
					if (arr[i].equalsIgnoreCase(arr[j])) {
						count++;
						flag[j] = true;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
	}

	public static void getCharacterCount(String str) {
		boolean flag[] = new boolean[str.length()];
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (flag[i] == false && str.charAt(i) != ' ') {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
						flag[j] = true;
					}
				}
				System.out.println(str.charAt(i) + " " + count);
			}
		}
	}
}
