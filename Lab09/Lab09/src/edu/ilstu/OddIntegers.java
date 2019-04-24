/*
 * File name: OddIntegers.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 21, 2015
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
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		int oddCount, n;
		
		System.out.println("Enter a number:");
		n=keyboard.nextInt();
		
		oddCount=1;
		while((oddCount<=n))
		{
			oddCount=oddCount+2;
			System.out.print(oddCount+"+");
			oddCount++;
		}
		
		
	}

}
