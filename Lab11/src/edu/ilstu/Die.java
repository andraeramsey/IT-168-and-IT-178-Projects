/*
 * File name: Die.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 4, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

import java.util.Random;

/**
 * <class with constructor and basic info>
 * @author Andrae Ramsey
 *
 */
public class Die
{
	private int spots;
	private Random generator;
	
	/**
	 * die constructor
	 * @param spots
	 */
	public Die()
	{
		this.spots=0;
		generator= new Random();		
	}

	/**
	 * roll method
	 */
	public void roll()
	{
		spots=generator.nextInt(6)+1;
	}
	
	/**
	 * getter for spots
	 * @return spots
	 */
	public int getSpots()
	{
		return spots;
	}
	
	/**
	 * equals method for dice
	 * @param other
	 * @return True/False
	 */
	public boolean equals(Die other)
	{boolean status;
		if (spots==(other.getSpots()))
		{
			status=true;
		}
		else 
		{
			status=false;
		}
		return status;
	}
}
