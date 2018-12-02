package com.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SnakeLudo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(2, 6);
		hm.put(8, 3);
		hm.put(5, 9);
		hm.put(4, 1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Rool the dice: ");
		int rollingNumber = Integer.parseInt(br.readLine());
		if (hm.containsKey(rollingNumber)) {
			if (rollingNumber == 2 || rollingNumber == 5) {
				System.out.println("wow! You got ladder: " + " from " + rollingNumber + " to " + hm.get(rollingNumber));
			} else if (rollingNumber == 8 || rollingNumber == 4) {
				System.out.println("You are in danger : " + " from " + rollingNumber + " to " + hm.get(rollingNumber));
			}
		}else{
			System.out.println("just go-ahead : "+rollingNumber+" cell");
		}

	}

}
