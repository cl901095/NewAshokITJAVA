package com.interviewquestions62streamapi;

public class Employeess {
	
	double salary;
	String name;
	public Employeess(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employeess [salary=" + salary + ", name=" + name + "]";
	}
	

}
