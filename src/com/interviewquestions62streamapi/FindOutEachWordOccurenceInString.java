package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutEachWordOccurenceInString {
	public static void main(String[] args) {
		
		String s="I am a java devloper chandu chandu";
		
		//Apporach1
		Map<String, Long> ans = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(ans);
		
		//Approach2
        Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		                       System.out.println(collect);
	}

}
