package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectOperation1 {

	public static void main(String[] args) {
		Per p1 = new Per("chandra", "india");
		Per p2 = new Per("sekhar", "india");
		Per p3 = new Per("surya", "usa");
		Per p4 = new Per("satya", "uk");

		List<Per> users = Arrays.asList(p1, p2, p3, p4);

		List<Per> indians = users.stream().filter(p -> p.location.equals("india")).collect(Collectors.toList());

		indians.forEach(i -> System.out.println(i));
		
		
		// 	collect names of persons who are belongs to india and store into names collection
		
		List<String> names=  users.stream().filter(p->p.location.equals("india")).map(p->p.name).collect(Collectors.toList());
		
		names.forEach(p-> System.out.println(p));
		

	}

}

class Per {
	String name;
	String location;

	public Per(String name, String location) {

		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Per [name=" + name + ", location=" + location + "]";
	}

}
