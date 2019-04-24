/*
 * File name:  RectangleTester.java
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
 * <Insert class description here>
 *
 * @author cjholbr
 *
 */
public class RectangleTester
{

	public static void main(String[] args)
	{
		//Declare local variables
		double perimeter = 0;
		double area = 0;
		
		//Create an object of the Rectangle class
		Rectangle blueRectangle = new Rectangle();
		
		//Create a second object of the Rectangle class
		Rectangle redRectangle = new Rectangle();
		
		//Put values in the instance variables of the
		//blueRectangle object
		blueRectangle.setColor("blue");
		blueRectangle.setLength(5);
		blueRectangle.setWidth(8);
		
		//Put values in the instance variables of the
		//reRectangle object
		redRectangle.setColor("red");
		redRectangle.setLength(3);
		redRectangle.setWidth(5);
		
		System.out.println("Perimeter and area of blueRectangle");
		//Call the method to calculate the perimeter
		//for the blueRectangle object
		perimeter = blueRectangle.calcPerimeter();
		//Print the value that was returned for perimeter
		System.out.println("Perimeter = " + perimeter);
		
		//Call the method to calculate the area
		//for the blueRectangle object
		area = blueRectangle.calcArea();
		//Print the value that was returned for area
		System.out.println("Area = " + area);
		
		System.out.println("\nPerimeter and area of redRectangle");
		//Call the method to calculate the perimeter
		//for the redRectangle object
		perimeter = redRectangle.calcPerimeter();
		//Print the value that was returned for perimeter
		System.out.println("Perimeter = " + perimeter);
		
		//Call the method to calculate the area
		//for the blueRectangle object
		area = redRectangle.calcArea();
		//Print the value that was returned for area
		System.out.println("Area = " + area);

	}

}
