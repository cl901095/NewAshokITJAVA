package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertlistofstringintomapoStringanditsequivalentlength57 {

	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("banana","grapes","mango","kiwi","mango");
				
				Map<String, Integer> collect = fruits.stream()
						                             .collect(Collectors.toMap(fruit->fruit, String::length,(existing,duplicate)->duplicate));
		
		System.out.println(collect);

	}

}
