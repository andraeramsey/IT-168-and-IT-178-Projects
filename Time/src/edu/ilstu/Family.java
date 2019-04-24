/*
 * File name: Family.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Aug 31, 2016
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
public class Family
{

	/**
	 * @param args
	 */
	private double Income;
	private int Size;
	
	public Family(double income, int size)
	{
		Income=income;
		Size=size;
	}
	public boolean isPoor(double housingCost, double foodCost)
	{
		double totalCost=housingCost+foodCost*Size;
		if (totalCost>0.5*Income)
		{
			return true;
		}
		else
			return false;
	}
	public String toString()
	{
		return Size+" popele with income "+Income;
	}
	

}
