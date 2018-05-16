/*********************************************************************************
 * 
 * Purpose: Replace the string template "Hello <<UserName>>, How are you?"
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 * *******************************************************************************
 */
package com.bridgelabz.utility;

public class Utility 
{
	/*
	 * Static variable to print Hello username, How are you?
	 */
	
	static String str1="Hello username, How are you?";
	
	/*
	 * @parm input rplace with the source string 
	 */
    public static String stringReplace(String input)
    {
    	/*
    	 * variable s to store the replaced string with the actual string
    	 */
    	 String s= str1.replaceAll("username", input);
    	
    	 return s;
    }
}
