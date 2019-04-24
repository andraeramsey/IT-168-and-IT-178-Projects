/*
 * File name: Circle.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 17, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <Data used in CircleDrive(variables,methods, and constants)>
 * @author Andrae Ramsey
 *
 */
public class Circle
{
		
		private final double PI=3.14159;		
		private double radius;

		
	/**
	 * Calculates area of a circle
	 * @param radius
	 * @param PI
	 * @return area
	 */
		public double caluculateArea()
			{				
				double area=PI*(radius*radius);
				return area;
			}
	/**
	 * Calculates diameter of a circle	
	 * @param radius
	 * @return diameter
	 */
		public double calculateDiameter()
			{	
				double diameter= radius * 2;
				return diameter;
			}
	/**
	 * Calculates circumference of a circle	
	 * @param PI
	 * @param radius
	 * @return circumference
	 */
		public double calculateCircumference()
			{
				double circumference= 2*PI*radius;				
				return circumference;
			}

	/**
	 * Setter for radius
	 * @param radius
	 */
		public void setRadius(double radius)
		{
			this.radius= radius;
		}
	
	/**
	 * Getter for radius
	 * @return radius
	 */
		public double getRadius()
			{
				return radius;
			}

	
	/**
	 * Getter for PI
	 * @return
	 */
	public double getPI()
	{
		return this.PI;		
	}	
}

