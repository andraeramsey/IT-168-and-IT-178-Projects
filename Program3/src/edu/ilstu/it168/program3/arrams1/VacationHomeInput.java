/*
 * File name: VacationHomeInput.java
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

import java.util.Scanner;

/**
 * <accpets the customer and rental info>
 * @author Andrae Ramsey
 *
 */
public class VacationHomeInput
{
	Scanner keyboard= new Scanner(System.in);
	
	/**
	 * reads customer info
	 */
	public void readCustomer(Customer customer)
	{
		System.out.println("\nPlease enter customer information:"); 
		System.out.print("Enter first name:\t");
		String firstName=keyboard.next();
		customer.setFirstName(firstName);
		
		
		System.out.print("Enter last name:\t");
		String lastName=keyboard.next();
		customer.setLastName(lastName);
		
		
		keyboard.nextLine();
		System.out.print("Enter street address:\t");
		String address=keyboard.nextLine();		
		customer.setAddress(address);
		
		
		
		System.out.print("Enter city:\t");		
		String city=keyboard.next();
		customer.setCity(city);
		
			
		System.out.print("Enter state:\t");
		String state=keyboard.next();
		customer.setState(state);
		
		
		System.out.print("Enter zip code:\t");
		String zipCode=keyboard.next();
		customer.setZipCode(zipCode);
		
		System.out.print("Enter phone number in form 9999999999:\t");
		String phoneNumber=keyboard.next();
		customer.setPhoneNumber(phoneNumber);
		
		
	}
	/**
	 * displays rental order
	 */
	public void readRentalOrder(VacationHomeRental rentalOrder)
	{
		System.out.print("Enter number of rental homes:\t");
		int homesRented=keyboard.nextInt();
		rentalOrder.setHomesRented(homesRented);
		
		System.out.println("Enter number of days:\t");
		int daysRented=keyboard.nextInt();
		rentalOrder.setDaysRented(daysRented);
		
		
		System.out.println("Enter start date in form mm/dd/yyyy:\t");
		String rentalDate=keyboard.next();
		rentalOrder.setRentalDate(rentalDate);
		
		
		
	}
}
