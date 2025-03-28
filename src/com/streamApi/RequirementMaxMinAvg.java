package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RequirementMaxMinAvg {

	public static void main(String[] args) {
		User u1 = new User("chandra", 25000);
		User u2 = new User("sekhar", 35000);
		User u3 = new User("setti", 32000);
		User u4 = new User("kumar", 10000);

		List<User> names = Arrays.asList(u1, u2, u3, u4);

		Optional<User> max = names.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
		System.out.println("Max Salary :: " + max.get().salary);

		Optional<User> min = names.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
		System.out.println("Min Salary :: " + min.get().salary);

		Double avg = names.stream().collect(Collectors.averagingDouble(i -> i.salary));
		System.out.println("Average salary :: " + avg);
	}

}

class User {
	String name;
	double salary;

	public User(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + "]";
	}

}