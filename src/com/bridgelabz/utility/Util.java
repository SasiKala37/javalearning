package com.bridgelabz.utility;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class Util {
	public Scanner scanner = new Scanner(System.in);

	public String userInputString() {
		return scanner.next();
	}

	public int userInputInteger() {
		return scanner.nextInt();
	}

	public Double userInputDouble() {
		return scanner.nextDouble();
	}

	public boolean userInputBoolean() {
		return scanner.nextBoolean();
	}

	/**
	 * check whether the given strings are anagram or not
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	public static boolean isAnagram(String firstString, String secondString) {
		firstString = removeSpace(firstString);
		secondString = removeSpace(secondString);
		if (firstString.length() != secondString.length()) {
			return false;
		} else {
			firstString = toLowerCase(firstString);
			secondString = toLowerCase(secondString);
			boolean result = checkString(firstString, secondString);
			return result;
		}
	}

	/**
	 * Remove the space in given String
	 * 
	 * @param inputString
	 * @return
	 */
	public static String removeSpace(String inputString) {
		char[] charString = inputString.toCharArray();
		inputString = "";
		for (int i = 0; i < charString.length; i++) {
			if (charString[i] != ' ') {
				inputString = inputString + charString[i];
			}
		}
		return inputString;
	}

	/**
	 * To convert the upper case to lower case characters
	 * 
	 * @param inputString
	 * @return
	 */
	public static String toLowerCase(String inputString) {
		char[] charString = inputString.toCharArray();
		for (int i = 0; i < charString.length; i++) {
			if (charString[i] >= 65 || charString[i] <= 91) {
				charString[i] += 32;
			}
		}
		return new String(charString);
	}

	/**
	 * check whether the given strings are having same characters
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	public static boolean checkString(String firstString, String secondString) {
		char[] charString1 = firstString.toCharArray();
		char[] charString2 = secondString.toCharArray();
		charString1 = sort(charString1);
		charString2 = sort(charString2);
		for (int i = 0; i < charString2.length; i++) {
			if (charString1[i] != charString2[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * sort the characters in ascending order
	 * 
	 * @param charString
	 * @return
	 */
	public static char[] sort(char charString[]) {
		for (int i = 0; i < charString.length; i++) {
			for (int j = i + 1; j < charString.length; j++) {
				if (charString[i] > charString[j]) {
					char temp = charString[i];
					charString[i] = charString[j];
					charString[j] = temp;
				}
			}
		}
		return charString;
	}

	/**
	 * find the prime numbers in the between the given range 0-1000
	 * 
	 * @param higherLimit
	 */
	public static void findPrimeNumbers(int higherLimit) {
		int count;
		for (int i = 1; i <= higherLimit; i++) {
			count = 0;
			for (int j = 1; j <= higherLimit; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(i);
		}

	}

	public static void isPalindrome(int higherLimit) {
		int lowerLimit = 0;
		// int reverseNumber=0;
		while (lowerLimit <= higherLimit) {
			// reverseNumber = reverseNumber*10 + num%10;
			// num = num/10;
		}
	}

	/**
	 * Searching the array of integers using binary search technique
	 * 
	 * @param arrayOfIntegers
	 * @param low
	 * @param high
	 * @param searchElement
	 * @return
	 */
	public static int binarySearchInt(int[] arrayOfIntegers, int low, int high, int searchElement) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (arrayOfIntegers[mid] == searchElement) {
				return mid;
			} else if (arrayOfIntegers[mid] > searchElement) {
				return binarySearchInt(arrayOfIntegers, low, mid - 1, searchElement);
			} else {
				return binarySearchInt(arrayOfIntegers, low, mid + 1, searchElement);
			}
		}
		return -1;
	}

	/**
	 * Sorting the array of integers using bubble sort technique
	 * 
	 * @param lengthOfTheArray
	 */
	public void bubbleSort(int lengthOfTheArray) {
		int[] arrayOfIntegers = new int[lengthOfTheArray];

		System.out.println("Enter integer elements");
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = userInputInteger();
		}

		for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
			for (int j = 0; j < arrayOfIntegers.length - i - 1; j++) {
				if (arrayOfIntegers[j] > arrayOfIntegers[j + 1]) {
					int temp = arrayOfIntegers[j];
					arrayOfIntegers[j] = arrayOfIntegers[j + 1];
					arrayOfIntegers[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			System.out.print(arrayOfIntegers[i] + "  ");
		}
	}

	/**
	 * Sorting the array of integers using insertion sort technique
	 * 
	 * @param lengthOfTheArray
	 */
	public void insertionSort(int lengthOfTheArray) {
		int[] arrayOfIntegers = new int[lengthOfTheArray];

		System.out.println("Enter integer elements");
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = userInputInteger();
		}

		for (int i = 0; i < arrayOfIntegers.length; i++) {
			int key = arrayOfIntegers[i];
			int j = i - 1;
			while (j >= 0 && arrayOfIntegers[j] > key) {
				arrayOfIntegers[j + 1] = arrayOfIntegers[j];
				j = j - 1;

			}
			arrayOfIntegers[j + 1] = key;
		}
		System.out.println("Prints the sorted elements");
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			System.out.print(arrayOfIntegers[i] + "  ");
		}
	}

	/**
	 * Searching the array of strings using binary search technique
	 * 
	 * @param arrayOfString
	 * @param low
	 * @param high
	 * @param searchString
	 * @return
	 */
	public static boolean binarySearchString(String[] arrayOfString, int low, int high, String searchString) {
		// arrayOfString=bubbleSortForString(arrayOfString);

		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (arrayOfString[mid].compareTo(searchString) == 0) {
				return true;
			} else if (arrayOfString[mid].compareTo(searchString) > 0) {
				return binarySearchString(arrayOfString, low, mid - 1, searchString);
			} else {
				return binarySearchString(arrayOfString, low, mid + 1, searchString);
			}

		}
		return false;
	}

	/**
	 * Sorting the array of strings using bubble sort technique
	 * 
	 * @param arrayOfString
	 * @return
	 */
	public static String[] bubbleSortForString(String[] arrayOfString) {
		for (int i = 0; i < arrayOfString.length - 1; i++) {
			for (int j = 0; j < arrayOfString.length - i - 1; j++) {
				if (arrayOfString[j + 1].compareTo(arrayOfString[j]) < 0) {
					String temp = arrayOfString[j];
					arrayOfString[j] = arrayOfString[j + 1];
					arrayOfString[j + 1] = temp;
				}
			}
		}
		return arrayOfString;
	}

	/**
	 * Sorting the array of strings using bubble sort technique
	 * 
	 * @param arrayOfString
	 * @return
	 */
	public static String[] insertionSortForString(String[] arrayOfString) {
		for (int i = 0; i < arrayOfString.length; i++) {
			String key = arrayOfString[i];
			int j = i - 1;
			while (j >= 0 && arrayOfString[j].compareTo(key) > 0) {
				arrayOfString[j + 1] = arrayOfString[j];
				j = j - 1;

			}
			arrayOfString[j + 1] = key;
		}
		return arrayOfString;
	}

	public int searchGuessNumber(int low, int high) {
		if (high - low == 1) {
			return low;
		}
		int mid = low + (high - low) / 2;
		System.out.println("Is it less than " + mid);
		if (userInputBoolean()) {
			return searchGuessNumber(mid,high);
		}
		else {
		return searchGuessNumber(low,mid);
		}
	}
	public void searchWord(String searchString) {
		
	}
}
