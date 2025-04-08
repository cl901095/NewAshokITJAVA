package com.interviewquestions62streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAll0tostartingOfArray {
	public static void main(String[] args) {

		int[] arr = { 4, 2, 17, 0, 3, 40, 0 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//Approah1
		List<Integer> zeros = list.stream().filter(x -> x == 0).collect(Collectors.toList());
		List<Integer> nonZeros = list.stream().filter(x -> x != 0).collect(Collectors.toList());
		List<Integer> listfinal = new ArrayList<>();
		listfinal.addAll(zeros);
		listfinal.addAll(nonZeros);
		System.out.println(listfinal);

		//Approach2
		    List<Integer> ans = list.stream().collect(Collectors.partitioningBy(x->x!=0)).values().stream().flatMap(x->x.stream())
		                 .collect(Collectors.toList());
		    System.out.println(ans);
	}

}
