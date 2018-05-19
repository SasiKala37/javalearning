/*
 * 
 * Purpose: prints a table of the power of 2 that are less than or equal to 2^N.
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */
package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class PowerOfTwoTable {

	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
    	System.out.println("Enter the number");  
    	int N=utility.userInputInteger();
    	
    	utility.powerOfTwo(N);
	}

}
