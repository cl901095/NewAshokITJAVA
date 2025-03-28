package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst1 {

	public static void main(String[] args) {

		Person p1 = new Person("chandra", "tcs");
		Person p2 = new Person("surya", "tcs");
		Person p3 = new Person("setti", "virtusa");

		List<Person> user = Arrays.asList(p1, p2, p3);

		Optional<Person> findFirst = user.stream().filter(p -> p.company.equals("tcs")).findFirst();

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}
}

class Person {
	String name;
	String company;

	public Person(String name, String company) {

		this.name = name;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", company=" + company + "]";
	}

}