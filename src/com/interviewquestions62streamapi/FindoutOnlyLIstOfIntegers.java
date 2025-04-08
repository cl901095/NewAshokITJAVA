package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindoutOnlyLIstOfIntegers {
	public static void main(String[] args) {
		
		String [] s= {"abc","bcd","128","098","98"};
		
		 List<Integer> collect = Arrays.stream(s).filter(x->x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
		 System.out.println(collect);
	}

}
