package com.dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApiDemo {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		// Coverting Date to String
		// It will give date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);

		// It will give short Month
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);

		// It will give full Month Name
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMMM/yyyy");
		String format2 = sdf2.format(d);
		System.out.println(format2);

		// It will give last two digits of year
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MMMM/yy");
		String format3 = sdf3.format(d);
		System.out.println(format3);

		// Indian format->"dd/MM/yyyy"
		// US format->"MM/dd/yyyy"
		SimpleDateFormat sdf4 = new SimpleDateFormat("MM/dd/yyyy");
		String format4 = sdf4.format(d);
		System.out.println(format4);

		// Coverting String to Date
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd");
		Date format5 = sdf5.parse("2022-12-23");
		System.out.println(format5);
		
		

	}

}
