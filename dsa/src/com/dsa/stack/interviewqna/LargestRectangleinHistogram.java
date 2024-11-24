package com.dsa.stack.interviewqna;

import java.util.Stack;

public class LargestRectangleinHistogram {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		System.out.println(longestRectangleInHistogram(arr));
	}

	public static int longestRectangleInHistogram(int arr[]) {
		int maxArea = 0;
		int index = 0;
		Stack<Integer> stack = new Stack<>();

		while (index < arr.length) {
			if (stack.isEmpty() || arr[index] >= arr[stack.peek()]) {
				stack.push(index++);
			} else {
				int top = stack.pop();

				int area = arr[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);

				maxArea = Math.max(maxArea, area);
			}
		}

		while (!stack.isEmpty()) {
			int top = stack.pop();
			int area = arr[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
			maxArea = Math.max(maxArea, area);
		}

		return maxArea;
	}

}
