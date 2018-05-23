/**
 * Purpose: To convert the temperature celsius to fahrenheit vice versa
 * 
 * @author sasikala
 * @version 1.0
 * @since 22/05/2018
 */

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;;

public class TemperatureConvertion {

	public static void main(String[] args) {
		Util util = new Util();
		System.out.println("Enter the temperature in celsius");
		double temperatureInCelsius = util.userInputDouble();
		double fahrenheit = Util.celsiusToFahrenheit(temperatureInCelsius);
		System.out.println("faherenheit temperature: " + fahrenheit);
		System.out.println("Enter the temperature in fahrenheit");
		double temperatureInFahrenheit = util.userInputDouble();
		double celsius = Util.fahrenheitToCelsius(temperatureInFahrenheit);
		System.out.println("celcius Tempreture:" + celsius);
	}

}