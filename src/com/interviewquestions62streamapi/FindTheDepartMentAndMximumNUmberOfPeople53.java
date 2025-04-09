package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheDepartMentAndMximumNUmberOfPeople53 {
	
	public static void main(String[] args) {
		
		List<Employesss> emp=Arrays.asList(new Employesss("chandu", "IT"),
				                                 new Employesss("sekhar", "finance"),
				                                 new Employesss("siva", "IT"),
				                                 new Employesss("kumar", "finance"),
				                                 new Employesss("raju", "finance"));
		
		Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(Employesss::getDepartment,Collectors.counting()));
		System.out.println(collect);
		
		Optional<Entry<String, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
		max.ifPresent(x->System.out.println(x.getKey()+" "+x.getValue()));
	}

}
