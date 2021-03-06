/*
 *  Filename:  Problem5.java
 *  
 *  Programmer: Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

import javax.swing.JOptionPane;

/**
 * Use to test pre-lab 3, problem 5
 *
 * @author Cathy Holbrook
 *
 */
public class Problem5 {
	
	public static void main(String[] args) {				
		String inputString = null;
		int number = 0;
			
		ControlStructures controlStructure = new ControlStructures();
			
		inputString = JOptionPane.showInputDialog("Problem 5\n\n" +
				"DO WHILE number < 4\n" +
				"     PRINT number\n" + 
				"     number = number + 1\n" +
				"END WHILE\n" +
				"PRINT \"The last number is\" number\n\n" +
				"The answer will be in the Console window\n\n" +
				"Enter value for beginning number: ");
		if (controlStructure.isNumeric(inputString)){
			number = Integer.parseInt(inputString);
								
			controlStructure.preLab5(number);
		} else {
			JOptionPane.showMessageDialog(null, "Invalid input value - you must enter an integer.");
		}
	
		
		System.exit(0);
	}

}
