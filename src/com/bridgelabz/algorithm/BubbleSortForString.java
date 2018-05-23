/**
 * Purpose: To sort the strings ascending order using bubble sort technique
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BubbleSortForString {
	public static void main(String[] args) {
		Util util = new Util();
		String[] arrayOfString = new String[5];
		System.out.println("Enter String elements");
		for (int i = 0; i < arrayOfString.length; i++) {
			arrayOfString[i] = util.userInputString();
		}
		long startTime = System.nanoTime();
		Util.bubbleSortForString(arrayOfString);
		long endTime = System.nanoTime() - startTime;
		System.out.println("Elapsed Time:" + endTime);

	}
}
