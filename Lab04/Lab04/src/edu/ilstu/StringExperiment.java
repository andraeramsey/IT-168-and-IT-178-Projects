/*
 * File name: StringExperiment.java
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

/**
 * <A program to experiement with String methods>
 * @author Andrae Ramsey
 *
 */
public class StringExperiment
{
	

	public static void main(String[] args)
	{
		//Constants
			final String firstName = "Andrae";
			final String middleName = "Jamal";
			final String lastName = "Ramsey";
			
		//String 
			char i= middleName.charAt(0);   
			String a=firstName.toUpperCase();
			String b=lastName.toLowerCase();
			int c=lastName.length();
			char d=lastName.charAt(3);
			char e=lastName.charAt(5);
		//Problems	
			 System.out.println(firstName+" " + middleName+" " + lastName );
			 System.out.println(firstName+" "+i+"." +" "+ lastName);
			 System.out.println(a+b);
			 System.out.println("Length of last name= "+c);
			 System.out.println(d);
			 System.out.println(e);
	}

}
