package com.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("-");

		sj.add("chandra");
		sj.add("lingisetti");
		sj.add("sekhar");

		System.out.println(sj);

		StringJoiner sj1 = new StringJoiner("-", "(", ")");
		sj1.add("tcs");
		sj1.add("sj2");
		sj1.add("sj3");
		System.out.println(sj1);

	}
}
