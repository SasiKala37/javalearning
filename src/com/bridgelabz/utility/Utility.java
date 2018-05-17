/*********************************************************************************
 * 
 * Purpose: Replace the string template "Hello <<UserName>>, How are you?"
 * 
 * @author SasiKala
 * @version 1.0
 * @since 16-05-2018
 * 
 * *******************************************************************************
 */
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility 
{
	public BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/*
	 * @param input replace with the source string 
	 */
    public  String stringReplace(String userName) throws IOException
    {
    	
		/*
    	 * Static variable to print Hello userName, How are you?
    	 */

    	 String str1="Hello username, How are you?";
    	/*
    	 * variable s to store the replaced string with the actual string
    	 */
    	 String s= str1.replaceAll("username", userName);
    	
    	 return s;
    }
    
    /*
     * @param noOfFlips the number to flip the coin how many times
     */
    public static void flipCoin(int noOfFlips) 
	{
		/*
		 * variable heads and tails initialize with 0
		 */
		int heads=0; int tails=0;
		/*
		 * variable randomNumber initialize with 0 
	     */
		double randomNumber=0;
		
		/*
		 * calculating the number of heads and tails 
		 */
		
		for(int i=0;i<=noOfFlips;i++)
		{
			randomNumber=Math.random();
	
			if(randomNumber>0.5)
				tails++;
			else
				heads++;
				
		}
		//Calculating the percentage of heads and tails
		double headPerc=(heads*100)/noOfFlips;
		double tailPerc=(tails*100)/noOfFlips;
		//print message head and tail percentage
		System.out.println("Head Percentage: "+headPerc);
		System.out.println("tail Percentage: "+tailPerc);
	}
    
    public String leapYearChecker(String year) throws IOException
    {
    	
    	   boolean isLeapYear=false;
    	   if(year.length()==4)
    	   {
    		  int n=Integer.parseInt(year);
    		  if((n%4==0&&n%100!=0)||n%400==0)
    		  {   		
    			  isLeapYear=true;
    		  }
    		  else 
    		  {
    			  isLeapYear=false;
    		  }
    		  if(isLeapYear)
       	      {
       		   return year+"is the leapyear";
       	      }
       	     else 
       		   return year+"is not the leapyear";
    	   }
    	   else 
    		   return "Entered year is not the 4 digit number";
    		   
    	
    }
    
    public void powerOfTwo(String N)
    {
    	int n=Integer.parseInt(N);
    	double result=0.0;
    	for(int i=0;i<=n;i++)
    	{
    	    result=Math.pow(2,i);
    		System.out.println(2+"^"+i+"="+result);
    	}
    }
    
    public double  nthHarmonicValue(String nthTermNumber)
    {
    	int n=Integer.parseInt(nthTermNumber);
    	//this is for big number
    	//double GAMMA=0.577215664901532;
    	//return Math.log(n)+GAMMA+(1/2*n)-(1/12*n*n)+(1/120*n*n*n*n);
    	double result=0.0;
    	for(int i=1;i<=n;i++)
    	{
    		result+=(int)(1/i);
    	}
    	return result;
    }
    
    public void primeFactors(String N)
    {
    	int n=Integer.parseInt(N);
    	
    	for(int i=2;i*i<=n;i++)
    	{
    		while(n%i==0)
    		{
    			System.out.print(i+"  ");
    			n=n/i;
    		}
    		
    	}
    	if(n>1)
    	{
    		System.out.print(n);
    	}
    }
   
    public double findDistance(int x,int y)
    {
    	// compute distance to (0, 0)
    	double dist=Math.sqrt(x*x+y*y);
    	return dist;
    }
    
    public void findRoots(int a,int b,int c)
    {
    	
    }

}
