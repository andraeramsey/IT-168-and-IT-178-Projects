/*
 *  Filename:  ConvertLoop.java
 *  
 *  Programmer: 
 *  ULID:  
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

/**
 * Converts given nested for loops to nested while loops
 *
 * @author Holbrook
 *
 */
public class ConvertLoop
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Original code with for loop");
		int s = 0;
		int t = 1;
		 
		for (int i = 0; i < 5; i++)
		{
			s = s + i;
			for (int j = i; j > 0; j--)
			{
				t = t + (j-1);
			}
			s = s + t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);
	}
	
	{
		System.out.println("\n\nNew code with while loop");
		
		int s = 0;
		int t = 1;
		int i = 0;
		int j = i;
		while  (i < 5)
		{
			i++;
			s = s + i;
		
			while(j > 0)
		    { 
				j--;
				t=t+(j-1);
		    }
		    s = s + t;
		    System.out.println("T is " + t);
		}
		System.out.println("S is " + s);
		

	}

}
