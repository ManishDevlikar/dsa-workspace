package com.practice.sorting.cyclic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 4, 3, 1, 5 };
		System.out.println(findDuplicates(arr));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		map.forEach((k, v) -> {
			if (v > 1) {
				list.add(k);
			}
		});
		return list;
	}
}
