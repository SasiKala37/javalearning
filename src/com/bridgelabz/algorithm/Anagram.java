package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class Anagram {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter the first string");
		String firstString = util.userInputString();
		System.out.println("Enter the second string");
		String secondString = util.userInputString();
		boolean result = Util.isAnagram(firstString, secondString);
		if (result) {
			System.out.println("Entered Strings are Anagram ");
		} else {
			System.out.println("Entered Strings are not Anagram ");
		}

	}

}
