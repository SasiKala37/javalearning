package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BinarySearchForIntegers {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter Array of integers");
		int[] arrayOfIntegers = new int[5];
		for (int i = 0; i < 5; i++) {
			arrayOfIntegers[i] = (int) util.userInputInteger();
		}
		int low = 0;
		int high = arrayOfIntegers.length - 1;
		System.out.println("Enter Search Element");
		int searchElement = util.userInputInteger();
		int result = Util.binarySearchInt(arrayOfIntegers, low, high, searchElement);
		if (result != -1) {
			System.out.println("search element is found");
		} else {
			System.out.println("search element is not found");
		}
	}

}
