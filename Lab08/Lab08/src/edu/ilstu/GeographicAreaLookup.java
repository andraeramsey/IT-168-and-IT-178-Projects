package edu.ilstu;

import java.util.Scanner;

public class GeographicAreaLookup
{
	Scanner keyboard=new Scanner(System.in);
	
	/**
	 * determines zip code region by first digit
	 * @param zipCode
	 */
	public void determineAreaByZip(String zipCode)
	{		
		 
		if ((zipCode.substring(0,1).equals("0"))||(zipCode.substring(0,1).equals("1"))||(zipCode.substring(0,1).equals("2"))||(zipCode.substring(0,1).equals("3")))
			{
				System.out.print("East Coast");
			}
		else if  ((zipCode.substring(0,1).equals("4"))||(zipCode.substring(0,1).equals("5"))||(zipCode.substring(0,1).equals("6")))
			{
				System.out.print("Central Plains");
			}
		else if ((zipCode.substring(0,1).equals("7")))
			{
				System.out.print("South");
			}
		else if ((zipCode.substring(0,1).equals("8"))||(zipCode.substring(0,1).equals("9")))
			{
				System.out.print("West");
			}
		else if ((zipCode.substring(0,1)!=("0"))||(zipCode.substring(0,1)!=("1"))||(zipCode.substring(0,1)!=("2"))||(zipCode.substring(0,1)!=("3"))||(zipCode.substring(0,1)!=("4"))||(zipCode.substring(0,1)!=("5"))||(zipCode.substring(0,1)!=("6"))||(zipCode.substring(0,1)!=("7"))||(zipCode.substring(0,1)!=("8"))||(zipCode.substring(0,1)!=("9"))) 
			{
				System.out.print("invalid zip code");
			}
	}
	
}
