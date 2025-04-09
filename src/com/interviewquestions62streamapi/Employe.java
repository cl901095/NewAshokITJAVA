package com.interviewquestions62streamapi;

public class Employe {
	
	int id;
	String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	

}
