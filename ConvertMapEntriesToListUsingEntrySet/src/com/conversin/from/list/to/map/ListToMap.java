package com.conversin.from.list.to.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(1, "bikram", 50000, 26, "software developer"));
		listOfEmployee.add(new Employee(2, "narayana", 500000, 32, "Architech"));
		listOfEmployee.add(new Employee(3, "alex", 30000, 24, "software developer"));

		// conversion from list to map
		Map<Integer, String> dataMap = new HashMap<Integer, String>();
		
		for (Employee employee : listOfEmployee) {
			dataMap.put(employee.getEmpId(), employee.getEmployeeName());
		}
		System.out.println(dataMap);
	}

}
