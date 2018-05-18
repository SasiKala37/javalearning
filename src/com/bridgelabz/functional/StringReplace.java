/*
 * 
 * Purpose: Replace the string template "Hello <<UserName>>, How are you?"
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */

package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class StringReplace 
{
	//main() written to test the utility
	
	public static  void main(String[] args) throws IOException  
	{
		/*
		 * Instance of the utility class
		 */
	    Utility utility=new Utility();
		//variable is to read input from the user
     	String userName;
		System.out.println("Enter the UserName");
		userName=utility.br.readLine();
		
		
		/*
		 * variable output to store returned string by stringReplace method 
		 */
		
		String output=utility.stringReplace(userName) ;
		System.out.println(output);
	}
}
