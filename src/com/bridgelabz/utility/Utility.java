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

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	public Scanner scanner=new Scanner(System.in);
    public  String userInputString() {
    	return scanner.next();
    }
    public int userInputInteger()
    {
    	return scanner.nextInt();
    }
    public Double userInputDouble() {
    	return scanner.nextDouble();
    }
    public boolean userInputBoolean() {
    	return scanner.nextBoolean();
    }
	/**
	 * Replace with the String template
	 * @param userName
	 * @return
	 * @throws IOException
	 */
	public String stringReplace(String userName) {

		String givenString = "Hello <<username>>, How are you?";
		return givenString.replaceAll("<<username>>", userName);
	}

	/**
	 * Calculate the head and tail percentage when flapping the coin randomly
	 * @param noOfFlips
	 */
	public static void flipCoin(int noOfFlips) {
		int heads = 0;
		int tails = 0;

		double randomNumber = 0;

		for (int i = 0; i <= noOfFlips; i++) {
			randomNumber = Math.random();

			if (randomNumber > 0.5) {
				tails++;
			} else {
				heads++;
			}
		}

		double headPerc = (heads * 100) / noOfFlips;
		double tailPerc = (tails * 100) / noOfFlips;
		System.out.println("Head Percentage: " + headPerc);
		System.out.println("tail Percentage: " + tailPerc);
	}

	/**
	 * checking given year is leap year or not
	 * 
	 * @param year
	 * @return
	 * @throws IOException
	 */
	public static String leapYearChecker(String year) {

		boolean isLeapYear = false;
		if (year.length() == 4) {
			int n = Integer.parseInt(year);
			if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
			if (isLeapYear) {
				return year + "is the leapyear";
			} else {
				return year + "is not the leapyear";
			}
		} else
			return "Entered year is not the 4 digit number";
	}

	/**
	 * printing power of two table
	 * 
	 * @param N
	 */
	public static void powerOfTwo(int N) {
		double result = 0;
		for (int i = 0; i <= N; i++) {
			result = Math.pow(2, i);
			System.out.println(2 + "^" + i + "=" + result);
		}
	}

	/**
	 * calculate the nth term number in the harmonic series
	 * 
	 * @param nthTermNumber
	 * @return
	 */
	public static double nthHarmonicValue(int nthTermNumber) {
		double result = 0;
		for (int i = 1; i <= nthTermNumber; i++) {
			result += (double) (1 / i);
		}
		return result;
	}

	/**
	 * calculate the prime factors of given number
	 * 
	 * @param N
	 */
	public void primeFactors(int N) {
		for (int i = 2; i * i <= N; i++) {
			while (N % i == 0) {
				System.out.print(i + "  ");
				N = N / i;
			}
		}
		if (N > 1) {
			System.out.print(N);
		}
	}

	/**
	 * find the distance from (x,y) to (0,0)
	 * @param x
	 * @param y
	 * @return
	 */
	public static double findDistance(int x, int y) {
		return Math.sqrt((x * x) + (y * y));
	}

	/**
	 * calculate the roots for quadratic equation
	 * given quadratic equation a*x*x+b*x+c                    
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void findingRoots(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		double rootOfx = (-b) / (2 * a);
		if (delta > 0) {
			double root1Ofx = (-b + Math.sqrt(delta)) / (2 * a);
			double root2Ofx = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots are real and different: " + root1Ofx);
			System.out.print(root2Ofx);

		} else if (delta == 0) {
			System.out.println("Roots are real and same: " + rootOfx);
		} else {
			System.out.println("Roots are complex: " + (rootOfx) + "+i" + Math.sqrt(Math.abs(delta)));
		}

	}

	/**
	 * Compute the windChill using given formula
	 * 
	 * @param temprature
	 * @param windpeed
	 * @return
	 */
	public static double computeWindChill(double temperature, double windSpeed) {
		return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
	}

	/**
	 * get the random number from given number to number-1
	 * 
	 * @param number
	 * @return
	 */
	public static int getCoupon(int number) {
		Random random = new Random();
		return (random.nextInt()) * number;
	}

	/**
	 * find the distinct coupon numbers
	 * 
	 * @param randomNumber
	 */
	public static int distinctCouponNumber(int randomNumber) {
		int count = 0;
		boolean[] isCollected = new boolean[randomNumber];
		int distinctNumber = 0;
		while (distinctNumber < randomNumber) {
			int value = getCoupon(randomNumber);
			count++;
			if (!isCollected[value]) {
				distinctNumber++;
				isCollected[value] = true;
			}
		}
		return count;
	}

    public static void gamblGoal(int stake,int goal, int numberOfTrails ) {
	

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        for (int t = 0; t < numberOfTrails; t++) {

            while (stake > 0 && stake < goal) {
                bets++;
                if (Math.random() < 0.5) {
                	stake++;     
                }
                else {
                	stake--;    
                }
            }
            if (stake== goal) {
            	wins++;    
            }
        }
        System.out.println(wins + " wins of " + numberOfTrails);
        System.out.println("Percentage of games won = " + (100.0 * wins) / numberOfTrails);
        System.out.println("Avg # bets           = " + (1.0 * bets) / numberOfTrails);
    }

	public static void permutation(String input,int startIndex, int endIndex) {
		   if(startIndex==endIndex) {
			   System.out.println(input);
		   }
		   else {
			   for(int i=startIndex;i<=endIndex;i++) {
				   input=swapInputString(input,startIndex,i);
				   permutation(input, startIndex+1, endIndex);
				   input=swapInputString(input,startIndex,i);
			   }
		   }
	}
	public static String swapInputString(String input, int startIndex,int position) {
		char[] charArray=input.toCharArray();
		char temp;
		temp=charArray[startIndex];
		charArray[startIndex]=charArray[position];
		charArray[position]=temp;
		
		return String.valueOf(charArray);
	}
	public  long findElapseTime() {
		System.out.println(" the start time, type start");
		userInputString();
		long startTime=System.currentTimeMillis();
		System.out.println("The end time, type end ");
		userInputString();
		return System.currentTimeMillis()-startTime;
	}
	public void sumOfTriplets(int tripletSum) {
		int count=0;
		System.out.println("Enter the array of integers");
		int[] arrayOfIntegers=new int[6];
		for(int r=0;r<arrayOfIntegers.length;r++)
			{
				arrayOfIntegers[r]=userInputInteger();
			}
			
		 for(int i=0;i<arrayOfIntegers.length-2;i++) {
			 for(int j=i+1;i<arrayOfIntegers.length-1;j++) {
				 for(int k=j+1;k<arrayOfIntegers.length;k++) {
					 if((arrayOfIntegers[i]+arrayOfIntegers[j]+arrayOfIntegers[k])==tripletSum) {
						 count++;
						 System.out.println(arrayOfIntegers[i]+"  "+arrayOfIntegers[j]+"  "+arrayOfIntegers[k]);
					 }
				 }
			 }
		 }
		 System.out.println("Number of triplets: "+count);
	 }
	 
	 public void readArrayOfIntegers(int rowSize,int columnSize) {
		 int array[][]=new int[rowSize][columnSize];
		 System.out.println("Read the integer array values");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 array[i][j]=userInputInteger();
			 }
		 }
		 System.out.println("Print the Array of integers");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 System.out.print(array[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	 public void readArrayOfDouble(int rowSize,int columnSize) {
		 double array[][]=new double[rowSize][columnSize];
		 System.out.println("Read the double type array values");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 array[i][j]=userInputDouble();
			 }
		 }
		 System.out.println("Print the Array of double values");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 System.out.print(array[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	 public void readArrayOfBoolean(int rowSize,int columnSize) {
		 boolean array[][]=new boolean[rowSize][columnSize];
		 System.out.println("Read the boolean type array values");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 array[i][j]=userInputBoolean();
			 }
		 }
		 System.out.println("Print the Array of boolean values");
		 for(int i=0;i<rowSize;i++) {
			 for(int j=0;j<columnSize;j++) {
				 if(array[i][j]) {
					 System.out.print("1 ");
				 }else {
					 System.out.print("0 ");
				 }
			 }
			 System.out.println();
		 }
	 }

}

