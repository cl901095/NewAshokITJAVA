package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {

	String name;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}

public class PersonAge {

	public static void main(String[] args) {
		
		Person p5=new Person("chandra", 24);
		Person p1=new Person("sekhar", 10);
		Person p2=new Person("anil", 32);
		Person p3=new Person("gopi", 38);
		
		List<Person> persons=Arrays.asList(p5,p1,p2,p3);
		
		Predicate<Person> predicate=p->p.age>=18;
		
		for(Person person :persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}

		
	}

}
