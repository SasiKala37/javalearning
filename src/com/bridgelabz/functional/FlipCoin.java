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
	  
	  int noOfFlips=Integer.parseInt(args[0]);
	 
	  Utility.flipCoin(noOfFlips);
	  
   }
}
