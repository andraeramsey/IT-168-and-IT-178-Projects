/*
 * File name: Triangle.java
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
public class Triangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		
		int triangleBase=5;
		
		for (int row = 0; row < triangleBase; row++)
			for (int col = 0;col <= row; col++)
			{
				System.out.print("*");
			}		
			System.out.println();
		for (int row = 0; row < triangleBase; row--)
				for (int col = 0;col <= row; col--)
				{
					System.out.print("*");
				}
	}

}
