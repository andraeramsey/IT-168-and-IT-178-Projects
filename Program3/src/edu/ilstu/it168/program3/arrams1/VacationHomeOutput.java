/*
 * File name: VacationHomeOutput.java
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
 * <shows what is output to the screen>
 * @author Andrae Ramsey
 *
 */
public class VacationHomeOutput
{
	/**
	 * displays greeting
	 */
	public  void displayGreeting()
	{		
		System.out.println("Welcome to Holiday Resort Vacation Home Rentals\n");
	}
	/**
	 * displays receipt
	 * @param seasonalRate
	 * @param determineDiscount
	 * @param RETURNABLE_DEPOSIT
	 * @param total
	 */
	public void displayReceipt(VacationHomeRental rentalOrder,double DISCOUNT,double discount,int daysRented,int homesRented,String rentalDate,double seasonalRate,double costOfHome,double determineDiscount,int RETURNABLE_DEPOSIT,double total)
	{
		rentalOrder.getDaysRented();
		rentalOrder.getHomesRented();
		rentalOrder.getRentalDate();
		rentalOrder.determineDiscount(DISCOUNT,discount);
		rentalOrder.determinePrice();
		rentalOrder.calculateDeposit(RETURNABLE_DEPOSIT, homesRented);
		rentalOrder.calculateVacationHomeCost();
		rentalOrder.calculateDiscount(costOfHome);
		rentalOrder.calculateTotal();
		System.out.printf("\n\nRental cost:\t$\t"+"%5.2",seasonalRate+"\n"+"%5.2",determineDiscount+"Deposit:\t"+"%5.2",RETURNABLE_DEPOSIT+"\n\n"+"Total:\t"+"%5.2",total);
		
	}
	/**
	 * displays customer info
	 * @param formatLabel
	 */
	public void displayCustomer(Customer customer)
	{
		System.out.println("Customer:");
		System.out.print(customer.getFirstName()+" ");
		System.out.println(customer.getLastName());
		System.out.println(customer.getAddress());
		System.out.print(customer.getCity()+", ");
		System.out.print(customer.getState()+" ");
		System.out.println(customer.getZipCode());
		System.out.print(customer.formatPhone());
	}
	/**
	 * displays goodbye statement
	 * @param formatLabel
	 */
	public void displayGoodbye(Customer business,String formatLabel)
	{
		System.out.print("\n\nThank you for renting from us.\n");		
		
	}	
	public VacationHomeOutput(){}

}

