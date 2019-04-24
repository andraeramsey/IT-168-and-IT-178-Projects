/*
 * File name: TimeCalculator.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 10, 2015
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
public class TimeCalculator
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//Constants
			int seconds;
			int minutes;
			int hours;
			final int MINUTESINSECONDS=60;
			final int HOURSINSECONDS=3600;
			System.out.print("Enter number of seconds: ");
			seconds=(keyboard.nextInt());
			hours=seconds/HOURSINSECONDS;
			minutes=seconds/MINUTESINSECONDS;
			System.out.print("Hours "+hours+" Minutes "+minutes+" Seconds "+(seconds));
			
			
	}

}
