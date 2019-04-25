/*
 * File name: LogoPaintCalculator.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 5, 2015
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
 * <A program to calculate the amount of paint needed to cover the specified logos>
 * @author Andrae Ramsey
 *
 */
public class LogoPaintCalculator
{
	public static void main(String[]arg)
	{
		Scanner keyboard = new Scanner(System.in);
		// Constants
			final double PI=3.14;
		
		// Variables						
			double areaOfCircle;						
			double areaOfRhombus;							
			double areaOfSquare;
			double quartsOfPaint;
			
		// Target Logo
			System.out.println("Target Logo\n");
			
			System.out.print("Enter radius in feet of the smallest circle: ");
			double radius=(keyboard.nextDouble());
	
			System.out.print("Enter radius in feet of the middle circle: ");
			double radius2=(keyboard.nextDouble());
	
			System.out.print("Enter radius in feet of the large circle: ");
			double radius3=(keyboard.nextDouble());
		
			System.out.println("\nThe Target logo requires: ");
			areaOfCircle = PI*(radius3*radius3)-PI*(radius2*radius2)+PI*(radius*radius);
			quartsOfPaint = areaOfCircle/125;
				
			System.out.print(quartsOfPaint+" quarts of red paint to cover "+ areaOfCircle+ " square feet and\n");
			areaOfCircle = PI*(radius2*radius2)-PI*(radius*radius);
			quartsOfPaint = areaOfCircle/125;
			
			System.out.println(quartsOfPaint +" quarts of white paint to cover "+ areaOfCircle + " square feet \n");
		
		// Mitsubishi Logo
			System.out.println("Mitsubishi Logo\n");
			
			System.out.print("Enter the smaller diagonal in feet of one rhombus: ");
			double diagonal1=(keyboard.nextDouble());
	
			System.out.print("Enter the larger diagonal in feet of one rhombus: ");
			double diagonal2=(keyboard.nextDouble());
			
			System.out.println("\nThe Mitsubishi logo requires: ");
			areaOfRhombus = ((diagonal1*diagonal2)/2)*3;
			quartsOfPaint = areaOfRhombus/125;
				
			System.out.println(quartsOfPaint+" quarts of red paint to cover "+ areaOfRhombus +" square feet.\n");
		
		//The Domino's Logo
			System.out.println("The Domino's Logo\n");
			
			System.out.print("Enter the side of the squre in feet for one dice: ");
			double side=(keyboard.nextDouble());
			
			System.out.print("Enter the radius of the circle in feet: ");
			double radius4=(keyboard.nextDouble());
			
			
			System.out.println("\nThe Domino's logo requires: ");
			
			areaOfCircle=PI*(radius4*radius4);
			areaOfSquare=(side*side)-(areaOfCircle*2);
			quartsOfPaint=(areaOfSquare/125);
			System.out.println(quartsOfPaint+" of blue paint to cover "+areaOfSquare +" square feet");
			
			areaOfCircle=PI*(radius4*radius4);
			areaOfSquare=(side*side)-areaOfCircle;
			quartsOfPaint=(areaOfSquare/125);
			System.out.println(quartsOfPaint+" of red paint to cover "+areaOfSquare+" square feet");
			
			quartsOfPaint=(areaOfCircle*3)/125;
			areaOfCircle=(PI*(radius4*radius4))*3;
			System.out.println(quartsOfPaint+" white paint to cover "+ areaOfCircle +" square feet");
		
		keyboard.close();
	}
	
}
