package com.interviewquestions62streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program38 {
//	Convert a list to a map|| Most Asked
	public static void main(String[] args) {
		
		List<Persons> personList= createPersonList();
		//System.out.println(personList);
		
		personList.stream().collect(Collectors.groupingBy(Persons::getCity))
		     .forEach((k,v)->System.out.println(k+" "+v));
		
		
		
	}
	private static List<Persons> createPersonList(){
		Persons person1=new Persons("chandu", "hyd", 24);
		Persons person2=new Persons("siva", "hyd", 24);
		Persons person3=new Persons("krishna", "chennai", 28);
		Persons person4=new Persons("keshaava", "kurnool", 25);
		Persons person5=new Persons("sivani", "guntur", 22);
		
		List<Persons> empList=new ArrayList<>();
		
		empList.add(person1);
		empList.add(person2);
		empList.add(person3);
		empList.add(person4);
		empList.add(person5);
		
		return empList;
	}

}
