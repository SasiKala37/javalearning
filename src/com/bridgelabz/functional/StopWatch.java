package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		Utility utility = new Utility();

		long elapsedTime = utility.findElapseTime();
		System.out.println("Stop watch elapsed time: " + elapsedTime);
	}
}
