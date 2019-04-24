/*
 * File name:ArithmeticExpressions.java
 * Programmer: 
 * ULID: arrams1
 * Date: Sep 3, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * Write and test arithmetic expressions
 *
 * @author Andrae Ramsey
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		final int FREEZING = 32;
		
		
		
		// Variable declarations and initializations
		 int fahrenheit = 78;
		 int expected = 89;
		 int observed = 78;
		 double height = 9.0;
		 double base1 = 5.0;
		 double base2 = 10.0;
		double area;
		double celsius;
		double percentageOfDifference;
		
		// Problem 17
		area = height/2 * (base1+base2);
		System.out.print("area = ");
		System.out.println(area);
		// Problem 18
		celsius = 5/9.0 * (fahrenheit - FREEZING);
		System.out.print("celsius = ");
		System.out.println(celsius);
		// Problem 19
		percentageOfDifference= ((double)expected-(double)observed)/ expected *100;
		System.out.print("percentage of difference = ");
		System.out.print(percentageOfDifference);
		
		
		
		
		
	
		
		
	}

}
