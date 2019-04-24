/*
 * File name: MerchandiseOrderOutput.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 23, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.it168.program4.arrams1;

/**
 * <what is output to screen in program>
 * @author Andrae Ramsey
 *
 */
public class MerchandiseOrderOutput
{
	/**
	 * displays menu
	 * @param order
	 */
	public void displayMenu(MerchandiseOrder order)
	{
		System.out.println("Redbird Merchandise Shop\n");
		System.out.print("1)  Redbird T-shirt"+"\t"+"$"+(int)order.TSHIRTS);
		System.out.print("\n2)  Redbird Sweatshirt"+"\t"+"$"+(int)order.SWEATSHIRTS);
		System.out.print("\n3)  Redbird Hat"+"\t\t"+"S"+(int)order.HATS);
		System.out.print("\n4)  Redbird Banner"+"\t"+"$"+(int)order.BANNERS);
		System.out.println("\n5)  Done\n");
	}
	/**
	 * displays a quick summary
	 * @param order
	 */
	public void displayOrderSummary(MerchandiseOrder order)
	{
		System.out.println("\nRedbird Order Summary\n");
		System.out.println("Item \t\t\t\tQty");
		if (order.getNumOfTshirts()!=0)
			{System.out.println("Redbird T-shirt(s)"+"\t\t"+order.getNumOfTshirts());}
		if (order.getNumOfSweatshirts()!=0)
			{System.out.println("Redbird Sweatshirt(s)"+"\t\t"+order.getNumOfSweatshirts());}
		if (order.getNumOfHats()!=0)
			{System.out.println("Redbird Hat(s)"+"\t\t\t"+order.getNumOfHats());}
		if (order.getNumOfBanners()!=0)
			{System.out.println("Redbird Banner(s)"+"\t\t"+order.getNumOfBanners());}		
		System.out.print("\nSubTotal:\t\t\t"+"$");
		System.out.printf("%.2f",order.calculateSubTotal());
		System.out.print("\n");
	}
	/**
	 * displays order info
	 * @param order
	 */
	public void displayYourOrder(MerchandiseOrder order)
	{
		System.out.println("\nYour Order:\n");
		System.out.println("Item\t\t\t\tQty");
		if (order.getNumOfTshirts()!=0)
			{System.out.println("Redbird T-shirt(s)"+"\t\t"+order.getNumOfTshirts());}
		if (order.getNumOfSweatshirts()!=0)
			{System.out.println("Redbird Sweatshirt(s)"+"\t\t"+order.getNumOfSweatshirts());}
		if (order.getNumOfHats()!=0)
			{System.out.println("Redbird Hat(s)"+"\t\t\t"+order.getNumOfHats());}
		if (order.getNumOfBanners()!=0)
			{System.out.println("Redbird Banner(s)"+"\t\t"+order.getNumOfBanners());}
		System.out.print("\nSubTotal:\t\t\t"+"$");
		System.out.printf("%.2f",order.calculateSubTotal());
		System.out.print("\n");
	}
	/**
	 * displays total of order
	 * @param order
	 * @param customer
	 */
	public void displayOrderTotals(MerchandiseOrder order,AddressBook customer,MerchandiseOrderInput input)
	{
		//print summary again
		System.out.print("\n\nTax:\t\t\t\t$");
		System.out.printf("%-1.2f",order.calculateSalesTax());
		System.out.print("\n");
		System.out.print("Delivery Charge:\t\t$");
		System.out.printf("%.2f",order.calculateDelivery(customer,input)); //***********
		System.out.print("\n");
		System.out.print("Total:\t\t\t\t"+"$");
		System.out.printf("%.2f",order.calculateTotal(customer,input));
		System.out.print("\n\n");
	}
	/**
	 * displays customer info
	 * @param customer
	 * @param input
	 */
	public void displayCustomer(AddressBook customer, MerchandiseOrderInput input)
	{
		System.out.println(customer.formatMailingLabel(input));
		System.out.println(customer.formatPhone(input));
	}
	/**
	 * displays thank you
	 */
	public void displayThankYou()
	{
		System.out.print("\nThank you, please come again.");
	}
}
