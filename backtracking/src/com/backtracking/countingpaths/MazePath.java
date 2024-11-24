package com.backtracking.countingpaths;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
	public static void main(String[] args) {
//		System.out.println(getTotalPath(3, 3));
//		getPath(3, 3, "");
//		System.out.println(getPaths(3, 3, ""));
		System.out.println(diginal(3, 3, ""));
	}

	public static int getTotalPath(int row, int col) {
		if (row == 1 && col == 1) {
			return 1;
		}

		int left = getTotalPath(row - 1, col);
		int right = getTotalPath(row, col - 1);
		return left + right;
	}

	public static void getPath(int row, int col, String path) {
		if (row == 1 && col == 1) {
			System.out.println(path);
			return;
		}
		if (row > 1) {
			getPath(row - 1, col, path + "d");
		}
		if (col > 1) {
			getPath(row, col - 1, path + "r");
		}
	}

	public static List<String> getPaths(int row, int col, String res) {
		if (row == 1 && col == 1) {
			List<String> list = new ArrayList<>();
			list.add(res);
			return list;
		}
		List<String> list = new ArrayList<>();
		if (row > 1) {
			list.addAll(getPaths(row - 1, col, res + "d"));
		}
		if (col > 1) {
			list.addAll(getPaths(row, col - 1, res + "r"));
		}
		return list;
	}

	public static List<String> diginal(int row, int col, String res) {
		if (row == 1 && col == 1) {
			List<String> list = new ArrayList<>();
			list.add(res);
			return list;
		}
		List<String> list = new ArrayList<>();
		if (row > 1) {
			list.addAll(diginal(row - 1, col, res + "V"));
		}
		if (col > 1) {
			list.addAll(diginal(row, col - 1, res + "H"));
		}
		if (row > 1 && col > 1) {
			list.addAll(diginal(row - 1, col - 1, res + "D"));
		}
		return list;
	}
}
