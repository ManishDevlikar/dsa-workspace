package com.file.filewriter;

import java.io.FileWriter;
import java.util.Scanner;

public class OutputSRFileWriter {
	public static void main(String[] args) {
//		write("C:\\Users\\91737\\OneDrive\\Desktop\\ex.txt");
		writeAlphabet("C:\\Users\\91737\\OneDrive\\Desktop\\ex.txt");
	}

	public static void write(String path) {

		try (FileWriter fr = new FileWriter(path); Scanner sc = new Scanner(System.in)) {
			System.out.println("Write");
			String inp = sc.nextLine();
			fr.write(inp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void writeAlphabet(String path) {
		try (FileWriter fr = new FileWriter(path)) {
			for (int i = 0; i < 26; i++) {
				char ch = (char) ('A' + i);
				fr.write(ch + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
