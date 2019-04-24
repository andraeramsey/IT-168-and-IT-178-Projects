/*
 * File name: Dice.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Feb 14, 2016
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package DandD;

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class Dice
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		int D4=(int)(Math.random()*4+1);
		int D6=(int)(Math.random()*6+1);
		int D8=(int)(Math.random()*8+1);
		int D10=(int)(Math.random()*10+1);
		int D12=(int)(Math.random()*12+1);
		int D20=(int)(Math.random()*20+1);
		int percentile=(int)(Math.random()*20+1)*10;
		
		Scanner keyboard = new Scanner(System.in);
		int choice = keyboard.nextInt();
		
		System.out.println("Pick die to roll");
		//if
		
	}

}
