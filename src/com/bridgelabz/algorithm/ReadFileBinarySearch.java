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
