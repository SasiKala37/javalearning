/**
 * Purpose:To read a words from file and convert to character array then print
 * 		whether the search element is found or not using binary search technique 
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import java.io.IOException;

import com.bridgelabz.utility.Util;

public class ReadFileBinarySearch {

	public static void main(String[] args) throws IOException {
		Util util=new Util();
		System.out.println("Enter a search String");
		String searchString=util.userInputString();
		util.searchWord(searchString);
		
	}

}
