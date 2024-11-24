package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
	public static void main(String[] args) {
		System.out.println(smallest(new int[] { 21, 22, 43, 4, 65, 16 }, 3));
	}

	public static int smallest(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			if (pq.size() < k) {
				pq.add(arr[i]);
			} else if (pq.peek() > arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
}
