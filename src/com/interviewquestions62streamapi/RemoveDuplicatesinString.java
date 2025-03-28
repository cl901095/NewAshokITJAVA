package com.interviewquestions62streamapi;

import java.util.Arrays;

public class RemoveDuplicatesinString {
	public static void main(String[] args) {
		
		String s="sdfghjsdfghjhgtredv";
		
		//Approach 1
	//	s.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
		
		//Approach 2  remoeve duplicates and come in same order
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}

}
