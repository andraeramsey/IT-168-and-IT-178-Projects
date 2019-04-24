/*
 * File name: BookDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 20, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class BookDriver
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double percentIncrease=0;
		double price=0;
		double newPrice=0;
		double expectedPrice1=0;
		double expectedPrice2=0;
		int numberSold=0;
		
		Book LifeOfPi=new Book();		
		LifeOfPi.setprice(13.50);
		
		System.out.print("Enter number to buy of Life of Pi: ");
		LifeOfPi.getNumberSold();numberSold=(keyboard.nextInt());
		
		System.out.println("Cost for Life of Pi = $"+price);
		LifeOfPi.getprice();
		price=LifeOfPi.calculateNewPrice();
		System.out.printf("");
		
		Book HarryPotter= new Book();
		HarryPotter.setprice(22.00);
		
		System.out.println("Enter number to buy of Harry Potter: "+numberSold);
		
		
		System.out.println("Cost for Harry Potter = $");
		HarryPotter.getprice();
		price=HarryPotter.calculateNewPrice();
		System.out.printf("");
		
		System.out.println("Enter percent increase for Life of Pi (in decimal form):" );
		LifeOfPi.getPercentIncrease();
		
		System.out.println("Enter percent increase for Harry Potter (in decimal form): ");
		HarryPotter.getPercentIncrease();
		
		expectedPrice1=LifeOfPi.calculateExpectedPrice();
		System.out.println("Cost for Life of Pi = $"+expectedPrice1);
		System.out.printf("");
		
		System.out.println("Cost for Harry Potter = ");
		expectedPrice2=HarryPotter.calculateExpectedPrice();
		System.out.printf("");
		keyboard.close();
	}
	
}
