package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapOperations3 {

	public static void main(String[] args) {
		Employee e1 = new Employee("chandra", 24, 28000);
		Employee e2 = new Employee("setti", 25, 35000);
		Employee e3 = new Employee("gopi", 30, 45000);
		Employee e4 = new Employee("nax", 23, 22000);

		List<Employee> user = Arrays.asList(e1, e2, e3, e4);
		// my answer
		user.stream().filter(i -> i.salary > 25000).forEach(i -> System.out.println(i.name + " " + i.age));
		// Ashok answer
		user.stream().filter(i -> i.salary > 25000).map(i -> i.name + " - " + i.age)
				.forEach(i -> System.out.println(i));
	}

}

class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
