/**
 * Purpose: To sort the strings ascending order using merge sort technique
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class MergeSortForString {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter the size of the array");
		int size = util.userInputInteger();
		System.out.println("Enter array of Strings");
		String[] inputArray = new String[size];
		for (int i = 0; i < size; i++) {
			inputArray[i] = util.userInputString();
		}
		System.out.println("Given Array");
		Util.printArray(inputArray);

		Util.sort(inputArray, 0, inputArray.length - 1);

		System.out.println("\nSorted array");
		Util.printArray(inputArray);

	}

}
