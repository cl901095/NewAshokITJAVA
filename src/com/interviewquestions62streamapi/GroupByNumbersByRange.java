package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByNumbersByRange {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,10,13,14,22,24,25,34,36,46,47,52,56};
		
		  List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	  Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x->x/10*10,LinkedHashMap::new,Collectors.toList()));
	  System.out.println(collect);
	}

}
