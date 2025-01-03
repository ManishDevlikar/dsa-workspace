package com.practice;

import java.util.ArrayList;
import java.util.List;

public class FindMissing {

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				int temp = nums[correct];
				nums[correct] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}

		List<Integer> resList = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				resList.add(index + 1);
			}
		}
		return resList;
	}

	public static void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}
}
