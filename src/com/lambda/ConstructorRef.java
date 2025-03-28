package com.lambda;

import java.util.function.Supplier;

class Doctor {
	public Doctor() {
		System.out.println("this is doctor contructor ");
	}
}

public class ConstructorRef {

	public static void main(String[] args) {

		Supplier<Doctor> d = Doctor::new;
		Doctor doctor = d.get();

		System.out.println(doctor.hashCode());

	}

}
