package com.file.inputstreamreader;

import java.io.FileReader;
import java.io.IOException;
//import java.io.IOException;

public class InputStreamReaderEx {
//	public static void main(String[] args) throws IOException {
//		try (InputStreamReader isr = new InputStreamReaderReader("file1.txt")) {
//			int letter = isr.read();
//			while (isr.ready()) {
//				System.out.println((char) letter);
//
//				letter = isr.read();
//			}
//		}
//
//	}

//	public static void main(String[] args) throws IOException {
//		try (FileReader isr = new FileReader("note.txt")) {
//			int letter = isr.read();
//			while (letter != -1) {
//				System.out.print((char) letter); // Use print instead of println to avoid extra new lines
//				letter = isr.read();
//			}
//		}
//	}

	public static void main(String[] args) throws IOException {
		// Use class loader to get the file from the same package
//		ClassLoader classLoader = InputStreamReaderEx.class.getClassLoader();
//		InputStream inputStream = classLoader.getResourceAsStream("com/file/inputstreamreader/demo.txt");
//
//		if (inputStream == null) {
//			System.out.println("File not found in the classpath");
//			return;
//		}

		try (FileReader reader = new FileReader("C:\\Users\\91737\\OneDrive\\Desktop\\ex.txt")) {
			System.out.println("Enter The Letters");
			int line = reader.read();
			while ((line != -1)) {
				System.out.println((char) line);
				line = reader.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
