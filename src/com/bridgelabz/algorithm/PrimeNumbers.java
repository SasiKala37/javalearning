/**
 * Purpose:print the list of prime numbers between 1 and 1000
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class PrimeNumbers {

	public static void main(String[] args) {
		int higherLimit = 1000;
		System.out.println("prime numbers with in the range 0-1000 ");
		Util.findPrimeNumbers(higherLimit);

	}

}
