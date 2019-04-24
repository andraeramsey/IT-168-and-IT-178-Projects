/*
 * File name: Palindrome.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 14, 2016
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
public class Palindrome
{
	static Scanner keyboard=new Scanner(System.in);
	final static int MAX_ARRAY_SIZE=50;
	static char[] variable=new char[MAX_ARRAY_SIZE];
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
			
		//.ignoreCase()
		//boolean isPalindrome(){};
	}
	public static boolean isPalindrome()
	{
		System.out.println("Enter your palindrome: ");
		String palindromeCheck=keyboard.nextLine();
		variable=palindromeCheck.toLowerCase().toCharArray();
		for(int i=0;i<MAX_ARRAY_SIZE;i++)
		{
			if(variable[i]==variable[variable.length-i]);
			
		}
			return true;
			
		/*for(int i=0;i<MAX_ARRAY_SIZE;i++)
		{
			if(variable[i]!=variable[variable.length-i]);
		}
			return false;*/
		
	}

}
