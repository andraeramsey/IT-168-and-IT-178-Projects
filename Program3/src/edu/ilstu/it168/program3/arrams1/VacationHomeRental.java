/*
 * File name: VacationHomeRental.java
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
 * <A class that holds number calculations>
 * @author Andrae Ramsey
 *
 */
public class VacationHomeRental
{
	//Constants
		private final double DISCOUNT=0.15;
		private final int RETURNABLE_DEPOSIT=250;		
		
		private final double SPRING=200.00;
		private final double SUMMER=300.00;
		private final double FALL=250.00;
		private final double WINTER=100.00;
				
		
	//Instance Variables
		private int daysRented=0;
		private int homesRented=0;
		private String rentalDate;

		
		private double seasonalRate=0;
		
	//Methods
		/**
		 * Calculates total
		 * @return total
		 */
		public double calculateTotal()
		{
			double total=((daysRented*seasonalRate)-DISCOUNT+RETURNABLE_DEPOSIT)*homesRented;
			return total;
		}
		/**
		 * Calculates cost of vacation home
		 * @return costOfHome
		 */
		public double calculateVacationHomeCost()
		{
			double costOfHome=(daysRented*seasonalRate)*homesRented;
			return costOfHome;
		}
		/**
		 * Finds discount amount
		 * @param costOfHome
		 * @return discount
		 */
		public double calculateDiscount(double costOfHome)
		{
			double discount=DISCOUNT*costOfHome;
			return discount;
		}
		
		/**
		 * find total deposit
		 * @param RETURNABLE_DEPOSIT
		 * @param homesRented
		 * @return totalDeposit
		 */
		public int calculateDeposit(int RETURNABLE_DEPOSIT,int homesRented)
		{
			int totalDeposit=RETURNABLE_DEPOSIT*homesRented;
			return totalDeposit;
		}
		
		/**
		 * determines price by season
		 */
		public void determinePrice()
		{
			if ((rentalDate.substring(0,2).equals("03"))||(rentalDate.substring(0,2).equals("04"))||(rentalDate.substring(0,2).equals("05")))
				seasonalRate=SPRING;
			else if ((rentalDate.substring(0,2).equals("06"))||(rentalDate.substring(0,2).equals("07"))||(rentalDate.substring(0,2).equals("08")))
				seasonalRate=SUMMER;
			else if ((rentalDate.substring(0,2).equals("09"))||(rentalDate.substring(0,2).equals("10"))||(rentalDate.substring(0,2).equals("11")))
				seasonalRate=FALL;
			else if ((rentalDate.substring(0,2).equals("12"))||(rentalDate.substring(0,2).equals("01"))||(rentalDate.substring(0,2).equals("02")))
				seasonalRate=WINTER;
		}
		/**
		 * find is discount is applicable
		 * @param DISCOUNT
		 * @param discount
		 */
		public void determineDiscount(double DISCOUNT, double discount)
		{
			if (daysRented<7)
				discount=0;
			else
				discount=DISCOUNT;
		}
		/**
		 * setter for days rented
		 * @param daysRented
		 */
		public void setDaysRented(int daysRented)
		{
			this.daysRented=daysRented;
		}
		/**
		 * getter for days rented
		 * @return daysRented
		 */
		public int getDaysRented()
		{
			return daysRented;
		}
		/**
		 * setter for homes rented
		 * @param homesRented
		 */
		public void setHomesRented(int homesRented)
		{
			this.homesRented=homesRented;
		}
		/**
		 * getter for homes rented
		 * @return homesRented
		 */
		public int getHomesRented()
		{
			return homesRented;
		}
		/**
		 * setter for rental date
		 * @param rentalDate
		 */
		public void setRentalDate(String rentalDate)
		{
			this.rentalDate=rentalDate;
		}
		/**
		 * getter for rental date
		 * @return rentalDate
		 */
		public String getRentalDate()
		{
			return rentalDate;
		}
		public VacationHomeRental(){}
		
}