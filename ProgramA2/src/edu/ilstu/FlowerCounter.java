/*
 * File name: FlowerCounter.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 14, 2016
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
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class FlowerCounter
{
		
	
	//keyboard input and 
	
	FlowerCounter(String flowerName,double flowerCost)
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		String[] flowerName=new String[]{"petunia","pansy","rose","violet","carnation"};
		double[] flowerCost=new double[]{0.5,0.75,1.50,0.5,0.8};	
		
		String tempFlower;
		int quantity; 
		double total,finalTotal;
		
		System.out.println("Please type Flower's name: ");
		tempFlower=keyboard.nextLine();
		int i=0;
		
		do
		{
			tempFlower.compareTo(flowerName[i]);
			i++;
		}
		while(tempFlower!=flowerName[i]);
//scan array for flower name w/ loop give # choice tho
			
		System.out.println("Please type desired quantity:   ");
		quantity=keyboard.nextInt();
	}

}
