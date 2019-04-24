/*
 * File name: Customer.java
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
 * <a class that stores customer info>
 * @author Andrae Ramsey
 *
 */
public class Customer
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	
	
	/**
	 * Customer constructor with no arguments
	 */
	public Customer(){}
	/**
	 * Customer constructor with all parameters passed
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param phoneNumber
	 */
	public Customer(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNumber){}
	
	/**
	 *  format label constructor
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param phoneNumber
	 * @return formatLabel
	 */
	public String formatLabel()
	{	
		if(firstName!=null)
			firstName=firstName+" ";
		return firstName+lastName+"\n"+address+"\n"+city+" "+state+"  "+zipCode+"\n"+formatPhone();
	}
	
	/**
	 * formatter for phone number
	 * @param phoneNumber
	 * @return phoneNumber
	 */
	public String formatPhone()
	{
		
		String newPhone; 
		newPhone= "("+phoneNumber.substring(0,3)+") "+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
		return newPhone;
		//http://stackoverflow.com/questions/5114762/how-do-format-a-phone-number-as-a-string-in-java
	}
		
	//Getters and Setters
	

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}	
	
	/**
	 * getter for first name
	 * @return firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * setter for last name
	 * @param lastName
	 */
	public void setLastName(String lastName)
	{
	this.lastName=lastName;	
	}
	
	/**
	 * getter for last name
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * setter for address
	 * @param address
	 */
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	/**
	 * getter for address
	 * @return address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * setter for city
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city=city;
	}
	
	/**
	 * getter for city
	 * @return city
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * setter for state
	 * @param state
	 */
	public void setState(String state)
	{
		this.state=state;
	}
	
	/**
	 * getter for state
	 * @return state
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * setter for zip code
	 * @param zipCode
	 */
	public void setZipCode(String zipCode)
	{
		this.zipCode=zipCode;
	}
	
	/**
	 * getter for zip code
	 * @return zipCode
	 */
	public String getZipCode()
	{
		return zipCode;
	}
	
	/**
	 * setter for phone number
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	/**
	 * getter for phone number
	 * @return phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	Customer business=new Customer(){;}
}
