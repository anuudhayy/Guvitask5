package com.guvi.tak5;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConverter {

		  public static void main(String[] args) {
		    List<String> names = List.of("apple", "banana", "cherry");

		    // Convert names to uppercase using streams
		    List<String> uppercaseNames = names.stream()
		        .map(String::toUpperCase)
		        .collect(Collectors.toList());

		    // Print the names in uppercase
		    System.out.println("Names in uppercase:");
		    for (String name : uppercaseNames) {
		      System.out.println(name);
		    }
		  }
		}

/*
 * Names in uppercase:
APPLE
BANANA
CHERRY

 */
