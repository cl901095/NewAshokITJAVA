package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutAverageAgeOfMaleAndFemale {
	
	public static void main(String[] args) {
		
		Employees e1=new Employees("anil","anil@gmail.com",24,'M');
		Employees e2=new Employees("chandu","chandu@gmail.com",27,'M');
		Employees e3=new Employees("siva","siva@gmail.com",40,'F');
		Employees e4=new Employees("gopi","gopi@gmail.com",45,'M');
		Employees e5=new Employees("sekhar","sekhar@gmail.com",30,'F');
		
		
		List<Employees> asList = Arrays.asList(e1,e2,e3,e4,e5);
		
 Map<Character, Double> collect = asList.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingInt(Employees::getAge)));
	  	
      System.out.println(collect);
	}

}
