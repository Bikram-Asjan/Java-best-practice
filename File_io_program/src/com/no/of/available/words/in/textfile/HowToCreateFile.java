package com.no.of.available.words.in.textfile;

import java.io.File;
import java.io.IOException;

public class HowToCreateFile {

	public static void main(String[] args) {
		try {
			File file = new File("G:\\Bikram\\software_and_practice\\corejava_workspace\\newFile.txt");
			boolean f_created = file.createNewFile();
			if (f_created) {
				System.out.println("File craeted successfully");
			} else {
				System.out.println("File is already present at the specific location");
			}
		} catch (IOException e) {
			System.out.println("Ooops! exception occured");
		}
	}

}
