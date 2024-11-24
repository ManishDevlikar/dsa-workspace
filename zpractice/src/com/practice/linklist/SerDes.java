package com.practice.linklist;

import java.util.LinkedList;
import java.util.List;

public class SerDes {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		list.add("16");
		System.out.println(ser(list));
		StringBuilder s = new StringBuilder();
	}

	public static String ser(List<String> list) {
		StringBuilder res = new StringBuilder();
		helper(list, res);
		return new String(res).trim();
	}

	public static void helper(List<String> list, StringBuilder str) {
		for (String s : list) {
			str.append(s).append(" ");
		}
	}

}
