package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BinarySearchForStiring {

	public static void main(String[] args) {
		Util util=new Util();
		String[] arrayOfString=new String[5];
		System.out.println("Enter String elements");
		for(int i=0;i<arrayOfString.length;i++) {
			arrayOfString[i]=util.userInputString();
		}
		 String[] sortedArray=Util.bubbleSortForString(arrayOfString);
		System.out.println("Enter search element");
		String searchString=util.userInputString();
		int low=0;
		int high=sortedArray.length-1;
		boolean result=Util.binarySearchString(sortedArray, low, high, searchString);
		if(result) {
			System.out.println("search string found");
		}
		else {
			System.out.println("Search string not found");
		}
	}

}
