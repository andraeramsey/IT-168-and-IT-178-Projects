/*
 * File name: Book.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 20, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class Book
{
		private final double salesTAX=1.075;
		private String Title;
		private double price;
		private double percentIncrease;
		private int numberSold;
	
		
		public int getNumberSold()
		{
			return numberSold;
		}

		public void setNumberSold(int numberSold)
		{
			this.numberSold = numberSold;
		}

		public double getSalesTAX()
		{
			return salesTAX;
		}

		public void setTitle(String Title)
		{
			this.Title=Title;
		}
	
		public String getTitle()
		{
			return Title;
		}
	
		public void setprice(double price)
		{
			this.price=price;
		}
		
		public double getprice()
		{
			return price;
		}
		
		public double getPercentIncrease()
		{
			return this.percentIncrease;
		}
		
		public double calculateNewPrice()
		{
			double newPrice =(price*numberSold)*salesTAX;
			return newPrice;
		}
		
		public double calculateExpectedPrice()
		{
			double expectedPrice=(price*percentIncrease)*numberSold*salesTAX;
			return expectedPrice;
		}

		
		
		
}
