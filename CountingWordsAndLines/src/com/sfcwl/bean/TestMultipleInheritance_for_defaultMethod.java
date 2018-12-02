package com.sfcwl.bean;

public class TestMultipleInheritance_for_defaultMethod
		implements DefaultMethod_in_interface_1, DefaultMethod_in_interface_2 {

	@Override
	public void m4() {
		System.out.println("override method m4 is calling");
	}
	 public void m1(int j){
	    DefaultMethod_in_interface_2.super.m1(4);	
	    
	   }
	@Override
	public void m2() {
		System.out.println("override method m2 is calling");
	}
	public static void main(String[] args) {
		TestMultipleInheritance_for_defaultMethod mi = new TestMultipleInheritance_for_defaultMethod();
		mi.m1(5);
		DefaultMethod_in_interface_2 dmi = new TestMultipleInheritance_for_defaultMethod();
		// calling using parent reference
		dmi.m1(6);
		
		// calling static method
		DefaultMethod_in_interface_2.m5();
	}
	
}
/**
 * In java 1.8 we can declare default method. But if there are two interface with the 
 * same default method (same method signature), and one class is implements from both 
 * the interfaces then compile time error comes saying-----
 *           duplicate default methods named m1(int) and (int) are inherited from the 
 *           type DefaultMethod_in_interface_1 and DefaultMethod_in_interface_2
 *           
 * solution for multiple inheritance.
 * when we are implementing both interfaces having same default method, then to 
 * resolve ambiguity problem we have to provide empty implementation. Then we can 
 * call one of the interface using super keyword like in this way....
 * 
 *            interfaceName.super.defaultMethodName
 *            DefaultMethod_in_interface_2.super.m1(4);
 *            
 *   _______Points about default method._______
 *   
 *   1. this could be used as utility method.
 *   2. default method supports lambda expression which is again a new feature in java 8.
 *    
 *   
 */
















