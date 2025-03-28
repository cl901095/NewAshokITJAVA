package com.streamApi;

import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {

		Student s1 = new Student("chandra", 1);
		Student s2 = new Student("sekhar", 2);
		Student s3 = new Student("ashok", 3);
		Student s4 = new Student("srinni", 4);
		Student s5 = new Student("parsad", 5);
		Student s6 = new Student("huna", 6);

		Stream<Student> user = Stream.of(s1, s2, s3, s4, s5, s6);
		// single filter using
		// user.filter(i -> i.id > 1 && i.name.startsWith("s")).forEach(i ->
		// System.out.println(i));
		// using another filter
		user.filter(i -> i.id > 1).filter(i -> i.name.startsWith("s")).forEach(i -> System.out.println(i));
	}

}

class Student {
	String name;
	int id;

	public Student(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
