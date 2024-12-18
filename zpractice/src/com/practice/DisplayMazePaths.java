package com.practice;

public class DisplayMazePaths {
	public static void main(String[] args) {
		System.out.println(getPaths(3, 3, ""));
	}

	public static int getPaths(int row, int col, String path) {
		if (row == 1 && col == 1) {
			System.out.println(path);
			return 1;
		}
		int count = 0;
		if (row > 1) {
			count += getPaths(row - 1, col, path + "D");
		}
		if (col > 1) {
			count += getPaths(row, col - 1, path + "R");
		}
		if (col > 1 && row > 1) {
			count += getPaths(row - 1, col - 1, path + "S");
		}
		return count;
	}
}
