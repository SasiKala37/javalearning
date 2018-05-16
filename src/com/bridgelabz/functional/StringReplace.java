/*****************************
 * 
 * Purpose: Replace the string template "Hello <<UserName>>, How are you?"
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */

package com.bridgelabz.functional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelabz.utility.*;;

public class StringReplace 
{
	/*
	 * main() written to test the utility class 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * variable is to read input from the user
		 */
	    String userName;
		System.out.println("Enter the UserName");
		userName=br.readLine();
		/*
		 * variable output to store returned string by stringReplace method 
		 */
		String output=Utility.stringReplace(userName) ;
		
		
		System.out.println(output);
		
	}

}
