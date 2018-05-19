package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StandardArray {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter the row size of array");
		int rowSize = utility.userInputInteger();
		System.out.println("Enter the column size of array");
		int columnSize = utility.userInputInteger();
		utility.readArrayOfIntegers(rowSize, columnSize);
		utility.readArrayOfDouble(rowSize, columnSize);
		utility.readArrayOfBoolean(rowSize, columnSize);
	}

}
