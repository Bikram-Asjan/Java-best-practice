package com.comparable.sortTheObjectsOfArraylist;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String name1 = e1.name;
		String name2 = e2.name;
		
		return name1.compareTo(name2);
	}
	
}
