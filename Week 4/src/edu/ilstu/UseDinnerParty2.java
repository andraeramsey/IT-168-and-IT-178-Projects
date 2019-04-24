/*
 * File name: UseParty.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 14, 2016
 *
 * Class: IT 178
 * Lecture Section: 01
 * Lecture Instructor: Pierce

 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class UseDinnerParty2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int guests;
		int choice;
		PartyWithConstructor aParty=new PartyWithConstructor();
		DinnerPartyWithConstructor aDinnerParty=new DinnerPartyWithConstructor();
		Scanner keyboard= new Scanner(System.in);
		
		System.out.print("Ender number of guests for the party >> ");
		guests=keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has "+aParty.getGuests() +" guests");
		
		aParty.displayInvitations();
		System.out.print("Enter number of guests for the dinner party >> ");
		guests=keyboard.nextInt();
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter the menu option -- 1 for chicken 2 for beef >> ");
		choice=keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("The dinner party has "+aDinnerParty.getGuests()+" guests");
		System.out.println("Menu option "+aDinnerParty.getDinnerChoice()+ " will be served");
		
		aDinnerParty.displayInvitations();
		
	}

}
