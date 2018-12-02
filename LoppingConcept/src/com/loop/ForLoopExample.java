package com.loop;

public class ForLoopExample {
	private int count = 0;
	int i , j, k;
	public void m1(){
		for ( i = 1; i <= 5; i++) {
			for ( j = 1; j <= 5; j++) {
				for ( k = 1; k <= 5; k++) {
					System.out.println(i + "   " + j + "   " + k);
					count++;
				}
			}
		}
	}
	public static void main(String[] args) {
		ForLoopExample f = new ForLoopExample();
		f.m1();
	}
	
}