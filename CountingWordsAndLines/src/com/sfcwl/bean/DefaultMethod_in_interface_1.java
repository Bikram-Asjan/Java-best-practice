package com.sfcwl.bean;

// prior to java 8 only abstract method is allowed in interface.
public interface DefaultMethod_in_interface_1 {
	int i = 10;
	
	// default method in interface
	default void m1(int j) {
		System.out.println("multiuply of j*j : "+j*j);
		System.out.println("default method m1 () DefaultMethod_in_interface_1");

	}
	// default method in interface
	default void m3(){
		System.out.println("default method m3() ");
	}
	// abstract method in interface. by default it is public and abstract 
	void m2();
}
/**
 * We can write concrete method in interface in java 1.8 version But we have to
 * follow certain rules. The method we want to declare as concrete method inside
 * the interface, should be only default not public. Inside the interface by
 * default each and every method is public and abstract, even we don't mark it as 
 * abstract method.
 * 
 * Suppose i have an interface and 10 implementations are there. Inside the interface 
 * 5 methods are there. Now i want m6() method for additional functionality which i want to apply for 
 * 5 implementations class. So if we declare m6() method in interface, then all the implementation class
 * should override that method which i don't want. So if we declare one concrete method in interface, then 
 * all the implementation class need not to override, in 5 implementation class override m6() method.
 * 
 * If we want to take concrete method in interface, then go for abstract class, why java 1.8 features
 * has given concrete method support in interface. Instead of this you can take abstract class.
 * 
 * Suppose i have existing project, here one interface is there and lots of implementations are 
 * there. If want to declare one method which i want for few implementations class. Then i can take abstract class
 * instead of interface.
 * But i need to modify lots of classes which implements form that interface. Instead of implements we have to write 
 * extends. But if java supports for allowing concrete method in interface, then just declare concrete method in
 * interface and override that method in those classes wherever i want. That's why java 8 has this support. 
 * 
 * 
 * *****************_________abstract class vs interface in java 8____******************
 * 
 * 1. abstract class contains member variables. but in interface all variables are constants.
 * 2. it can have constructors. but interface can't have.
 * 3. Abstract class can hold the state of an object using instance member variables.but  in interface all variables 
 *    are static and final, therefore, it can't hold the state of an object. 
 * 4. When a class extends from Abstract class, either it has to implement all the abstract methods or the class
 *    should be declared as abstract. But if a class implements from interface, then it never forces to override 
 *    default methods  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */