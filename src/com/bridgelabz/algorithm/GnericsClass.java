package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class GnericsClass {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("enter data");
		String first = util.userInputString();
		String second = util.userInputString();
		String third = util.userInputString();
		String result = maxi(first, second, third);
		System.out.println(result + "max");

	}

	public static int max(int first, int second, int third) {
		if (first > second && first > third) {
			return first;
		} else if (second > first && second > third) {
			return second;
		}

		else {
			return third;
		}
	}

	public static <E extends Comparable<E>> E maximum(E first, E second, E third) {
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
			return first;
		} else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
			return second;
		} else {
			return third;
		}

	}

	public static <E extends Comparable<E>> E maxi(E first, E second, E third) {
	
			return (first.compareTo(second) > 0 && first.compareTo(third) > 0) ? first :second.compareTo(first) > 0 && second.compareTo(third) > 0?second:third ;

		
	}
}
