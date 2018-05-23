/**
 * Purpose:To convert decimal to binary value 
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Enter the decimal value");
		int decimalNumber=util.userInputInteger();
		int binaryValue=Util.binary(decimalNumber);
		if(binaryValue!=-1) {
			System.out.println("Binary Value: "+binaryValue);
		}
		else{
			System.out.println("Nothing");
		}
	}

}

