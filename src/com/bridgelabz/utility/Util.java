package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		charString1 = sortChar(charString1);
		charString2 = sortChar(charString2);
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
	public static char[] sortChar(char charString[]) {
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
	 * find the prime numbers in the between the given range 1-1000
	 * 
	 * @param higherLimit
	 */
	public static void findPrimeNumbers(int higherLimit) {
		int count; // int k=0;
		// int[] primeArray=new int[k];
		for (int i = 1; i <= higherLimit; i++) {
			count = 0;
			for (int j = 1; j <= higherLimit; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(i);
				// primeArray[k++]=i;
			}
			// isPalindrome(primeArray);
		}
	}

	/**
	 * check the given primeArray elements whether palindrome or not
	 * 
	 * @param primeArray
	 */
	public static void isPalindrome(int[] primeArray) {
		int reverseNumber = 0;
		for (int i = 0; i < primeArray.length && primeArray[i] != 0; i++) {
			while (primeArray[i] > 0) {
				reverseNumber = reverseNumber * 10 + primeArray[i] % 10;
				primeArray[i] = primeArray[i] / 10;
			}
			if (reverseNumber == primeArray[i]) {
				System.out.println("palindrome" + reverseNumber);
			}
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
				return binarySearchInt(arrayOfIntegers, mid + 1, high, searchElement);
			}
		}
		return -1;
	}

	/**
	 * Sorting the array of integers in ascending order using bubble sort technique
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

	}

	/**
	 * Sorting the array of integers ascending order using insertion sort technique
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
	 * Searching the array of strings in ascending using binary search technique
	 * 
	 * @param arrayOfString
	 * @param low
	 * @param high
	 * @param searchString
	 * @return
	 */
	public static boolean binarySearchString(String[] arrayOfString, int low, int high, String searchString) {

		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (arrayOfString[mid].compareTo(searchString) == 0) {
				return true;
			} else if (arrayOfString[mid].compareTo(searchString) > 0) {
				return binarySearchString(arrayOfString, low, mid - 1, searchString);
			} else {
				return binarySearchString(arrayOfString, mid + 1, high, searchString);
			}

		}
		return false;
	}

	/**
	 * Sorting the array of strings in alphabetical order using bubble sort
	 * technique
	 * 
	 * @param arrayOfString
	 * @return
	 */
	public static void bubbleSortForString(String[] arrayOfString) {
		for (int i = 0; i < arrayOfString.length - 1; i++) {
			for (int j = 0; j < arrayOfString.length - i - 1; j++) {
				if (arrayOfString[j + 1].compareTo(arrayOfString[j]) < 0) {
					String temp = arrayOfString[j];
					arrayOfString[j] = arrayOfString[j + 1];
					arrayOfString[j + 1] = temp;
				}
			}
		}
		System.out.println("sorted Strings are:");
		printArray(arrayOfString);
	}

	/**
	 * Sorting the array of strings alphabetical order using bubble sort technique
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

	/**
	 * guessing the number to enter true or false answer
	 * 
	 * @param low
	 * @param high
	 * @return
	 */
	public int searchGuessNumber(int low, int high) {
		if (high - low == 1) {
			return low;
		}
		int mid = low + (high - low) / 2;
		System.out.println("Is it less than " + mid);
		if (userInputBoolean()) {
			return searchGuessNumber(low, mid);
		} else {
			return searchGuessNumber(mid, high);
		}
	}

	/**
	 * to find the word in file using binary search technique
	 * 
	 * @param searchString
	 * @throws IOException
	 */
	public void searchWord(String searchString) throws IOException {
		String filePath = "/home/bridgelabz/sasi-txtdocuments/names.txt";
		String line = "";
		boolean result = false;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			while ((line = bufferedReader.readLine()) != null) {
				String[] words = line.split(",");
				bubbleSortForString(words);
				result = binarySearchString(words, 0, words.length - 1, searchString);
			}
			if (result) {
				System.out.println("search element found");
			} else {
				System.out.println("Search elements not found");
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Merge the two sorted sub arrays
	 * 
	 * @param inputArray
	 * @param low
	 * @param mid
	 * @param high
	 */
	public static void merge(String inputArray[], int low, int mid, int high) {

		// Find sizes of two sub arrays to be merged
		int size1 = mid - low + 1;
		int size2 = high - mid;

		// Create temperary arrays
		String leftArray[] = new String[size1];
		String rightArray[] = new String[size2];

		/* Copy data to temprary arrays */
		for (int i = 0; i < size1; ++i)
			leftArray[i] = inputArray[low + i];
		for (int j = 0; j < size2; ++j)
			rightArray[j] = inputArray[mid + 1 + j];

		/* Merge the temperary arrays */

		// Initial indexes of first and second sub arrays
		int i = 0, j = 0;

		// Initial index of merged sub array array
		int k = low;
		while (i < size1 && j < size2) {
			if (leftArray[i].compareTo(rightArray[j]) <= 0) {
				inputArray[k] = leftArray[i];
				i++;
			} else {
				inputArray[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < size1) {
			inputArray[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < size2) {
			inputArray[k] = rightArray[j];
			j++;
			k++;
		}
	}

	/**
	 * Sort the String in ascending order
	 * 
	 * @param inputArray
	 * @param low
	 * @param high
	 */
	public static void sort(String inputArray[], int low, int high) {
		if (low < high) {
			// Find the middle point
			int mid = (low + high) / 2;

			// Sort first and second halves
			sort(inputArray, low, mid);
			sort(inputArray, mid + 1, high);

			// Merge the sorted halves
			merge(inputArray, low, mid, high);
		}
	}

	/**
	 * Print the array elements
	 * 
	 * @param inputArray
	 */
	public static void printArray(String[] inputArray) {
		for (int i = 0; i < inputArray.length; ++i)
			System.out.print(inputArray[i] + " ");
		System.out.println();
	}

	/**
	 * generate the notes in descending order
	 * 
	 * @param num
	 */
	public static void generateChange(int amount) {
		int[] ar = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };
		int temp = 0;
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			if (amount == ar[i]) {
				System.out.println("The amount note ");
				System.out.println(amount);
				return;
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (amount < ar[j] && amount > ar[i] || amount > ar[i]) {
					temp = ar[i];
					index = i;
					break;
				}
			}
		}

		System.out.print(temp + "  ");
		int goal = amount - temp;
		for (int i = index; i >= 0; i--) {
			if (goal == ar[i]) {
				System.out.print(ar[i] + "  ");
				return;
			}

		}
		generateChange(goal);
	}

	/**
	 * convert celsius to fahrenheit temperature
	 * 
	 * @param temperatureInCelsius
	 * @return
	 */
	public static double celsiusToFahrenheit(double temperatureInCelsius) {
		return (temperatureInCelsius * 9 / 5) + 32;
	}

	/**
	 * convert fahrenheit to celsius temperature
	 * 
	 * @param temperatureInFahrenheit
	 * @return
	 */
	public static double fahrenheitToCelsius(double temperatureInFahrenheit) {
		return (temperatureInFahrenheit - 32) * 5 / 9;
	}

	/**
	 * calculate the monthly payment using given formula
	 * payment=(p*r)/(1-(1+r)^(-n))
	 * 
	 * @param principleAmount
	 * @param rateOfIntrest
	 * @param year
	 * @return
	 */
	public static double paymentCalculation(double principleAmount, double rateOfIntrest, double year) {
		double r = rateOfIntrest / (12 * 100);
		double n = 12 * year;
		double power = Math.pow((1 + r), (-n));
		return (principleAmount * r) / (1 - power);

	}

	/**
	 * calculate the square root of non negative number
	 * 
	 * @param c
	 */
	public static void sqrt(double c) {
		double epsilon = 1e-15;
		double t = c;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}

	/**
	 * check whether the given input is correct or not then calculate the day of
	 * week
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public static void dayOfWeek(int day, int month, int year) {

		boolean keepGoing = true;
		while (keepGoing) {
			if ((month <= 1 || month >= 12)) {
				System.out.println("Months are between 1 and 12");
				continue;
			}

			if (day < 1 || day > 31) {
				System.out.println("Days are between 1 and 31");
				continue;
			}

			if (year < -10000 || year > 10000) {
				System.out.println("Years are between -10000 and 10000");
				continue;
			}

			int y0 = year - (14 - month) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (day + x + 31 * m0 / 12) % 7;
			String result = "";
			switch (d0) {
			case 0:
				result += "sunday";
				break;
			case 1:
				result += "monday";
				break;
			case 2:
				result += "tuesday";
				break;
			case 3:
				result += "wednesday";
				break;
			case 4:
				result += "thursday";
				break;
			case 5:
				result += "friday";
				break;
			case 6:
				result += "satday";
				break;
			default:
				System.out.println("Nothing");
				break;
			}
			System.out.println("The day of the week is " + result);
			keepGoing = false;
		}

	}

	/**
	 * convert the decimal to binary
	 * 
	 * @param number
	 * @return
	 */
	public static StringBuilder toBinary(int number) {
		String paddingZero = "";

		while (number != 0) {
			int remainder = number % 2;
			paddingZero = remainder + paddingZero;
			number = number / 2;
		}

		int size = paddingZero.length();
		int temp = size;
		while (size % 4 != 0) {
			size++;
		}
		int diff = size - temp;
		for (int i = 1; i <= diff; i++) {
			paddingZero = '0' + paddingZero;
		}

		int count = 0;
		StringBuilder sb = new StringBuilder(paddingZero);
		for (int i = 0; i < paddingZero.length(); i++) {
			count++;
			if (count == 5) {
				sb.insert(i, " ");
				count = 0;
			}
		}
		return sb;
	}

	/**
	 * swap the two nibbles
	 * 
	 * @param number
	 * @return
	 */
	public static int binary(int number) {
		if (number < 127) {
			StringBuilder stringBuilder = toBinary(number);
			System.out.println(stringBuilder);
			String newString = stringBuilder.toString();
			System.out.println(newString);
			int size = newString.length();
			String[] array = new String[size];
			array = newString.split(" ");

			String temp = array[0];
			array[0] = array[1];
			array[1] = temp;
			String stringBack = "";
			for (int i = 0; i < array.length; i++) {
				stringBack += array[i];
			}
			stringBack.replaceAll("\\s", "");
			System.out.println("After swapping: ");
			System.out.println(stringBack);
			int decimal = binaryToDecimal(stringBack);

			return decimal;
		} else
			return -1;
	}

	/**
	 * Method to convert binary to decimal
	 * 
	 * @param string
	 * @return
	 */
	public static int binaryToDecimal(String string) {
		int number = Integer.parseInt(string);
		int count = 0;
		int out = 0;
		while (number != 0) {
			int rem = number % 10;
			out = (int) (out + rem * Math.pow(2, count++));
			number = number / 10;

		}
		return out;

	}
}
