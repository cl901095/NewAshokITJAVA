package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class FindOutSecondJHigeshtNumber {
	public static void main(String[] args) {
		
		String s="I am a java developer";
		// find out second highest character in given string
		String string = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed())
				        .skip(1).findFirst().get();
		System.out.println(string);
	}

}
