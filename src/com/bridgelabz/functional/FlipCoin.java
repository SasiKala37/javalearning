/*
 * 
 * Purpose: Flip the coin and find the percentage of head and tail 
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 */
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class FlipCoin 
{
   public static void main(String args[]) 
   {
	  /*
	   * variable noOfFlips takes input as command line argument 
	   */
	  int noOfFlips=Integer.parseInt(args[0]);
	  
	  /*
	   * using static function of utility
	   * printout percentage of head and tail
	   */
	  Utility.flipCoin(noOfFlips);
	  
   }
}
