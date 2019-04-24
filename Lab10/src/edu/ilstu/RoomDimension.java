/*
 * File name: RoomDimension.java
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
 * <class relating to dimensions of room>
 * @author Andrae Ramsey
 *
 */
public class RoomDimension
{
	private double length;
	private double width;
	/**
	 * constructor
	 * @param length
	 * @param width
	 */
	public RoomDimension(double length, double width)
	{
		this.length=length;
		this.width=width;
	}

	/**
	 * calculates area
	 * @return area
	 */
	public double calcArea()
	{
		double area= length*width;
		return area;
	}
	/**
	 * toSting to print dimensions from this class
	 */
	public String toString()
	{
		return "\nlength= "+ length+"\nwidth= "+width+"\n";
	}
}
