package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class PowerOfTwoTable {

	public static void main(String[] args) throws IOException 
	{
		Utility utility=new Utility();
    	System.out.println("Enter the number");
    	//variable year read the input to check whether the leap year or not  
    	String N=utility.br.readLine();
    	
    	utility.powerOfTwo(N);
	}

}
