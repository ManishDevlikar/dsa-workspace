package com.practice.linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderTraversal2 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		// Add first inner list with one element
		List<Integer> firstList = new ArrayList<>();
		firstList.add(10);
		list.add(firstList);

		// Add second inner list with two elements
		List<Integer> secondList = new ArrayList<>();
		secondList.add(20);
		secondList.add(30);
		list.add(secondList);

		// Add third inner list with two elements
		List<Integer> thirdList = new ArrayList<>();
		thirdList.add(40);
		thirdList.add(50);
		list.add(thirdList);

		// Add fourh inner list with two elements
		List<Integer> fourthList = new ArrayList<>();
		fourthList.add(60);
		fourthList.add(70);
		list.add(fourthList);

		Collections.reverse(list);

		System.out.println(list);
	}
}
