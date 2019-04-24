/*
 * File name: DiceSimulator.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 4, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <class that creates simulation info>
 * @author Andrae Ramsey
 *
 */
public class DiceSimulator
{
	public DiceAccumulator runSimulation(int numberRolls)
	{
			
	DiceAccumulator accumulator=new DiceAccumulator();
	Die dieOne=new Die();
	Die dieTwo=new Die();
	
	 if (dieOne.equals(dieTwo)) 
	 {
		if (dieOne.getSpots()==1)
			accumulator.addSnakeEyes();
		else if (dieOne.getSpots()==2)
			accumulator.addTwos();
		else if (dieOne.getSpots()==3)
			accumulator.addThrees();
		else if (dieOne.getSpots()==4)
			accumulator.addFours();
		else if (dieOne.getSpots()==5)
			accumulator.addFives();
		else
			accumulator.addSixes();
	 }
	 else
		 System.out.print("Dice are not equal");
	return accumulator;
	}
		
}
