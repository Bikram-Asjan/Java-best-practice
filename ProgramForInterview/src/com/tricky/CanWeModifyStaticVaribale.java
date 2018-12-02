package com.tricky;

public class CanWeModifyStaticVaribale {
	public static int i = 10;

	public static void main(String[] args) {
		CanWeModifyStaticVaribale.i = 12;
		System.out.println(CanWeModifyStaticVaribale.i);
		CanWeModifyStaticVaribale c1 = new CanWeModifyStaticVaribale();
		c1.i = 15;
		System.out.println(c1.i);
	}
}
// output: 12, 15 that means we can reinitialize the variable using static 