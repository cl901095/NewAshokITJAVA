package com.interviewquestions62streamapi;

public class Employees {
	
	String name;
	String email;
	Integer age;
	char gender;
	public Employees(String name, String email, Integer age, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
