package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	String name;
	String location;
	String team;

	public Employee(String name, String location, String team) {

		this.name = name;
		this.location = location;
		this.team = team;
	}

}

public class PredicateAnd {

	public static void main(String[] args) {
		Employee e1 = new Employee("chandra", "HYD", "Developer");
		Employee e2 = new Employee("Gopi", "HYD", "Developer");
		Employee e3 = new Employee("setti", "Chennai", "tester");
		Employee e4 = new Employee("nax", "HYD", "Developer");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p1 = p -> p.location.equals("HYD");
		Predicate<Employee> p2 = p -> p.team.equals("Developer");
		Predicate<Employee> p3 = p->p.name.startsWith("c");
		
		Predicate<Employee> p = p1.and(p2).and(p3);

		for (Employee e : emps) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}

	}

}
