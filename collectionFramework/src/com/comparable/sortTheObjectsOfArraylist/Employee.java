package com.comparable.sortTheObjectsOfArraylist;

public class Employee implements Comparable<Employee>{
	public String name;
	public int id;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employee e) {
		int id1 = this.id;
		int id2 = e.id;
		if(id1<id2){
			return -1;
		}else if(id1>id2){
			return +1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}
