/**
 * Purpose: To sort the strings ascending order using insertion sort technique
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class InsertionSortForString {

	public static void main(String[] args) {
		Util util=new Util();
		String[] arrayOfString=new String[5];
		System.out.println("Enter String elements");
		for(int i=0;i<arrayOfString.length;i++) {
			arrayOfString[i]=util.userInputString();
		}
		String[] result=Util.insertionSortForString(arrayOfString);
		System.out.println("sorted Strings are:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"  ");
		}

	}

}
