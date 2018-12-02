package com.conversin.from.list.to.map;

public class Employee {
	private int empId;
	private String employeeName;
	private float salary;
	private int age;
	private String designation;
	
	public Employee(int empId, String employeeName, float salary, int age, String designation) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", salary=" + salary + ", age=" + age
				+ ", designation=" + designation + "]";
	}
	
	
}
