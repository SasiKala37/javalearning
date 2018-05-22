package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class VeningMachine {

	public static void main(String[] args) {
		Util util=new Util();
		int[] notesArray= {1,2,5,10,20,50,100,200,500,1000,2000};
		System.out.println("Enter some amount");
		int amount=util.userInputInteger();
		Util.findDenoomination(notesArray, amount);
		
	}

}
