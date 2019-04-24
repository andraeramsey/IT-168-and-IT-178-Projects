/*
 * File name: VacationHomeDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 3, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.it168.program3.arrams1;

/**
 * <A program that orders vacation rentals with customer and pricing info>
 * @author Andrae Ramsey
 *
 */
public class VacationHomeDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		VacationHomeInput input=new VacationHomeInput();
		VacationHomeRental rentalOrder=new VacationHomeRental();
		VacationHomeOutput output=new VacationHomeOutput();
		Customer customer=new Customer();
		
		output.displayGreeting();		
		input.readCustomer(customer);
		input.readRentalOrder(rentalOrder);
		output.displayCustomer(customer);
		//output.displayReceipt(rentalOrder);
		output.displayGoodbye(business.formatLabel());

		

	}

}
