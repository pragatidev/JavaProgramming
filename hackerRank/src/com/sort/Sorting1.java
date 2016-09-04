package com.sort;

/**
 * 
 */

//Sorting1.java
//
//This version uses the Comparator<T> interface (using generics)
//but implements the interface with regular classes (not inner classes)
//that are separate from the main class

import java.util.*;

//Example of how to sort an array several different ways
public class Sorting1 {
	static String[] nameArray = { "Bob", "Fred", "Ralph", "Joe", "Wanda", "Joanna", "billy Joe", "jennifer", "John" };

	public static void main(String[] args) {
		// print the original unsorted array
		System.out.println("");
		printRuleAndArray("Original name list:");

		// sorting by 'natural ordering'
		Arrays.sort(nameArray);
		printRuleAndArray("Sorted by 'natural ordering' " + "(lexicographic):");

		// sorting by length
		Arrays.sort(nameArray, new LengthCompare());

		printRuleAndArray("Sorted list by name length:");

		// sorting alphabetically
		Arrays.sort(nameArray, new AlphaCompare());

		printRuleAndArray("Sorted list in alphabetical order:");

		// sorting lexicographically by last letter
		Arrays.sort(nameArray, new LastLetterCompare());

		printRuleAndArray("Sorted list in lexicographic order " + "of last letter:");
	}

	static void printRuleAndArray(String rule) {
		System.out.println(rule);
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		System.out.println("");
	}

}

// implement Comparator to compare Strings by length
class LengthCompare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return (s1.length() - s2.length());
	}
}

// implement Comparator to compare Strings alphabetically
class AlphaCompare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return (s1.toLowerCase().compareTo(s2.toLowerCase()));
	}
}

// implement Comparator to compare Strings by last letter
class LastLetterCompare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
	}
}