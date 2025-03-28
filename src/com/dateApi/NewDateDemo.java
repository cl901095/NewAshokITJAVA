package com.dateApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		ld = ld.plusDays(3);
		System.out.println(ld);

		ld = ld.plusWeeks(4);
		System.out.println(ld);

		ld = ld.plusMonths(2);
		System.out.println(ld);

		ld = ld.plusYears(4);
		System.out.println(ld);

		boolean leapYear = LocalDate.parse("2021-12-22").isLeapYear();
		System.out.println("Leap Year :: " + leapYear);

		boolean leapYear2 = LocalDate.parse("2022-12-22").isBefore(LocalDate.parse("2022-12-23"));
		System.out.println("Before Date :: " + leapYear2);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		time = time.plusHours(2);
		System.out.println(time);
		
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println(dateTime);
		
		// Period of time we want fro some days	
		Period between=Period.between(LocalDate.parse("2000-04-02"), LocalDate.now());
		System.out.println(between.getYears());
		
		// Duration pf time between two different times
		Duration time1=Duration.between(LocalTime.parse("18:00"), dateTime.now());
		System.out.println(time1);
		
		// we want to set particular date
		LocalDate of= LocalDate.of(2021, 1, 12);
		System.out.println(of);
	}

}
