/*
 * File name: PeriodicTable.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Dec 1, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.program6.arrams1;

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class PeriodicTable
{
	private final int MAX_ARRAY_SIZE=120;
	private Element[] elements; 
	private int size;
	
	Scanner keyboard=new Scanner(System.in);
	
	/**
	 * default constructor
	 */
	public PeriodicTable()
	{
		elements=new Element[MAX_ARRAY_SIZE];
	}

	/**
	 * elements getter
	 * @return the elements
	 */
	public Element[] getElements()
	{
		return elements;
	}

	/**
	 * size getter
	 * @return the size
	 */
	public int getSize()
	{
		return size;
	}

	/**
	 * choice 2-symbol validation
	 * @param symbol
	 */
	public int  findElement()
	{
		int location=0;
		System.out.println("Please enter symbol of an element");
		String symbolToFind=keyboard.next();

		boolean valid;		
		int i=0;
		while(valid=false)
		{
			if(symbolToFind.equalsIgnoreCase(elements[i].getSymbol()))
				{
					valid=true;
					location=symbolToFind.indexOf(elements[i].getSymbol());
				}
			else
				{
					valid=false;
					System.out.println("Symbol not found");
				}
			i++;
		}
		
		//symbolToFind=elements[].getSymbol().IndexOf(symbolToFind);
		return location;
	}
	
	/**
	 * choice-2 displays element
	 * @param symbol
	 */
	public int displayElementInformation()
	{
		int index = findElement();
		System.out.println();
		System.out.println(elements[index]);
		return index;
	}
		
	/**
	 * choice 3-display particle info
	 */
	/*public void particleInfo()
	 {
		System.out.println("Please enter symbol of an element");
		findElement();
		double protons=elements[].getAtomicNum();
		double electrons=elements[].getAtomicNum();
		double neutrons=elements[].getMolecularWeight()-elements[].getAtomicNum()+1;
	  	
		System.out.println("Particle information for "+ elements[].getElementName() );
	  	System.out.println("Number of protons:"+ protons);
	  	System.out.println("Number of electrons:"+ electrons);
	  	System.out.println("Number of neutrons:"+(int)neutrons);
	 }*/
	
	
	/**
	 * choice 4-finds highest boiling point
	 * @return highestBoilingPoint
	 */
	public double highestBoilingPoint()
	{
		double highestBoilingPoint=elements[0].getBoilingPoint();
		for(int j=0; j<size;j++)
		{
			if (highestBoilingPoint<elements[j].getBoilingPoint())
				{highestBoilingPoint=elements[j].getBoilingPoint();}
		}
		return highestBoilingPoint;
	}
	
	/**
	 * choice 5-finds lowest melting point
	 * @return lowestMeltingPoint
	 */
	public double lowestMeltingPoint()
	{
		double lowestMeltingPoint;
				lowestMeltingPoint=elements[0].getBoilingPoint();
		for(int i=0;i<size;i++)
		{
			if (lowestMeltingPoint>elements[i].getBoilingPoint())
				{lowestMeltingPoint=elements[i].getBoilingPoint();}	
		}
		return lowestMeltingPoint;
	}
	//both methods have getter *change if needed*
	
	//public void compound(){}

	public double calcMolecularWeight()
	{
		double MolecularWeight=0;
		
		//MolecularWeight=(atomic number*number of atoms)+(atomic number*number of atoms)
	//string line split with space //for loop to not print 1's from compound array	
		return MolecularWeight;
	}

}

