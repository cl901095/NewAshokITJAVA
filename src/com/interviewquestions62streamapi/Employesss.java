package com.interviewquestions62streamapi;

public class Employesss {

	String name;
	String department;
	public Employesss(String name, String department) {
		super();
		this.name = name;
		this.department = department;
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
	@Override
	public String toString() {
		return "Employesss [name=" + name + ", department=" + department + "]";
	}
	
}
