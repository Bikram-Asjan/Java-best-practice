package com.tricky;

public class A {

	
	public void foo(boolean a, boolean b){
		if(a){
			System.out.println("A");
		} else if(a && b){
			System.out.println("A && B");
		} else {
			if(!b){
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}
	}
	void start(){
		long[] a1 ={3, 4, 5};
		long[] a2 = fix(a1);
		System.out.println(a1[0] + a1[1]+ a1[2]+" ");
		System.out.println(a2[0] + a2[1] + a2[2]);
	}
	long[] fix(long[] a3){
		a3[1] = 7;
		return a3;
	}
	public static void main(String[] args) {
		/*A a = new A();
		//a.foo(false, true);
		//a.start();
		try{
			badMethod();
			System.out.println("A");
		} catch (Exception e){
			System.out.println("B");
		} finally{
			System.out.println("C");
		}
		System.out.println("D");*/
		
	}
	public static void badMethod(){
		throw new Error();
	}
  }

