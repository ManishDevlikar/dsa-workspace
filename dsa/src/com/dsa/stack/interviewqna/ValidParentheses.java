package com.dsa.stack.interviewqna;

import java.util.Stack;

// look 1541 too leetcode
// "{([])}" ->true  
// "{(})" ->false
public class ValidParentheses {
	public static void main(String[] args) {
		String str = "{[()]}";
		boolean res = isValid(str);
		boolean res2 = isValid(str);
		System.out.println(res2);
		System.out.println(res);
	}

	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		char[] cArr = str.toCharArray();

		for (char c : cArr) {
			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else {
				if (c == ')') {
					if (stack.isEmpty() || stack.pop() != '(') {
						return false;
					}
				}
				if (c == '}') {
					if (stack.isEmpty() || stack.pop() != '{') {
						return false;
					}
				}
				if (c == ']') {
					if (stack.isEmpty() || stack.pop() != '[') {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean isValid2(String str) {
		Stack<Character> stack = new Stack<>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				return false;
			} else if ((ch == '}' && stack.peek() == '{') || (ch == ')' && stack.peek() == '(')
					|| (ch == ']' && stack.peek() == '[')) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
