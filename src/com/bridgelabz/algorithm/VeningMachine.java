/**
 * Purpose: to find the fewest notes to be returned for Vending Machine

 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class VeningMachine {

	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Enter some amount");
		int amount=util.userInputInteger();
		Util.generateChange(amount);
		
	}

}
