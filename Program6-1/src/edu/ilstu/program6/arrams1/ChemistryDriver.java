/*
 * File name: ChemistryDriver.java
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

/**
 * <driver class read a periodic table and running functions>
 * @author Andrae Ramsey
 *
 */

public class ChemistryDriver
{
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{		
		ChemistryInput in=new ChemistryInput();
		ChemistryOutput out=new ChemistryOutput();
		PeriodicTable table=new PeriodicTable();
	
		out.displayMenu();
	
		int size=in.readTableFile(table.getElements());
	
		char choice=out.readMenuChoice().charAt(0);
		
			while(choice!=7)
			{
				switch(choice)
				{
					case '1':
						out.printPeriodicTable(table.getElements(),size);
						break;
					case '2':
					//ask to enter symbol for an element
						//search for element and return indexOf element.toString() to display that elements info
						//table.findElement();
						table.displayElementInformation();
						System.out.println();
						break;
					case '3':
					//table.findElement(.getSymbol());
						//table.particleInfo();
						System.out.println();
						break;
					case '4':
						table.highestBoilingPoint();
						//System.out.println(table.highestBoilingPoint());
						System.out.println(table.getElements());

						break;
					case '5':
						table.lowestMeltingPoint();
						System.out.println(table.getElements());
						break;
					case '6':
					//promt filename, read, process, display results
					//"Molecular Weights for Compounts\n"
						System.out.println();
						break;
					default:
						System.out.println("Invalid choice, please try again");
						break;
				}
				out.displayMenu();
				choice=out.readMenuChoice().charAt(0);
			}		
	}
}