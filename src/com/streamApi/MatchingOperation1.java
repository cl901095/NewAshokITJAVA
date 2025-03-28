package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingOperation1 {
	public static void main(String[] args) {
		
		Employeee e1=new Employeee("chandra", "India");
		Employeee e2=new Employeee("surya", "Maleysia");
		Employeee e3=new Employeee("kishore", "USA");
		Employeee e4=new Employeee("satya", "Chicago");
		
		List<Employeee> users=Arrays.asList(e1,e2,e3,e4);

		//1) anyMatch()
		boolean status= users.stream().anyMatch(p->p.location.equals("USA"));
		System.out.println("Any from in USA  = "+status);
		
		//2) allMatch()
		boolean status1=  users.stream().allMatch(p->p.location.equals("India"));
		System.out.println("is it all from INdia = "+status1);
		
		//3) noneMatch()
		boolean status2=users.stream().noneMatch(p->p.location.equals("India"));
		System.out.println("Is any body from india = "+status2);
	}

}

class Employeee {
	String name;
	String location;

	public Employeee(String name, String location) {
		this.name = name;
		this.location = location;
	}

}
