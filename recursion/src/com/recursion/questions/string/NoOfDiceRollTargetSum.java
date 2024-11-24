package com.recursion.questions.string;

import java.util.ArrayList;
import java.util.List;

public class NoOfDiceRollTargetSum {
	public static void main(String[] args) {
		sum("", 4);
		System.out.println(sum(4, ""));
		System.out.println("count value :- " + getCount(4, ""));
	}

	public static void sum(String res, int target) {
		if (target == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 1; i <= 6 && i <= target; i++) {
			sum(res + i, target - i);
		}
	}

	public static List<String> sum(int target, String ans) {
		List<String> list = new ArrayList<String>();
		if (target == 0) {
			list.add(ans);
			return list;
		}

		for (int i = 1; i <= 6 && i <= target; i++) {
			list.addAll(sum(target - i, ans + i));
		}
		return list;
	}

	public static int getCount(int target, String ans) {
		if (target == 0) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i <= target && i <= 6; i++) {
			count += getCount(target - i, ans + i);
		}
		return count;
	}
}
