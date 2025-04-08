package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class Prgram36 {
	
	public static void main(String[] args) {
		
		List<Person> persons=Arrays.asList(new Person("Max", 18),
				              new Person("chandu", 23),
				              new Person("chandra",24),
				              new Person("krishna", 26));
		
		            Collector<Person, StringJoiner, String> personcollector=
		            		Collector.of(
		            				()->new StringJoiner(" | "),
		            				 (j,p)->j.add(p.name.toString().toUpperCase()),
		            				 (j1,j2)->j1.merge(j2),
		            				  StringJoiner::toString);
		            
		            String names=persons.stream().collect(personcollector);
		            System.out.println(names );
		            
	}

}
