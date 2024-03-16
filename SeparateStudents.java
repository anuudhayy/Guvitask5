package com.guvi.tak5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//import com.sun.tools.javac.util.List;

public class SeparateStudents {

	  public static void main(String[] args) {
	    // Create a list of student names
	    List<String> studentNames = new ArrayList<>();
	    studentNames.add("Anu");
	    studentNames.add("Arthy");
	    studentNames.add("vicky");
	    studentNames.add("Mithra");
	    studentNames.add("Naresh");
	    studentNames.add("Anu"); // Add some duplicates

	    // Filter students whose names start with "A"
	    List<String> studentsStartingWithA = studentNames.stream()
	        .filter(name -> name.startsWith("A"))
	        .collect(Collectors.toList());

	    // Print the names of students starting with "A"
	    System.out.println("Students starting with A:");
	    for (String name : studentsStartingWithA) {
	      System.out.println(name);
	    }
	  }
	}
/*
 * Students starting with A:
Anu
Arthy
Anu

*/
