package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{
	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
    	System.out.println("Enter the harmonic value N ");
    	//variable year read the input to check whether the leap year or not  
    	String nthTermNumber=utility.br.readLine();
    	
    	double result=utility.nthHarmonicValue(nthTermNumber);
    	System.out.println(result+" nth Harmonic value");
        		
	}

}
