package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNameLastName51 {
	
	public static void main(String[] args) {
		
		List<Personsss> people=Arrays.asList(new Personsss("chandra", "lingisetti"),
				                           new Personsss("siva", "Ankamereddy"),
				                           new Personsss("gopi", "boppudi"),
				                           new Personsss("mani", "bondali")
				                           );
		
		// Given a Person Object where each person has a first name and last name.
		//Sort the List<Person> by their first name then by last Name;
		people.stream().sorted(Comparator.comparing(Personsss::getLname)
				       .thenComparing(Personsss::getFname))
		               .collect(Collectors.toList())
		               .forEach(System.out::println);
	}
	
	
	

}
