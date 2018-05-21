package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class InsertionSortInteger {

	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Enter the length of the array");
		int lengthOfTheArray=util.userInputInteger();
		util.insertionSort(lengthOfTheArray);


	}

}
