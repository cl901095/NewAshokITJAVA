package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class FIndHigeshtWordLength {
	public static void main(String[] args) {
		
		String s="I am a java developer with experinces 3 years";
		
		String ans=Arrays.stream(s.split(" "))
				         .max(Comparator.comparing(String::length)).get();
		
		System.out.println(ans);
		
	}

}
