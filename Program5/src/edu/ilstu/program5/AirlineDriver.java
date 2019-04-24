/*
 * File name: AirlineDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 12, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.program5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <driver for a class to organize airline info into files dependent on state>
 * @author Andrae Ramsey
 *
 */
public class AirlineDriver
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		final String INPUT_FILE= "ListOfAirlines.txt";
		final String[] OUTPUT_FILE={"AR_WA_List.csv", "AR_NV_List.csv", "AR_TX_List.csv", "AR_GA_List.csv", "AR_HI_List.csv", "AR_CO_List.csv", "AR_FL_List.csv", "AR_IL_List.csv", "AR_other_List.csv"};
		
		Scanner inputStream=null;
			try
			{
				System.out.print("Please enter file name: ");
				Scanner keyboard = new Scanner(System.in);
				String validation=keyboard.next();
				
				if (validation.equalsIgnoreCase("ListOfAirlines.txt")||(validation.equalsIgnoreCase("ListOfAirlines")))
					{
						inputStream=new Scanner(new File(INPUT_FILE));
					}
				else
					{
						System.out.println("Invalid file name");
					}

				keyboard.close();
			}
			catch(IOException ieo)
			{
				System.out.println("Error retrieving files");
				System.exit(0);
			}
			
			PrintWriter outputStream[]= new PrintWriter[9];
			try
			{
				outputStream[0]=new PrintWriter(new File(OUTPUT_FILE[0]));
				outputStream[1]=new PrintWriter(new File(OUTPUT_FILE[1]));
				outputStream[2]=new PrintWriter(new File(OUTPUT_FILE[2]));
				outputStream[3]=new PrintWriter(new File(OUTPUT_FILE[3]));
				outputStream[4]=new PrintWriter(new File(OUTPUT_FILE[4]));
				outputStream[5]=new PrintWriter(new File(OUTPUT_FILE[5]));
				outputStream[6]=new PrintWriter(new File(OUTPUT_FILE[6]));
				outputStream[7]=new PrintWriter(new File(OUTPUT_FILE[7]));
				outputStream[8]=new PrintWriter(new File(OUTPUT_FILE[8]));
			}
		
			catch(IOException ieo)
			{
				System.out.println("Error retrieving files");
				System.exit(0);
			}
			
		while(inputStream.hasNextLine())
		{
			String name= inputStream.nextLine();
			String[] designator=inputStream.nextLine().split(" ");
			String frequentFlyerProg=inputStream.nextLine();
			String alliance=inputStream.nextLine();
			String city=inputStream.nextLine();
			String state=inputStream.nextLine();
			String country=inputStream.nextLine();
			String website=inputStream.nextLine();
		
			Location location=new Location(city,state,country);
						
			Airline airline=new Airline(name,new Designator(designator[0],designator[1],designator[2]),frequentFlyerProg,alliance,location,website);
		
			if (airline.getLocation().getStateAbv().equals("WA"))
				outputStream[0].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("NV"))
				outputStream[1].println(airline.toString());
			else if(airline.getLocation().getStateAbv().equals("TX"))
				outputStream[2].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("GA"))
				outputStream[3].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("HI"))
				outputStream[4].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("CO"))
				outputStream[5].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("FL"))
				outputStream[6].println(airline.toString());
			else if (airline.getLocation().getStateAbv().equals("IL"))
				outputStream[7].println(airline.toString());
			else
				outputStream[8].println(airline.toString());
		}				

																																				
//End of program, close files
		inputStream.close();
		outputStream[0].close();
		outputStream[1].close();
		outputStream[2].close();
		outputStream[3].close();
		outputStream[4].close();
		outputStream[5].close();
		outputStream[6].close();
		outputStream[7].close();
		outputStream[8].close();


	}

}
