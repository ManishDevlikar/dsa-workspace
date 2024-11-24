package com.string;

import java.util.Stack;

public class ValidParentheses20 {
	public static void main(String[] args) {
		System.out.println(isValidParentheses("[{}])"));
	}

	public static boolean isValidParentheses(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '[' || c == '{' || c == '(')
				stack.push(c);
			else {
				if (stack.isEmpty())
					return false;
				char top = stack.peek();
				if ((c == '}' && top == '{') || (c == ']' && top == '[') || (c == ')' && c == '('))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
	}
}
