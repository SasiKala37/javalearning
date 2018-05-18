/*
 * 
 * Purpose: prints a table of the powers of 2 that are less than or equal to 2^N.
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
    	//variable year read the input to check whether the leap year or not  
    	String N=utility.bufferedReader.readLine();
    	
    	utility.powerOfTwo(N);
	}

}
