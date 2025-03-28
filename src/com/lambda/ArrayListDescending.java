package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Approach 1
public class ArrayListDescending {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(4);
		a1.add(8);
		a1.add(90);
		a1.add(56);
		a1.add(67);
		System.out.println("Array list before sorting :: " + a1);

		// Collections.sort(a1, new MynewCompartaor());
		// Collections.sort(a1, (i,j)->i.compareTo(j)); //asecending order
		Collections.sort(a1, (i, j) -> (i > j) ? -1 : 1); // desecnding order by using lambda

		System.out.println("Arrays list after sorting using collection :: " + a1);

	}

}

class MynewCompartaor implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) {

		if (i > j) {
			return -1;

		} else if (i < j) {
			return 1;
		}
		return 0;
	}

}
