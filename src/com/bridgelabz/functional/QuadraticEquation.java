package com.bridgelabz.functional;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) throws IOException
	{
		Utility utility=new Utility();
		System.out.println("Enter the a, b, c values");
		String number1=utility.br.readLine();
		int a=Integer.parseInt(number1);
		String number2=utility.br.readLine();
		int b=Integer.parseInt(number2);
		String number3=utility.br.readLine();
		int c=Integer.parseInt(number3);
		
		utility.findingRoots(a, b, c);
		

	}

}
