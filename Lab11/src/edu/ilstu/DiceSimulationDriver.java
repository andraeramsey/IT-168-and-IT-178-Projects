/*
 * File name: DiceSimulationDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 5, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <driver for program the shows number of pair that occur when rolling x number of dice>
 * @author Andrae Ramsey
 *
 */
public class DiceSimulationDriver
{

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		DiceSimulator sim=new DiceSimulator();
		int numberSimulationRolls=10000;
		
		
		DiceAccumulator accumulator=sim.runSimulation(numberSimulationRolls);
		System.out.println("Number of rolls:\t"+numberSimulationRolls);
		System.out.println("Number snake eys:\t"+accumulator.getSnakeEyes());
		System.out.println("Number twos:\t\t"+accumulator.getTwos());
		System.out.println("Number threes:\t\t"+accumulator.getThrees());
		System.out.println("Number fours:\t\t"+accumulator.getFours());
		System.out.println("Number fives:\t\t"+accumulator.getFives());
		System.out.println("Number sixes:\t\t"+accumulator.getSixes());
		
	}

}
