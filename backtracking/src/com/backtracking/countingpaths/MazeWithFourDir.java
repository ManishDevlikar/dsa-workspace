package com.backtracking.countingpaths;

public class MazeWithFourDir {
	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
		mazePath(0, 0, maze, "");

	}

	public static void mazePath(int down, int right, boolean maze[][], String path) {
		if (down == maze.length - 1 && right == maze[0].length - 1) {
			System.out.println(path);
			return;
		}

		if (!maze[down][right]) {
			return;
		}

		maze[down][right] = false;

		if (down < maze.length - 1) {
			mazePath(down + 1, right, maze, path + "D");
		}
		if (right < maze[0].length - 1) {
			mazePath(down, right + 1, maze, path + "R");
		}
		if (down > 1) {
			mazePath(down - 1, right, maze, path + "U");
		}
		if (right > 1) {
			mazePath(down, right - 1, maze, path + "L");
		}

		maze[down][right] = true;
	}
}
