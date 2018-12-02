package com.sh.immutable.construct;

import java.util.Date;

public final class HowToConstructImmutableClass {
	/**
	 * key points to construct immutable class
	 * --------------------------------------- 1. We have to declare the class
	 * as final so that it can't be inherited   2.  All the instance member
	 * variables should be declared as private so that it can't be accessible
	 * outside the class.      3. All the instance member variables should be
	 * declared as final so that it becomes constant.   4. We can't provide any
	 * setter method, only getter method should be allowed.   5. We have to
	 * provide the constructor to set values of member variables.
	 * 
	 */
	final private int studentId;
	final private String studentName;
	final private Date dateOfjoining;

	private HowToConstructImmutableClass(int studentId, String studentName, Date dateOfjoining) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfjoining = dateOfjoining;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Date getDateOfjoining() {
		return dateOfjoining;
	}

}
/**
 * If immutable class contains mutable reference or mutable instance variable
 * like Date or List Since, all member variables (both mutable & immutable) are
 * marked with private & final modifier, there is no opportunity to change
 * values from outside of class (including in a multi-threaded environment)
 * 
 * What are pre-defined immutable classes in Java (or in-built Java classes) ?
 * -------------------------------------------------------------------------

Answer: String and all wrapper classes like

Boolean
Character
Byte
Short
Integer
Long
Float
Double


Advantages of immutable class:
-------------------------------

The main advantage of making a immutable class is that

1. its thread-safe in a multi-threaded environment and
2. typically programmer doesn’t need to take care of synchronization

 */
