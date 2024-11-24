package com.practice;

public class HashTheMessage {

	public static StringBuffer toHash(String str) {
		if (str.length() == 0)
			return new StringBuffer("input is empty");
		StringBuffer res = new StringBuffer();
		String[] stream = str.split(" ");

		for (int i = 0; i < stream.length; i++) {
			String curr = stream[i];

			for (int j = 0; j < curr.length(); j++) {
				if (!isVovel(curr.charAt(j)) && j % 3 == 0) {
					res.append("*");
				} else if (j % 3 == 2) {
					res.append("#");
				} else {
					res.append(curr.charAt(j));
				}
			}
			res.append(" ");
		}
		return res;
	}

//	public static StringBuffer toAstrick(char ch) {
//		if (isVovel(ch)) {
//			return new StringBuffer("*");
//		} else {
//
//			return new StringBuffer(ch);
//		}
//	}

//	public static String toAstrick2(String str) {
//		if (str.length() == 0)
//			return "input is empty";
//
//		String[] words = str.split(" ");
//		StringBuilder res = new StringBuilder();
//
//		for (String word : words) {
//			StringBuilder transformedWord = new StringBuilder();
//			for (int i = 0; i < word.length(); i++) {
//				char curr = word.charAt(i);
//				if (isVowel(curr)) {
//					transformedWord.append('*');
//				} else if (i % 3 == 2) { // 0-based index, every third character is at index % 3 == 2
//					transformedWord.append('#');
//				} else {
//					transformedWord.append(curr);
//				}
//			}
//			res.append(transformedWord).append(" ");
//		}
//
//		return res.toString().strip();
//	}

	public static boolean isVovel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		else
			return false;
	}
//
//	public static boolean isVowel(char ch) {
//		return "aeiouAEIOU".indexOf(ch) != -1;
//	}

	public static void main(String[] args) {
		String str = "my name is manish";
		StringBuffer res = toHash(str);
		System.out.println(res);
//		String res2 = toAstrick2(str);

//		System.out.println(res2);
	}
}
