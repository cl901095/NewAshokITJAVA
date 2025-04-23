package kranthi36InterviewQuestions;

public class CountVowlesinSentance {
	
	public static void main(String[] args) {
		
		String sentence="I am a javadeveloper";
		
		        long count = sentence.toLowerCase().chars().filter(ch->"aeiou".indexOf(ch)!=-1).count();
		        System.out.println(count);
	}

}
