package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
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

