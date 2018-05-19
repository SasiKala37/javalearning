package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter stake");
		int stake=utility.userInputInteger();
		System.out.println("Enter goal");
		int goal=utility.userInputInteger();
		System.out.println("Enter number of trails");
		int numberOfTrails=utility.userInputInteger();
		
		Utility.gamblGoal(stake, goal, numberOfTrails);
	}
}
