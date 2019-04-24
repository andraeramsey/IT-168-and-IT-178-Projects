/*
 * File name: PersonDriver.java
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

/**
 * <a program that uses equals and toString methods in a test>
 * @author Andrae Ramsey
 *
 */
public class PersonDriver
{

	/**
	 * main method for equals and toString tests
	 * @param args
	 */
	public static void main(String[] args)

	{
		Person personA= new Person("Jason","Todd",23);		
		Person personB= new Person("Dick","Grayson",26);
		
		//Compare name and age
		if (personA.equals(personB))
			System.out.print(personA+"and"+"\n"+personB+"\nhave the same name\n\n");
		else 
			System.out.print(personA+"and"+"\n"+personB+"\nhave the different names\n\n");
		//Compare only age
		if (personA.age>(personB.age))
			System.out.println(personA+"is older"+"\n"+personB);
		else
			System.out.print("");
		if (personA.age<(personB.age))
			System.out.println(personA+"is younger"+"\n"+personB);
		else
			System.out.print("");
		
		
	}

}
