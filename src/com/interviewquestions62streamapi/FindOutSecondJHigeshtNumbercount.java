package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class FindOutSecondJHigeshtNumbercount {
	
	public static void main(String[] args) {
		String s="I am a java developer";
		// find second highest word length
		Integer count = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder())
				       .skip(1).findFirst().get();
		System.out.println(count);
	}

}
