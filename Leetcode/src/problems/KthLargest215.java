package problems;

import java.util.PriorityQueue;

/*
 215. Kth Largest Element in an Array
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

public class KthLargest215 {
	public static void main(String[] args) {
		System.out.println(getLargestKth(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
	}

	public static int getLargestKth(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		for (int i = 0; i < arr.length; i++) {
			if (pq.size() < k) {
				pq.add(arr[i]);
			} else if (pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
