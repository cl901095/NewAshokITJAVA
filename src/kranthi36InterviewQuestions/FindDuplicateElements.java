package kranthi36InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,1,2,3,4,9);
		Set<Integer> set=new HashSet<>();
		
		List<Integer> collect = list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
