/**
 * Purpose:prints the monthly payment 
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class MonthlyPayment {

	public static void main(String[] args) {
		double principleAmount=Double.parseDouble(args[0]);
		double rateOfIntrest=Double.parseDouble(args[1]);
		double year=Double.parseDouble(args[2]);
		double payment=Util.paymentCalculation(principleAmount, rateOfIntrest, year);
		System.out.println("Payment: "+payment);
	}

}
