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
	
	
    /**
     * 
     * @param userName
     * @return
     * @throws IOException
     */
    public  String stringReplace(String userName) throws IOException
    {

    	 String givenString="Hello <<username>>, How are you?";
    	 return givenString.replaceAll("<<username>>", userName);
    }
    
    
    /**
     * 
     * @param noOfFlips
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
    
    /**
     * @param year
     * @return
     * @throws IOException
     */
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
    
    /**
     * @param N
     */
    public void powerOfTwo(String N)
    {
    	int n=Integer.parseInt(N);
    	double result=0;
    	for(int i=0;i<=n;i++)
    	{
    	    result=Math.pow(2,i);
    		System.out.println(2+"^"+i+"="+result);
    	}
    }
    
    /**
     * @param nthTermNumber
     * @return
     */
    public double  nthHarmonicValue(String nthTermNumber)
    {
    	int n=Integer.parseInt(nthTermNumber);
    	//this is for big number
    	//double GAMMA=0.577215664901532;
    	//return Math.log(n)+GAMMA+(1/2*n)-(1/12*n*n)+(1/120*n*n*n*n);
    	double result=0.0;
    	for(int i=1;i<=n;i++)
    	{
    		result+=(double)(1/i);
    	}
    	return result;
    }
    
    /**
     * @param N
     */
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
   
    /**
     * @param x
     * @param y
     * @return
     */
    public double findDistance(int x,int y)
    {
    	// compute distance to (0, 0)
    	
    	return Math.sqrt((x*x)+(y*y));
    }
    
    /**
     * @param a
     * @param b
     * @param c
     */
    public void findingRoots(int a,int b,int c)
    {
    	double delta=(b*b)-(4*a*c);
    	double rootOfx=(-b)/(2*a);
    		if(delta>0)
    		{
    			double root1Ofx=(-b +Math.sqrt(delta))/(2*a);
    	    	double root2Ofx=(-b - Math.sqrt(delta))/(2*a);
    	    	System.out.println("Roots are real and different: "+root1Ofx);
    	    	System.out.print(root2Ofx);
    	    	
    		}
    		else if(delta==0)
    		{	
    			System.out.println("Roots are real and same: "+rootOfx);
    		}
    		else
    		{
    			System.out.println("Roots are complex: "+(rootOfx)+"+i"+Math.sqrt(Math.abs(delta)));
    		}

    }
    
    public double  computeWindChill(double temprature,double windpeed) {
		return  35.74 + 0.6215*temprature + (0.4275*temprature - 35.75) * Math.pow(windpeed, 0.16);
	}

}
