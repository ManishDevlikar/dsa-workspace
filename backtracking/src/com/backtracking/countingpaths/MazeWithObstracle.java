package com.backtracking.countingpaths;

public class MazeWithObstracle {
	public static void main(String[] args) {
		boolean arr[][] = { { true, true, true }, { true, false, false }, { true, true, true } };
		maze(0, 0, arr, "");
	}

	public static void maze(int row, int col, boolean[][] arr, String path) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(path);
			return;
		}

		if (!arr[col][row]) {
			return;
		}

		if (row < arr.length - 1) {

			maze(row + 1, col, arr, "D" + path);
		}
		if (col < arr[0].length - 1) {

			maze(row, col + 1, arr, "R" + path);
		}
	}

	public static void mazeRoute(int row, int col, boolean[][] board, String route) {
		if (row >= board.length - 1 && col >= board[0].length - 1) {
			System.out.println(route);
			return;
		}

		if (!board[row][col]) {
			return;
		}

		if (row < board.length - 1)
			mazeRoute(row + 1, col, board, route + "D");
		if (col < board[0].length - 1)
			mazeRoute(row, col + 1, board, route + "R");
		if (row < board.length - 1 && col < board.length - 1 && board[row][col]) {
			mazeRoute(row + 1, col + 1, board, route + "S");
		}
	}
}
