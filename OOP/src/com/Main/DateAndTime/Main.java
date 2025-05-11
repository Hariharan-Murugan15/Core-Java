package com.Main.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {
	public static void main(String ...a) {
		
		LocalDateTime obj1 = LocalDateTime.now();
		LocalDate obj2 = LocalDate.now();
		LocalTime obj3 = LocalTime.now();
		
		DateTimeFormatter formattedObj = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");
		
		String formattedDateAndTime = obj1.format(formattedObj);
		String formattedTime = obj3.format(DateTimeFormatter.ofPattern("HH--mm--ss--nn"));
		String formattedDate = obj2.format(DateTimeFormatter.ofPattern("yy--MM--dd"));
		
		System.out.println(formattedDateAndTime);
		System.out.println(formattedTime);
		System.out.println(formattedDate);
		
	}
}
