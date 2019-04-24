/*
 * File name: GeographicAreaTester.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 14, 2015
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
 * <a program that takes a zip code and determines what region it is in>
 * @author Andrae Ramsey
 *
 */
public class GeographicAreaTester
{

	/**
	 * calls and reads the region lookup 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		
		
		GeographicAreaLookup lookup=new GeographicAreaLookup();
		
		System.out.print("Enter a zip code: ");
		String zipCode=keyboard.next();
		System.out.print(zipCode+" is in the ");
		lookup.determineAreaByZip(zipCode);
		
		System.out.print(" area.");
		 
	}

}
