/*
 * File name:  Rectangle.java
 *
 * Programmer:  Cathy Holbrook
 * ULID:  cjholbr
 *
 * Date:  Sep 8, 2014
 *
 * Class:  IT 168
 * Lecture Section 04
 * Lecture Instructor:  Holbrook
 * Lab Section:  05 or 06
 * Lab Instructor:  Aayush or Karl
 */
package edu.ilstu;

/**
 * Describes a rectangle attributes and calculations
 *
 * @author cjholbr
 *
 */
public class Rectangle
{
	private String color;
	private double length;
	private double width;
	
	/**
	 * Calculates the perimeter of a rectangle
	 *
	 * @return perimeter
	 */
	public double calcPerimeter()
	{
		double perimeter = 0;
		
		perimeter = 2 * length + 2 * width;
		
		return perimeter;
	}
	
	/**
     * Calculates the area of a rectangle
	 *
	 * @return area
	 */
	public double calcArea()
	{
		double area = length * width;
		
		return area;
	}
	
	/**
	 * 
	 * Setter for color
	 *
	 * @param color
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
	
	/**
	 * Getter for color
	 *
	 * @return color
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Setter for length
	 *
	 * @param length
	 */
	public void setLength(double length)
	{
		this.length = length;
	}
	
	/**
	 * Getter for length
	 *
	 * @return length
	 */
	public double getLength()
	{
		return length;
	}
	
	/**
	 * Setter for width
	 *
	 * @param width
	 */
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	/**
	 * Getter for width
	 *
	 * @return width
	 */
	public double getWidth()
	{
		return width;
	}
}
