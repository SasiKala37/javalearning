/*
 * 
 * Purpose: prints the Nth harmonic value in series  
 * 
 * @author SasiKala
 * @version 1.0
 * @since 17-05-2018
 * 
 */
package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
		
    	System.out.println("Enter the harmonic value N ");  
    	String nthTermNumber=utility.bufferedReader.readLine();
    	
    	double result=utility.nthHarmonicValue(nthTermNumber);
    	System.out.println(result+" nth Harmonic value");
        		
	}

}
