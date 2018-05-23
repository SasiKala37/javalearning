/**
 * Purpose:Print the search element whether found or not using binary search 
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

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
		Util.bubbleSortForString(arrayOfString);
		System.out.println("Enter search element");
		String searchString=util.userInputString();
		int low=0;
		int high=arrayOfString.length-1;
		long startTime=System.nanoTime();
		boolean result=Util.binarySearchString(arrayOfString, low, high, searchString);
		long endTime=System.nanoTime()-startTime;
		if(result) {
			System.out.println("search string found");
		}
		else {
			System.out.println("Search string not found");
		}
		System.out.println("Elapsed time:"+endTime);
	}

}
