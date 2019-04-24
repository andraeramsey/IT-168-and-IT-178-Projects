/*
 * File name: TimeCalculator2.java
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
public class TimeCalculator2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//Constants
			final int MINUTEINSECONDS=60;
			final int HOURINMINUTES=60;
			
			System.out.print("Enter number of seconds: ");
			int seconds=(keyboard.nextInt());
			
			int minutes=seconds/MINUTEINSECONDS;
			int hours= seconds/HOURINMINUTES/MINUTEINSECONDS;
			seconds=seconds-(minutes*MINUTEINSECONDS);
			minutes=minutes-(hours*HOURINMINUTES);
			

		//Print
			System.out.print("Hours "+hours+" Minutes "+minutes+" Seconds "+seconds);
			
			
	}

}
