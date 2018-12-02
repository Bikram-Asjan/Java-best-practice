package com.bik;

public class Test {

	static int hash(Object x) {
		  int h = x.hashCode();
		  System.out.println(h);
		 // System.out.println(h << 7);
		  //System.out.println((h << 7) - h);
		 // System.out.println((h >>> 9));
		  //System.out.println(Math.floor(5/Math.pow(2, 9))); // 0
		 // System.out.println(h >>> 17);
		  //System.out.println(Math.floor(5/Math.pow(2, 17)));
		  return (h << 7) - h + (h >>> 9) + (h >>> 17);
		}
	public static void main(String[] args) {
		int hashValue = hash("bikram");
		System.out.println(hashValue);
		System.out.println(hashValue & 0x1F);
		
	}
}


