/*
 * File name: DinnerParty.java
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

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class DinnerPartyWithConstructor extends PartyWithConstructor
{
	private int dinnerChoice;

	/**
	 * @return the dinnerChoice
	 */
	public int getDinnerChoice()
	{
		return dinnerChoice;
	}
	/**
	 * @param dinnerChoice the dinnerChoice to set
	 */
	public void setDinnerChoice(int dinnerChoice)
	{
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void displayInvitations()
	{
		System.out.println("Please come to my dinner party!");
	}
}
