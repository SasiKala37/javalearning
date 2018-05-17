/*
 * 
 * Purpose: To check whether the given year is leapyear or not
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */
package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class LeapYear 
{
	public static void main(String[] args) throws IOException 
	{
		//Instance of the Utility class
		Utility utility=new Utility();
    	System.out.println("Enter the year");
    	//variable year read the input to check whether the leap year or not  
    	String year=utility.br.readLine();
    	/*
    	 * to call the inatance funtion to print the leap year or not
    	 */
    	String message=utility.leapYearChecker(year);
    	System.out.println(message);
	}

}
