/**
 * Purpose: To take a command-line argument N, asks you to think of a number between
 *  0 and N-1, where N = 2^n, and always guesses the answer with n questions.
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class GuessNumber {

	public static void main(String[] args) {
		Util util=new Util();
		int n= Integer.parseInt(args[0]);
        int N= (int) Math.pow(2, n);
        System.out.println("Think of an integer between "+0+"and "+( N-1));
        int secret = util.searchGuessNumber(0, N);
        System.out.println("Your number is "+secret);
	}

}
