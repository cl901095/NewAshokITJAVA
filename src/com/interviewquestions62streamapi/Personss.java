package com.interviewquestions62streamapi;

import java.util.List;

public class Personss {
	
	String name;
	List<String> color;
	public Personss(String name, List<String> color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Personss [name=" + name + ", color=" + color + "]";
	}

}
