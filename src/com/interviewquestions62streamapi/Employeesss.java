package com.interviewquestions62streamapi;

public class Employeesss {
	String name;
	String department;
	Double salary;
	public Employeesss(String name, String department, Double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeesss [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	

}
