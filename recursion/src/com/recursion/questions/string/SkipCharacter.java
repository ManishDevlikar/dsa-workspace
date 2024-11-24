package com.recursion.questions.string;

public class SkipCharacter {
	public static void main(String[] args) {
		StringBuffer ans = skip("maanish", 0, 'm', new StringBuffer());
		System.out.println(ans);
		System.out.println(skip2("manish", ""));
		System.out.println(skip3("maaaanish"));
		System.out.println(skip4("apple"));
	}

	public static StringBuffer skip(String str, int charNo, char toSkip, StringBuffer ans) {
		if (charNo > str.length() - 1) {
			return ans;
		}
		return (str.charAt(charNo) == toSkip) ? skip(str, charNo + 1, toSkip, ans)
				: skip(str, charNo + 1, toSkip, ans.append(str.charAt(charNo)));
	}

	public static String skip2(String str, String ans) {
		if (str.isEmpty()) {
			return ans;
		}
		char ch = str.charAt(0);
		if (ch == 'a') {
			return skip2(str.substring(1), ans);
		} else {
			return skip2(str.substring(1), ans + ch);
		}
	}

	public static String skip3(String str) {
		String ans = "";
		if (str.isEmpty()) {
			return ans;
		}

		char ch = str.charAt(0);
		if (ch == 'a') {
			return skip3(str.substring(1));
		} else {
			ans += ch;
			String ans1 = skip3(str.substring(1));
			ans += ans1;
			return ans;
		}
	}

	public static String skip4(String str) {
		if (str.isEmpty()) {
			return "";
		}

		char ch = str.charAt(0);
		if (ch == 'a') {
			return skip4(str.substring(1));
		} else {
			return ch + skip4(str.substring(1));
		}
	}
}
