/*
 * File name: RestarurantBillCalculator.java
 * Programmer: Andrae Ramsey
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
 * <a program to run a bill calculation>
 * @author Andrae Ramsey
 *
 */
public class RestarurantBillCalculator
{
	public static void main(String[] args) 
	{
		// Constant declaration
		double taxRate = 7.5;
		
		// Variable declarations and initializations
		double mealCost = 45.75;
		double tax;
		double tipAmount = 0;
		double totalAmount;
		
		//Total Tax
		tax = taxRate * mealCost;
		//Tip Amount
		tipAmount = mealCost * tipAmount;
		//Total Bill Amount
		totalAmount = mealCost + tax + tipAmount;
	}
}
