/*
 * File name: CountPoor.java
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

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class CountPoor
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("How many families are there?");
		Scanner keyboard=new Scanner(System.in);
		int k=keyboard.nextInt();
		Family[] data=new Family[k];
		System.out.println("Enter income and size of each family member: ");
		for(int i=0; i<k; i++)
		{
			System.out.println("Enter income and size of family "+(i+1));
			double inc=keyboard.nextDouble();
			int s=keyboard.nextInt();
			data[i]=new Family(inc,s);
		}
		System.out.println("Enter the housing cost and food cost for families:");
		double houseCost=keyboard.nextDouble();
		double foodCost=keyboard.nextDouble();
		int count=0;
		for(int i=0;i<k;i++)
		{
			if (data[i].isPoor(houseCost,foodCost))
			{
				System.out.println("Family "+(i+1)+" was considered poor");
				count++;
			}
		}
		System.out.println("The toatl number of poor families is "+ count);
	}

}
