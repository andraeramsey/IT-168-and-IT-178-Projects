/*
 * File name: DiceAccumulator.java
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
 * <class that runs incrementation>
 * @author Andrae Ramsey
 *
 */
public class DiceAccumulator
{
	private int snakeEyes;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	
	/**
	 * increment ones
	 */
	public void addSnakeEyes(){snakeEyes=snakeEyes+1;}
	
	/**
	 * increments twos
	 */
	public void addTwos(){twos=twos+1;}
	
	/**
	 * increments threes
	 */
	public void addThrees(){threes=threes+1;}
	
	/**
	 * increments fours
	 */
	public void addFours(){fours=fours+1;}
	
	/**
	 * increments fives
	 */
	public void addFives(){fives=fives+1;}
	
	/**
	 * increments sixes
	 */
	public void addSixes(){sixes=sixes+1;}
	
	/**
	 * getter for ones
	 * @return snakeEyes
	 */
	public int getSnakeEyes(){return snakeEyes;}
	
	/**
	 * getter for twos
	 * @return twos
	 */
	public int getTwos(){return twos;}
	
	/**
	 * getter for threes
	 * @return threes
	 */
	public int getThrees(){return threes;}

	/**
	 * getter for fours
	 * @return fours
	 */
	public int getFours(){return fours;}
	
	/**
	 * getter for fives
	 * @return fives
	 */
	public int getFives(){return fives;}
	
	/**
	 * getter for sixes
	 * @return sixes
	 */
	public int getSixes(){return sixes;}
	
}
