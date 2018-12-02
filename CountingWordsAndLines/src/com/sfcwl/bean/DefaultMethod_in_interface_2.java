package com.sfcwl.bean;

public interface DefaultMethod_in_interface_2 {
	// default method in interface
	default void m1(int j) {
		System.out.println("sum of j+j : " + (j + j));
		System.out.println("default method m1 () in DefaultMethod_in_interface_2");
	}

	// static method in interface
	static void m5() {
		System.out.println("static method m5 inside DefaultMethod_in_interface_2 interface");
	}

	void m4();

}

/**
 * __________need of introducing static method in interface___________
 * 
 * besides default method, java has introduced static method in interface.
 *  points to remember about static methods in interface.
 *  1. static methods will act as helper method. So declaring static method inside 
 *     the interface helps us to organize helper methods specific to interface 
 *     than to any separate class. 
 */
