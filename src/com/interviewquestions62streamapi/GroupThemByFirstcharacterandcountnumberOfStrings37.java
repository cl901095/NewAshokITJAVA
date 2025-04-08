package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupThemByFirstcharacterandcountnumberOfStrings37 {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("chandu","sekhar","chnadra","sankar","gopi","siva");
		
		Map<Character, Long> collect = names.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
		
		System.out.println(collect);
	}

}
