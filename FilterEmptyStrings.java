package com.guvi.tak5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmptyStrings {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("Mango");
    strings.add("");
    strings.add("apple");
    strings.add("");
    strings.add("jamun");
    strings.add("");
    strings.add("pink");

    // Filter empty strings
    List<String> nonEmptyStrings = strings.stream()
        .filter(str -> !str.isEmpty())
        .collect(Collectors.toList());

    // Print non-empty strings
    System.out.println("Non-empty strings:");
    for (String str : nonEmptyStrings) {
      System.out.println(str);
    }
  }
}


/*
 * Non-empty strings:
Mango
apple
jamun
pink
*/

