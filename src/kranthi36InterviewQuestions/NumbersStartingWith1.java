package kranthi36InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {
	
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(11,12,13,14,24,45,66);
		             List<Integer> collect = nums.stream().map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());
		             System.out.println(collect);
	}

}
