/*
 * File name: GPSFilerReverserTester.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Aug 26, 2016
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.reviewprogram;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <insert class description here>
 * 
 * @author Andrae Ramsey
 *
 */
public class GPSFilerReverserTester
{
	Scanner keyboard = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final String INPUT_FILE = "gps-and-place-1.txt";
		final String OUTPUT_FILE="output.txt";
		Scanner inputStream = null;
		try
		{
			inputStream = new Scanner(new File(INPUT_FILE));
		}
		catch (IOException ieo)
		{
			System.out.println("Error retrieving files");
			System.exit(0);
		}
		//------------------------------------------------------
		
		PrintWriter outputStream=null;
		try
		{
			outputStream=new PrintWriter(new File(OUTPUT_FILE));
		}
		catch(IOException ieo)
		{
			System.out.println("Error retrieving files");
			System.exit(0);
		}
		//-----------------------------------------------------
		
		
		if (inputStream.hasNextLine())
			inputStream.nextLine();

		// String[] tempLocations=new String[i];

		int count = 0;

		GPSLocation[] locationArray = new GPSLocation[100];
		while (inputStream.hasNextLine())
		{
			// tempLocations[count]=inputStream.nextLine().split(",");
			// tempLocations[count]=inputStream.nextLine();
			String line = inputStream.nextLine();
			String[] lineSplitByComma = line.split(",");
			locationArray[count] = new GPSLocation(lineSplitByComma[0],
					lineSplitByComma[1], lineSplitByComma[2]);
			count++;
		}
		inputStream.close();
		// GPSLocation printer=new GPSLocation();
		// GPSFileReverse rev=new GPSFileReverse();

		for (int i = count-1; i >=0 ; i--)
		{
			outputStream.println(locationArray[i].toString());
		}
		outputStream.close();
	}
}
