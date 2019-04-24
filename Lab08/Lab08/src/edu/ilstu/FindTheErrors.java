/*
 *  Filename:  FindTheErrors.java
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
 * The following class has four independent debugging
 * problems.  Solve one at a time, uncommenting the next 
 * one only after the previous problem is working correctly.
 *
 * @author Andrae Ramsey
 *
 */
public class FindTheErrors
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
//Problem 1
		 String	firstName = "";
		 String	lastName = "";
		 String school = "";
		 int	year = 0;
		 
		 System.out.print("Enter your first name:  ");
		 firstName = keyboard.nextLine();
		 
		 System.out.print("Enter your last name:  ");
		 lastName = keyboard.nextLine();
		 
		 System.out.print("Enter the current year:  ");
		 year = keyboard.nextInt();

		 
		 System.out.print("You are " + firstName + " "
				 	+ lastName + " and it is the year " + year);
		
		 
//Problem 2		 
		 keyboard.nextLine();
		 System.out.println("\n");
		 			
		 	int num1 = 0;
			int num2 = 0;
			
			System.out.print("Enter a number: 1, 2, or 3: ");
			num1 = keyboard.nextInt();
			
			if (num1 == 1)
				{num2 = 2;}
			else if (num1 == 2)
				{num2 = 3;}
			else if (num1 == 3)
				{num2 = 4;}
			
			System.out.println("num1 = " + num1 
					    + " and num2 = " + num2);
			
		 	System.out.println("\n");
//Problem 3		 
			/*
			 * Problem 3
			 * 
			 * This problem is to read the name of the course
			 * you are taking and display a statement showing the
			 * answer.
			 */	
		 	keyboard.nextLine();
			String courseName = "";
			System.out.print("Enter your course name (IT168 or IT177): ");
			courseName = keyboard.nextLine();
			
			if (courseName == "IT168")
				System.out.println("You are taking IT168.");
			else if (courseName == "IT177")
				System.out.println("You are taking IT177.");
			else
				System.out.println("Invalid input.");
	
		 	System.out.println("\n");
//Problem 4

			char	grade = 'Z';
			
			System.out.println("Enter your test grade (1-100): ");
			int score = keyboard.nextInt();

				if (score>=90)
					{grade = 'A';}
					
				else if(score>=80)
					{grade = 'B';}
					
				else if(score>=70)
					{grade = 'C';}
					
				else if(score>=60)
					{grade = 'D';}					
				else if(score<60)
					{grade = 'F';}
			
			
			System.out.println("The score " + score 
						+ " will have a grade of " + grade + ".");
		}
	}

