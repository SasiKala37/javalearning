package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class Factors {

	public static void main(String[] args) throws IOException {
		//Instance of the Utility class
				Utility utility=new Utility();
		    	System.out.println("Enter the number");
		    	//variable year read the input to check whether the leap year or not  
		    	String N=utility.br.readLine();
		    	System.out.println("Prime factors are:");
		    	utility.primeFactors(N);
	}

}
