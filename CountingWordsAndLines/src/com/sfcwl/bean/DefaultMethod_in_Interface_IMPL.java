package com.sfcwl.bean;

public class DefaultMethod_in_Interface_IMPL implements DefaultMethod_in_interface_1{
	

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
		DefaultMethod_in_interface_1 dmi = new DefaultMethod_in_Interface_IMPL();
		dmi.m1(10);
		System.out.println(dmi.i);
		
	}
}
