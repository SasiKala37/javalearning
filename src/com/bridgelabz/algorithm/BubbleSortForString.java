package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;
public class BubbleSortForString {
	public static void main(String[] args) {
		Util util=new Util();
		String[] arrayOfString=new String[5];
		System.out.println("Enter String elements");
		for(int i=0;i<arrayOfString.length;i++) {
			arrayOfString[i]=util.userInputString();
		}
		String[] result=Util.bubbleSortForString(arrayOfString);
		System.out.println("sorted Strings are:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"  ");
		}
	}
}
