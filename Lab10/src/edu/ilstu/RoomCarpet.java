/*
 * File name: RoomCarpet.java
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
 * <class for carpet relating to dimensions>
 * @author Andrae Ramsey
 *
 */
public class RoomCarpet
{
	private RoomDimension dimensions;
	private double carpetPricePerSqFoot;
	
	/**
	 * constructor
	 * @param dimensions
	 * @param carpetPricePerSqFoot
	 */
	public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot)
	{
		this.dimensions=dimensions;		
		this.carpetPricePerSqFoot=carpetPricePerSqFoot;
	}	
	
	/**
	 * calcs total cost
	 * @param dimensions
	 * @return total
	 */
	public double calculateTotalCost(RoomDimension dimensions)
	{
		double total=dimensions.calcArea()*carpetPricePerSqFoot;
		return total;
	}
	
	/**
	 * toString method for printing results
	 * @param dimensions
	 * @return
	 */
	public String toString(RoomDimension dimensions)
	{
		
		return dimensions.toString()+"carpet cost= "+carpetPricePerSqFoot+"\n\n"+"Total cost= "+"$";
		
	}
}
