package com.lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface {

	public void m1();
}

public class MethodRef {

	public static void m2() {
		System.out.println("this is m2 method");
	}

	public static void main(String[] args) {

		MyInterface mi = MethodRef::m2;
		mi.m1();

		Consumer<String> consumer = (msg) -> System.out.println(msg);
		consumer.accept("chandra hi");
	}

}
