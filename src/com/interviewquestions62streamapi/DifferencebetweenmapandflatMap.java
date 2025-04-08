package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferencebetweenmapandflatMap {

	public static void main(String[] args) {
		List<Personss> persons=Arrays.asList(
				               new Personss("Alic", Arrays.asList("red","blue")),
				               new Personss("chnadra", Arrays.asList("green")),
				               new Personss("charile", Arrays.asList("yellow","pink","purple"))); 
		//Map
		List<List<String>> collect = persons.stream().map(Personss::getColor).collect(Collectors.toList());

		System.out.println(collect);
		
		//FlatMap
	   List<String> collect2 = persons.stream().flatMap(x->x.getColor().stream()).collect(Collectors.toList());
	   System.out.println(collect2);
	}

}
