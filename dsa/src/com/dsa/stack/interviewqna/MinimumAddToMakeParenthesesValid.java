package com.dsa.stack.interviewqna;

import java.util.Stack;

// "(()" ->1
public class MinimumAddToMakeParenthesesValid {
	public static void main(String[] args) {
		String str = ")(()))";
		int res = makeValidParentheses(str);
		System.out.println(res);
		int res2 = makeParenthesesValid(str);
		System.out.println(res2);
	}

	public static int makeValidParentheses(String str) {
		int openParen = 0;
		int closeParen = 0;

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				openParen++;
			} else if (ch == ')') {
				if (openParen > 0) {
					openParen--;
				} else {
					closeParen++;
				}
			}
		}
		return openParen + closeParen;
	}

	public static int makeParenthesesValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if (ch == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(ch);
				}
			} else {
				stack.push(ch);
			}
		}
		return stack.size();
	}
}
