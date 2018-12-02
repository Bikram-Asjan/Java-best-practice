package com.bikram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordRepeatatedCountInTextFile {
	private final static String fileLocation = "G:/";

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		String line = "";
		BufferedReader br1 = null;
		HashMap<String, Integer> hm = null;

		br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name");
		String fileName = br1.readLine();
		String fileLocationWithName = fileLocation + fileName;
		System.out.println(fileLocationWithName);
		String s1 = null;

		hm = new HashMap<>();
		br = new BufferedReader(new FileReader(new File(fileLocationWithName)));

		while ((line = br.readLine()) != null) {
			// System.out.println(line);

			String[] strArray = line.split(" ");
			for (String s : strArray) {
				// System.out.println("s : " + s);
				if (s.endsWith(".") || s.endsWith(",") || s.endsWith("?")) {
					s1 = s.substring(0, s.length() - 1);
					if (hm.containsKey(s1) == true) {
						hm.put(s1, hm.get(s1) + 1);
					} else {
						hm.put(s1, 1);
					}
					// System.out.println("s1 :" + s1);
				} else {
					if (hm.containsKey(s) == true) {
						hm.put(s, hm.get(s) + 1);
					} else {
						hm.put(s, 1);
					}
				}

			}
		}

		hm.forEach((key, value) -> System.out.println("Word : " + key + "\t\t" + "no of times:" + value));

	}

}
