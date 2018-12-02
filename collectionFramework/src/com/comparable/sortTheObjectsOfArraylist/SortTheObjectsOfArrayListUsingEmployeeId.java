package com.comparable.sortTheObjectsOfArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Question : Suppose there is an Employee class. We add Employee class Objects
 * to the ArrayList. Mention the steps need to be taken, if i want to sort the
 * objects in ArrayList using the employeeId attribute of Employee class.
 * 
 * Ans: step-1 : We have to implement the comparable interface for the Employee class and then to compare the objects by
 * employeeId we will override the emp1.compareTo(emp2) method.
 *      step-2 : We have to call Collections.sort() by passing the ArrayLsit as argument. 
 *       Collections.sort(empList);
 * 
 * @author Bikram
 *
 */
public class SortTheObjectsOfArrayListUsingEmployeeId {

	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee("Bikram", 2));
		al.add(new Employee("Biswajit", 10));
		al.add(new Employee("Tamal", 3));
		al.add(new Employee("Sukanta", 4));
		al.add(new Employee("Rintu", 7));

		Collections.sort(al);
		// iterate over the ArrayList
		Iterator<Employee> i = al.iterator();
		while (i.hasNext()) {
			Employee employee = (Employee) i.next();
			System.out.println(employee);
		}
		// using my sorting order (using comparator)
		System.out.println("Using My sorting order,, sorting by name");
		List<Employee> al1 = new ArrayList<>();
		al1.add(new Employee("Bikram", 2));
		al1.add(new Employee("Biswajit", 10));
		al1.add(new Employee("Tamal", 3));
		al1.add(new Employee("Sukanta", 4));
		al1.add(new Employee("Rintu", 7));
		 Collections.sort(al1, new MyComparator());
		 for(Employee e : al1){
			 System.out.println(e);
		 }
	}

}
