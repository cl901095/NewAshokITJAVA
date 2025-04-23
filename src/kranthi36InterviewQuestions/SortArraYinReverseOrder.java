package kranthi36InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortArraYinReverseOrder {
	
	public static void main(String[] args) {
		int [] arr= {5,2,8,1};
		int[] sorted=Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(sorted));
	}

}
