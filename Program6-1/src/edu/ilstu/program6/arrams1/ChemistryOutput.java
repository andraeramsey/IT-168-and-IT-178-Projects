/*
 * File name: ChemistryOutput.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Dec 1, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.program6.arrams1;

import java.util.Scanner;

/**
 * <output class that prints menu and file to screen>
 * @author Andrae Ramsey
 *
 */
public class ChemistryOutput
{
	Scanner keyboard=new Scanner(System.in);
	
	/**
	 * reads menu choice
	 * @return choice
	 */
	public String readMenuChoice()
	{	
		System.out.print("\nEnter menu choice:");
		String choice=keyboard.next();
		keyboard.nextLine();
		return choice;
	}
	
	/**
	 * print the menu
	 */
	public void displayMenu()
	{
		System.out.println("Periodic Table Menu\n");
		System.out.println("1. Display information for all elements in the Periodic Table");
		System.out.println("2. Display infromation for one element");
		System.out.println("3. Display paricle infortmation for one element");
		System.out.println("4. Display the element with the highest boiling point");
		System.out.println("5. Display the element with the lowest boiling point");
		System.out.println("6. Display the molecular mass calculations for elements in file");
		System.out.println("7. Quit\n");
	}

	/**
	 * prints whole Periodic table
	 */
	public void printPeriodicTable(Element[] elements,int size)
	{
		for(int g=0;g<size;g++)
		{
			System.out.println(elements[g]);
		}		
	}
	
}
