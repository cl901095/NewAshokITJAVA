package com.interviewquestions62streamapi;

public class Personsss {
	
	String fname;
	String lname;
	public Personsss(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Personsss [fname=" + fname + ", lname=" + lname + "]";
	}
	

}
