/*
 * 
 * Purpose: To find the roots of the quadratic equation
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */
package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) throws IOException
	{
		Utility utility=new Utility();

		System.out.println("Enter the a, b, c values");
		String number1=utility.bufferedReader.readLine();
		int a=Integer.parseInt(number1);
		String number2=utility.bufferedReader.readLine();
		int b=Integer.parseInt(number2);
		String number3=utility.bufferedReader.readLine();
		int c=Integer.parseInt(number3);
		
		utility.findingRoots(a, b, c);
		

	}

}
