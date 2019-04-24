/*
 * File name: SwitchErrors.java
 * Programmer:
 * ULID: arrams1
 * Date: Oct 3, 2015
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
 * <a program that uses the debugger to find errors> 
 *
 * @author Andrae Ramsey
 *
 */
public class SwitchErrors
{

	/**
	 * main method of the program
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);		 
		 System.out.println("Key:  1=blue, 2=red, 3=green");
		 System.out.print("Enter a number and I'll return ");
		 System.out.print(" the corresponding color.  ");
		 
		int number = keyboard.nextInt();
		 
		 switch(number)
		 {
			 case 1:
				 System.out.println("You chose red!");
				 break;
			 case 2:
				 System.out.println("You chose blue!");
				 break;
			 case 3:
				 System.out.println("You chose green!");
		     default:
		    	 System.out.println("Color not available!");
		    	 break;
		 }
		 keyboard.close();
	}
	

}
