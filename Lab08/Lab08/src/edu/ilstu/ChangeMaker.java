/*
 * File name: ChangeMaker.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 8, 2015
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
 * <A program that uses loops and boolean to predict change given>
 * @author Andrae Ramsey
 *
 */
public class ChangeMaker
{

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		int itemPrice=0;
		int amount=0;
		int numOfQuaters=0;
		int numOfDimes=0;
		int numOfNickels=0;
		
		
		System.out.println("Item price must be 25 cents to a dollar, in 5-cent increments.\n"+"Enter item price: ");
		itemPrice=keyboard.nextInt();
			
		
		if (itemPrice<25)
				System.out.print("Cost is invalid - it must be at least 25 cents.");
		else if (itemPrice>100)
				System.out.print("Cost is invalid - it must be less than 100 cents");
		else if (itemPrice%5!=0)
				System.out.print("Cost is invalid - it must be evenly divisible by 5.");
		else if (amount%5==0)
		{
			System.out.println("You bought an item for "+itemPrice+" cents and gave me a dollar.\n"+"Your change is: ");		

			amount= 100-itemPrice;
			numOfQuaters=amount/25;
			System.out.print(numOfQuaters);
			if ((numOfQuaters>1)||(numOfQuaters==0))
				System.out.print(" quarters\n");
			else
				System.out.print(" quarter\n");
			amount=amount%25;
			numOfDimes=amount/10;
			System.out.print(numOfDimes);
			if ((numOfDimes>1)||(numOfDimes==0))
				System.out.print(" dimes\n");
			else
				System.out.print(" dime\n");
			amount=amount%10;
			numOfNickels=amount/5;
			System.out.print(numOfNickels);
			if ((numOfNickels>1)||(numOfNickels==0))
				System.out.print(" nickels\n");
			else
				System.out.print(" nickel\n");
		}
	}

}
