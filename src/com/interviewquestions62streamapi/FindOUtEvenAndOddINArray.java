package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOUtEvenAndOddINArray {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9,0};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	//	Approach1
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
		    System.out.println(collect);    
		    
		    
		//aproach2
		    List<List<Integer>> collect2 = list.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList())).entrySet()
		    .stream().map(x->x.getValue()).collect(Collectors.toList());
		    
		    System.out.println(collect2);
	}

}
