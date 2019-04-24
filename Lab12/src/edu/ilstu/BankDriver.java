/*
 * File name: BankDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 7, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <driver class for bringing in processing then output to txt files>
 * @author Andrae Ramsey
 *
 */
public class BankDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{					
		//Scanner keyboard= new Scanner(System.in);
		
		final String INPUT_FILE= "Transactions.txt";
		final String OUTPUT_FILE= "AccountRecord.txt";
		
		double withdrawl=0;
		double deposit=0;
		
		Scanner inputStream=null;				
			try
			{
				inputStream=new Scanner(new File(INPUT_FILE));
	
			}
			catch(IOException ioe)
			{
				System.out.print("cannot open input file");
				System.exit(0);
			}
			//System.out.println(inputStream.nextLine());
			//System.out.println(inputStream.nextLine());
			//System.out.println(inputStream.nextLine());
			//System.out.println(inputStream.nextDouble());
			
			BankAccount account =new BankAccount(inputStream.nextLine(),inputStream.nextLine(),inputStream.nextLine(),inputStream.nextDouble());
			System.out.println(account);
			
						
			//read code and amount
			
			
			
			while (inputStream.hasNextLine())
			{
				switch(inputStream.nextInt())
				{
					case 1:
						withdrawl=inputStream.nextDouble();
						account.processWithdrawal(withdrawl);
						break;
				
					case 2:
						deposit=inputStream.nextDouble();
						account.processDeposit(deposit);			
						break;
				
					default:
						break;
				}
				
				/*if (inputStream.nextInt()==1)
				{
					withdrawl=inputStream.nextDouble();
					account.processWithdrawal(withdrawl);
				}
				else if (inputStream.nextInt()==2)
				{
					deposit=inputStream.nextDouble();
					account.processDeposit(deposit);
				}
				else
				{
					break;
				}*/
			}
			
			
			inputStream.close();					

			
									
			
			PrintWriter outputStream=null;
			try
			{
				outputStream=new PrintWriter(new File(OUTPUT_FILE));	
			}
			catch(IOException ioe)
			{
				System.out.print("unable to retrieve file");
				System.exit(0);			
			}
			outputStream.print(account.toString());
			
			outputStream.close();
		


	}
}
