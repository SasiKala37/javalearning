package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class GuessNumber {

	public static void main(String[] args) {
		Util util=new Util();
		int N= Integer.parseInt(args[0]);
        int n= (int) Math.pow(2, N);
        System.out.println("Think of an integer between "+0+"and "+( n-1));
        int secret = util.searchGuessNumber(0, N);
        System.out.println("Your number is "+secret);
	}

}
