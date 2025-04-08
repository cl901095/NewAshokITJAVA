package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvoiComplexProbelms44 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("chandu", 24), new Person("sekhar", 67),
				new Person("siva", 26), new Person("kunar", 30));

		// Bad Practice
		List<String> collect = personList.stream().filter(x -> x.getAge() > 30).map(Person::getName).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(collect);

		// Good Practice
		List<String> collect2 = personList.stream().filter(x -> x.getAge() > 30).map(Person::getName)
				.collect(Collectors.toList());
		List<String> collect3 = collect2.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect3);
	}

}
