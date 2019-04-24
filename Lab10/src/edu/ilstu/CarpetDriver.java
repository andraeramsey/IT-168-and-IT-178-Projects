/*
 * File name: CarpetDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 29, 2015
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
 * <driver class for finding cost of carpeting a room>
 * @author Andrae Ramsey
 *
 */
public class CarpetDriver
{

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		

		System.out.print("Enter the length of the room:");
		double length=keyboard.nextDouble();
		
		
		System.out.print("Enter the width of the room:");
		double width=keyboard.nextDouble();
		
		System.out.print("Enter the carpet price per square foot:");
		double carpetPricePerSqFoot=keyboard.nextDouble();
		
		RoomDimension dimensions= new RoomDimension(length,width);
		RoomCarpet carpet=new RoomCarpet(dimensions,carpetPricePerSqFoot);
				
		System.out.print(carpet.toString(dimensions));
		System.out.printf("%.2f",carpet.calculateTotalCost(dimensions));
		
	}

}
