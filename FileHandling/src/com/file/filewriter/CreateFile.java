package com.file.filewriter;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		try {

			File f = new File("myFile.txt");
			boolean isCreated = f.createNewFile();
			if (isCreated)
				System.out.println("Created");
			else
				System.out.println("Not created");

			f.delete();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
