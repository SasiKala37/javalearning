/*
 * 
 * Purpose: prints the wind chill at the given temperature and wind speed  
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill 
{
     public static void main(String[] args) {
    	
		double temperature=Double.parseDouble(args[0]);
		double windSpeed=Double.parseDouble(args[1]);
		Utility utility=new Utility();
		double windChill=utility.computeWindChill(temperature, windSpeed);
		 String MY_MESSAGE="Wind chill: "+windChill; 
	     System.out.println(MY_MESSAGE);
	}
}

