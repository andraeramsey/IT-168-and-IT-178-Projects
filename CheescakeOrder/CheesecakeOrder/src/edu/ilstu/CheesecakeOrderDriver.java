/*
 * File name: CheesecakeOrderDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Sep 25, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class CheesecakeOrderDriver
{

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
									
		
		CheesecakeOrder testOrder= new CheesecakeOrder();
		testOrder.calculateSubTotal();
		testOrder.calculateTotal();
		testOrder.calculateDonationShare();
		testOrder.getSCHOOL_SHARE_RATE();

		
		
		System.out.println("Lincoln High School Fundraiser\n");
		System.out.println("Cheesecake\t\t"+"Price\n");
		System.out.print("Plain"+"\t\t\t$");
		System.out.printf("%5.2f\n",testOrder.getPLAIN_CHEESECAKE_PRICE());
		System.out.print("Marble"+"\t\t\t$");
		System.out.printf("%5.2f\n",testOrder.getMARBLE_CHEESECAKE_PRICE());
		System.out.print("Chocolate Chip"+"\t\t$");
		System.out.printf("%5.2f\n",testOrder.getCHOCO_CHIP_CHEESECAKE_PRICE());
		System.out.print("Variety"+"\t\t\t$");
		System.out.printf("%5.2f\n\n\n",testOrder.getVARIETY_CHEESECAKE_PRICE());
		
		
		
		System.out.print("Please enter number of Plain Cheesecake: ");
		int plainCheesecakeCount=(keyboard.nextInt());
		testOrder.setPlainCheesecakeCount(plainCheesecakeCount);
		System.out.print("Subtotal= $");
		System.out.printf("%5.2f\n", testOrder.calculateSubTotal());
		
		System.out.print("Please enter number of Marble Cheesecake: ");
		int marbleCheesecakeCount=(keyboard.nextInt());
		testOrder.setMarbleCheesecakeCount(marbleCheesecakeCount);
		System.out.print("Subtotal= $");
		System.out.printf("%5.2f\n", testOrder.calculateSubTotal());		
		System.out.print("Please enter number of Chocolate Chip Cheesecake: ");
		int chocoChipCheesecakeCount=(keyboard.nextInt());
		testOrder.setChocoChipCheesecakeCount(chocoChipCheesecakeCount);
		System.out.print("Subtotal= $");
		System.out.printf("%5.2f\n", testOrder.calculateSubTotal());		
		System.out.print("Please enter number of Variety Cheesecake: ");
		int varietyCheesecakeCount=(keyboard.nextInt());
		testOrder.setVarietyCheesecakeCount(varietyCheesecakeCount);
		System.out.print("Subtotal= $");
		System.out.printf("%5.2f\n\n\n\n", testOrder.calculateSubTotal());
		
		System.out.print("Lincoln High School Fundraiser Order Summary\n");
		System.out.print("\n\t\tCheesecake Ordered\n");
		System.out.println("Plain\t\t\t"+ plainCheesecakeCount);
		System.out.println("Marble\t\t\t"+marbleCheesecakeCount);
		System.out.println("Chocolate Chip\t\t"+chocoChipCheesecakeCount);
		System.out.println("Variety\t\t\t"+varietyCheesecakeCount);
		System.out.print("\nSub-Total: $");	
		System.out.printf("%5.2f\n",testOrder.calculateSubTotal());
		System.out.print("\nTotal Ammount: $");
		System.out.printf("%5.2f\n", testOrder.calculateTotal());
		System.out.print("\nAmount Donated to School: $");
		System.out.printf("%3.2f",testOrder.calculateDonationShare());
		
		keyboard.close();
	}

}
