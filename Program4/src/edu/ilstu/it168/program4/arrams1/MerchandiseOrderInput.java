/*
 * File name: MerchandiseOrderInput.java
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

import java.util.Scanner;

/**
 * <accepts what info comes into the program>
 * @author Andrae Ramsey
 *
 */
public class MerchandiseOrderInput
{
	Scanner keyboard=new Scanner(System.in);
	public void readCustomer(AddressBook customer,MerchandiseOrder order)//if using constructor don't pass customer
	{
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
		state=state.toUpperCase();
		
		while (isStateInvalid(state))
		{
			System.out.print("Invalid state, please enter a valid one");
			System.out.print("Enter state:\t");
			state=keyboard.next();	
			state=state.toUpperCase();
		}	
		
		customer.setState(state);
		
		if (state.equalsIgnoreCase("HI") || state.equalsIgnoreCase("AK"))
			order.setOutOfContUS(true);
		else
			order.setOutOfContUS(false);
		
		System.out.print("Enter zip code:\t");
		String zipCode=keyboard.next();
		customer.setZipCode(zipCode);
		
		System.out.print("Enter phone number in form 9999999999:\t");
		String phoneNumber=keyboard.next();
		customer.setPhoneNumber(phoneNumber);	
		
		//AddressBook myCustomer= new AddressBook();//if passed para would  make and set all variables then hold
		
	}
		
	
	
	
	
		public boolean isStateInvalid(String state)
		{
			boolean isInvalid=false;
			String states="AL,AZ,AR,CA,CO,CT,DE,FL,GA,ID,IL,IN,IA,KS,KY,LA,"
					+ "ME,MD,MA,MI,MN,MS,MO,MT,NE,NV,NH,NJ,NM,NY,NC,ND,OH,OK,OR,PA,RI,SC,SD,TN,TX,UT,VT,VA,WA,WY,AK,HI";
			if ((states.indexOf(state)==-1)||(state.length()!=2))
				isInvalid=true;
			return isInvalid;
			
		}	
		
}
