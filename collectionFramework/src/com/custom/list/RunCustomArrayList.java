package com.custom.list;

import java.util.ArrayList;

public class RunCustomArrayList {

	public static void main(String[] args) {
		ArrayListCustom<String> al = new ArrayListCustom(false);
		al.add("Mark");
		al.add("steve");
		al.add("bill");
		al.add("Mark");
		System.out.println(al.toString());
	}

}
