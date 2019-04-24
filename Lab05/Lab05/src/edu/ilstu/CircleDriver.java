/*
 * File name: CircleDriver.java
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

import java.util.Scanner;

/**
 * <A program to play with multiple classes in one program>
 * @author Andrae Ramsey
 *
 */
	
public class CircleDriver
{
	
	/**
	 * Class to present circle data
	 */
		
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);	
		//Local Variables
			System.out.print("Enter the raduis of a circle: ");
			double radius=(keyboard.nextDouble());
		
			Circle myCircle=new Circle();
			myCircle.setRadius(radius);
			
			
			double area=0;
			double diameter=0;
			double circumference=0;			
		
				
		area=myCircle.caluculateArea();
		System.out.println("Area="+area);
		
		diameter=myCircle.calculateDiameter();
		System.out.println("Diameter="+diameter);
		
		circumference=myCircle.calculateCircumference();	
		System.out.println("Circumference="+circumference);

		keyboard.close();
	}
	

}
