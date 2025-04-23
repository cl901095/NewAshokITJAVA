package kranthi36InterviewQuestions;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,4,4,5,6,7,8,9,9);
		
		 List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		 System.out.println(collect);
	}
}
