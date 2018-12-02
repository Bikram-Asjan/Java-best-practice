package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BreakTheStringIntoAllSubString {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<String> al = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the string : ");
			String str = br.readLine();
			char[] charArray = str.toCharArray();
			for (int i = 0; i <= charArray.length - 1; i++) {
				char c = charArray[i];
				String charToString = Character.toString(c);
				sb.append(charToString);
				//System.out.println(sb.toString());
				al.add(sb.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("list print");
		al.forEach(System.out::println);

	}
}
