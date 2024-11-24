package com.dsa.heap.implementation;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	ArrayList<T> list;

	Heap() {
		list = new ArrayList<>();
	}

	private void swap(int first, int second) {
		T temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}

	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private int getLeft(int index) {
		return (index * 2) + 1;
	}

	private int getRight(int index) {
		return (index * 2) + 2;
	}

	public void insert(T val) {
		list.add(val);
		insertHelper(list.size() - 1);
	}

	public void insertHelper(int index) {
		if (index == 0)
			return;
		int parentIndex = getParent(index);
		// if the val added to be smaller than parent swap
		if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
			swap(index, parentIndex);
			insertHelper(parentIndex);
		}
	}

	public T removeElement() {
		if (list.isEmpty()) {
			System.out.println("empty");
			return null;
		}

		T data = list.get(0);

		T lastVal = list.remove(list.size() - 1);
		if (!list.isEmpty()) {
			list.set(0, lastVal);
			removeHelper(0);
		}
		return data;
	}

	private void removeHelper(int index) {
		int min = index;
		int left = getLeft(index);
		int right = getRight(index);

		if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0)
			min = left;
		if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0)
			min = right;
		if (min != index) {
			swap(min, index);
			removeHelper(min);
		}
	}

	public ArrayList<T> heapSort() {
		ArrayList<T> res = new ArrayList<>();
		while (!list.isEmpty())
			res.add(this.removeElement());
		return res;
	}

	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<>();
		heap.insert(10);
		heap.insert(56);
		heap.insert(1);
		heap.insert(5);
		heap.insert(0);
		ArrayList<Integer> list = heap.heapSort();

		list.forEach(System.out::println);
	}

}
