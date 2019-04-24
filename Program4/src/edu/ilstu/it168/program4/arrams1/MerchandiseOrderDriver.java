/*
 * File name: MerchandiseOrderDriver.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 20, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.it168.program4.arrams1;

import java.util.Scanner;

/**
 * <driver class that runs a Redbird merch program>
 * @author Andrae Ramsey
 *
 */
public class MerchandiseOrderDriver
{

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		AddressBook customer=new AddressBook();
		MerchandiseOrder order=new MerchandiseOrder();
		MerchandiseOrderInput input=new MerchandiseOrderInput();
		MerchandiseOrderOutput output=new MerchandiseOrderOutput();
		
		output.displayMenu(order);
		
		int choice;
		int quantity;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Make your selection (1-5) ");
		choice = keyboard.nextInt();
		while (choice !=5)
		{
		    switch (choice)
		    {
		        case 1:
		            System.out.println("How many of these would you like?\n");
		            quantity=keyboard.nextInt();
		            order.sellProduct(choice,quantity);
		            output.displayYourOrder(order);
		            break;
		        case 2:
		            System.out.println("How many of these would you like?\n");
		            quantity=keyboard.nextInt();
		            order.sellProduct(choice,quantity);
		            output.displayYourOrder(order);
		            break;
		        case 3:
		            System.out.println("How many of these would you like?\n");
		            quantity=keyboard.nextInt();
		            order.sellProduct(choice,quantity);
		            output.displayYourOrder(order);
		            break;
		        case 4:
		        	System.out.println("How many of these would you like?\n");
		        	quantity=keyboard.nextInt();
		        	order.sellProduct(choice,quantity);
		        	output.displayYourOrder(order);
		        	break;
	        
		        default:
		            System.out.println("Invalid choice, please enter 1-5.\n");
		            break;
		    }
		    output.displayYourOrder(order);
		    
		    System.out.println("\n\nRedbird Merchandise Shop\n");
		    System.out.println("1)  Redbird T-shirt");
		    System.out.println("2)  Redbird Sweatshirt");
		    System.out.println("3)  Redbird Hat");
		    System.out.println("4)  Redbird Banner");
		    System.out.println("5)  Done.\n");

		    System.out.print("Make your selection (1-5) ");
		    choice = keyboard.nextInt();
			

		}
		//end of while
	    System.out.println("Would you like to complete this order?(Y or N)\n");
    	String validateFinish=keyboard.next();		        			        	
    	if((validateFinish.charAt(0)=='n')||(validateFinish.charAt(0)=='N'))
    		{
    			output.displayThankYou();
    		}
    			
    	else if ((validateFinish.charAt(0)=='y')||(validateFinish.charAt(0)=='Y'))
    		{
    			input.readCustomer(customer,order);		        		
    			output.displayOrderSummary(order);		
    			output.displayOrderTotals(order,customer,input);
    			output.displayCustomer(customer,input);
    			output.displayThankYou();
    		}						     								
		//switch int char.at instead
	    
	}

}
