/*
 * File name: Party.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 14, 2016
 *
 * Class: IT 178
 * Lecture Section: 01
 * Lecture Instructor: Pierce
 */
package edu.ilstu;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class PartyWithConstructor
{
	private int guests;
	
	
	public PartyWithConstructor()
	{
		System.out.println("Creating a Party");
	}

	/**
	 * @return the guests
	 */
	public int getGuests()
	{
		return guests;
	}

	/**
	 * @param guests the guests to set
	 */
	public void setGuests(int guests)
	{
		this.guests = guests;
	}
	
	public void displayInvitations()
	{
		System.out.println("Please come to my party!");
	}
}
