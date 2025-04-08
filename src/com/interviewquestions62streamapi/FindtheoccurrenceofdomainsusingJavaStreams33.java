package com.interviewquestions62streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheoccurrenceofdomainsusingJavaStreams33 {

	public static void main(String[] args) {
		Employee e1 = new Employee("chandu", "chandu123@gmail.com");
		Employee e2 = new Employee("sekhar", "sekhar123@yahooo.com");
		Employee e3 = new Employee("ligisetti", "ligisetii123@gmail.com");

		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		System.out.println(emplist.stream().map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	}

}
