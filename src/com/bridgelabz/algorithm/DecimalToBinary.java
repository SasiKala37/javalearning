/**
 * Purpose: To convert decimal number to binary and swap the 2 nibbles
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class DecimalToBinary {

	public static void main(String[] args) {
	Util util=new Util();
	System.out.println("Enter the decimal number");
	int decimalNumber=util.userInputInteger();
	StringBuilder byteString=Util.toBinary(decimalNumber);
	System.out.println("Result binary: "+byteString);
	}

}
