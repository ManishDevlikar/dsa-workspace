package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

public class GroupAnagrams49 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0 || strs == null)
			return new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] ca = str.toCharArray();
			Arrays.sort(ca);
			String strKey = String.valueOf(ca);

			if (!map.containsKey(strKey)) {
				map.put(strKey, new ArrayList<>());
			}
			map.get(strKey).add(str);
		}

		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

	}
}
