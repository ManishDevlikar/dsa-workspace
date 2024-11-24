package com.backtracking.countingpaths;

import java.util.Arrays;

public class MazeWithPathArrayOutput {
	public static void main(String[] args) {
		boolean board[][] = { { true, true, true }, { true, true, true }, { true, true, true } };
		int path[][] = new int[board.length][board[0].length];
		mazeRoutes(0, 0, board, "", path, 1);
	}

	public static void mazeRoutes(int row, int col, boolean[][] board, String route, int[][] path, int count) {
		if (row == board.length - 1 && col == board[0].length - 1) {
			for (int[] p : path) {
				System.out.println(Arrays.toString(p));
			}
			System.out.println(route);
			return;
		}
		if (board[row][col] == false)
			return;

		board[row][col] = false;
		path[row][col] = count;

		if (row < board.length - 1)
			mazeRoutes(row + 1, col, board, route + "D", path, count + 1);
		if (col < board[0].length - 1)
			mazeRoutes(row, col + 1, board, route + "R", path, count + 1);
		if (row > 1)
			mazeRoutes(row - 1, col, board, route + "U", path, count + 1);
		if (col > 1)
			mazeRoutes(row, col - 1, board, route + "L", path, count + 1);

		board[row][col] = true;
		path[row][col] = 0;
	}
}
