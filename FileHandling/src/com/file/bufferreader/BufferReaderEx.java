package com.file.bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
	public static void main(String[] args) throws IOException {
		bufferReaderInputStreamReader();
//		bufferReaderFromFile("C:\\Users\\91737\\OneDrive\\Desktop\\ex.txt");
	}

	private static void bufferReaderFromFile(String path) {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (br.ready()) {
				System.out.println((char) br.read());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void bufferReaderInputStreamReader() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			while (!str.isEmpty()) {
				System.out.println(str.charAt(0));
				str = str.substring(1, str.length());
			}
		}
	}
}
