/*
 * File name: ChemistryInput.java
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

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class ChemistryInput
{	
	private final String PERIODIC_TABLE="PeriodicTableData.csv";
	private final String COMPOUND_FILE="MolecularWeightInput.txt";
	

	public int readTableFile(Element[] elements)
	{		
		Scanner inputStream=null;
		try
			{
				inputStream=new Scanner(new File(PERIODIC_TABLE));
			}
		catch(IOException ioe)
			{
				System.out.println("Error opening file");
				System.exit(0);
			}
		
		if(inputStream.hasNextLine())
			inputStream.nextLine();
		
		String[] element=new String[7];
		int size=0;
		
		Element tempElement;
		
		while(inputStream.hasNextLine())
		{
			element=inputStream.nextLine().split(",");
			tempElement=new Element(element);
			elements[size]=tempElement;
			size++;	
		//System.out.println(tempElement);
		}
		inputStream.close();
		return size;
	}
	
	//read filename w/ compounds
	public void readCompoundFile()
	{
		Scanner inputStream=null;
		try
			{
				//inputStream=new Scanner(new File("MolecularWeightInput.txt"));
				System.out.print("Please enter file name: ");
				Scanner keyboard = new Scanner(System.in);
				String validation=keyboard.next();
				
				if (validation.equalsIgnoreCase(COMPOUND_FILE)||(validation.equalsIgnoreCase("MolecularWeightInput")))
					{
						inputStream=new Scanner(new File(COMPOUND_FILE));
					}
				else
					{
						System.out.println("Invalid file name");
					}

				keyboard.close();
			}
		catch(IOException ioe)
			{
				System.out.println("Error opening file");
				System.exit(0);
			}
		//compound=inputStream.next(),inputStream.nextInt(),inputStream.next(),inputStream.nextInt();
		while(inputStream.hasNextLine())
			{
				
			}
		inputStream.close();
	}
	
}
