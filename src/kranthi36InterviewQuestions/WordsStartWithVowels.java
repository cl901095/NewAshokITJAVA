package kranthi36InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartWithVowels {
	
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("banana","grapes","mango","carrot","umberlla");
		List<String> collect = words.stream().filter(w->w.toLowerCase().matches(("^[aeiou].*"))).collect(Collectors.toList());
		
		System.out.println(collect);
				
	}

}
