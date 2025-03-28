package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByOperation1 {

	public static void main(String[] args) {
		Users u1 = new Users(1, "chandra", 30000, "india");
		Users u2 = new Users(2, "sekhar", 35000, "usa");
		Users u3 = new Users(3, "kishore", 3000, "canada");
		Users u4 = new Users(4, "surya", 3500, "india");
		Users u5 = new Users(5, "sataya", 300, "usa");

		List<Users> user = Arrays.asList(u1, u2, u3, u4, u5);

		Map<String, List<Users>> data = user.stream().collect(Collectors.groupingBy(e -> e.location));

		System.out.println(data);
	}

}

class Users {
	int id;
	String name;
	double salary;
	String location;

	public Users(int id, String name, double salary, String location) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}

}