/**
 * Purpose: To sort the integers in ascending order using bubble sort technique
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BubbleSortInteger {

	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Enter the length of the array");
		int lengthOfTheArray=util.userInputInteger();
		util.bubbleSort(lengthOfTheArray);
		System.out.println("Prints the sorted elements");
	}

}
