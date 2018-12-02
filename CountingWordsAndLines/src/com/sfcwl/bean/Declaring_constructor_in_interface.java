package com.sfcwl.bean;

public interface Declaring_constructor_in_interface {
	//Declaring_constructor_in_interface(){}
	
}

/**
* if we declare constructor in interface, then compile time error comes
* saying "interface can not have constructors".
* 
* But why java does not allow defining constructor inside interface.
*    First we have to know about java interface. 
*    key points: 
*     			1. variables defined in interface are public static final.
*     			2. we have to initialize the variables. If it is not initialized
*      					compile time error comes.
*     			3. By defaults methods are public and abstract.
*     			4. static methods are not allowed. If we try to add static keyword
*     				to abstract method, compiler throws errors.
*     			5. At interface declaration only public and abstract modifiers are allowed.
*     
*     now why interface doesn't allow constructor.
*     
*     generally we create new instance of a class to hold specific instance values using 
*     member variables(i.e. state of an object) and to access member methods using 
*     newly created object.
*                          But in java interface all variables are static and
*     thus belongs to class, so there is no point of holding specific instance values.
*                          Again objects are used to invoke member methods but all the methods
*     are abstract and its implementation is given by implementing classes. So there is no need to invoke those 
*     abstract methods. As we know constructors comes in picture when we are creating object. Since there is no
*     need of creating object and thus constructor is not required in java interface. 
*        
*/

// 