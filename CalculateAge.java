package com.guvi.tak5;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
	public static void main(String[] args) {
	    // Get the user's birthdate
	    LocalDate birthdate = LocalDate.of(1994, 11, 15); 
	    // Get the current date
	    LocalDate currentDate = LocalDate.now();

	    // Calculate the age in years
	    int age = Period.between(birthdate, currentDate).getYears();

	    // Display the user's age
	    System.out.println("You are " + age + " years old.");
	  }
}

/*
 You are 29 years old.

 
*/