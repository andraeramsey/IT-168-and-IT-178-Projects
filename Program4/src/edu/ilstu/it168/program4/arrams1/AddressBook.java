/*
 * File name: AddressBook.java
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
 * <class for customer object>
 * @author Andrae Ramsey
 *
 */
public class AddressBook
{
	//Instance Variables
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	//Methods and Constructors
	
	//public AddressBook(){}
	//public AddressBook(String firstName, String lastName, String address, String city, String state, String zipCode){}

	/**
	 * getter for first name
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * setter for first name
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * getter for last name
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * setter for last name
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * getter for phone number
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	/**
	 * setter for phone number
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	/**
	 * getter for address
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}
	/**
	 * setter for address
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	/**
	 * getter for city
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * setter for city
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * getter for state
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * setter for state
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	/**
	 * getter for zip code
	 * @return the zipCode
	 */
	public String getZipCode()
	{
		return zipCode;
	}
	/**
	 * setter for zip code
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}	
	/**
	 * formating for Mailing Label
	 * @return label
	 */
	public String formatMailingLabel(MerchandiseOrderInput input)
	{
		return "\n"+firstName+" "+lastName+"\n"+address+"\n"+city+","+state+" "+zipCode;		
	}
	/**
	 * formatter for for phone			
	 * @return phone 
	 */
	public String formatPhone(MerchandiseOrderInput input)
	{
		String newPhone; 
		newPhone= "("+phoneNumber.substring(0,3)+") "+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
		return newPhone;
	}	
}
