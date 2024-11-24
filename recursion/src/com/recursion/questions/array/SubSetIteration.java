package com.recursion.questions.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubSetIteration {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> list = subSet(arr);

		Collections.sort(list, (a, b) -> {
			if (a.size() != b.size()) {
				return a.size() - b.size();
			}
			for (int i = 0; i < a.size(); i++) {
				if (!a.get(i).equals(b.get(i))) {
					return a.get(i) - b.get(i);
				}
			}
			return 0;
		});

		System.out.println(list.toString());

	}

	public static List<List<Integer>> subSet(int arr[]) {
		List<List<Integer>> outer = new ArrayList<List<Integer>>();

		outer.add(new ArrayList<Integer>());

		for (int item : arr) {
			int n = outer.size();
			for (int i = 0; i < n; i++) {
				List<Integer> inner = new ArrayList<Integer>(outer.get(i));
//				System.out.println("inner before" + inner.toString());
				inner.add(item);
//				System.out.println("inner after" + inner.toString());
//				System.out.println("outer before" + outer.toString());
				outer.add(inner);
//				System.out.println("outer after" + outer.toString());
			}

			HashSet<List<Integer>> uniqueSet = new HashSet<List<Integer>>();
			uniqueSet.addAll(outer);
			outer.clear();
			outer.addAll(uniqueSet);
		}
		return outer;
	}
}
