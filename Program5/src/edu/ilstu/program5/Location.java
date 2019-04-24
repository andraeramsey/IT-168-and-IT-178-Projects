/*
 * File name: Location.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 12, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.program5;

/**
 * <holds city,state,country from text file>
 * @author Andrae Ramsey
 *
 */
public class Location
{
//Instance Variables	
	private String city;
	private String stateAbv;
	private String country;
	
//Methods, and other	
	/**
	 * location constructor
	 * @param city
	 * @param stateAbv
	 * @param country
	 */
	Location(String city,String stateAbv,String country)
	{
		this.city=city;
		this.stateAbv=stateAbv;
		this.country=country;
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
	 * get state
	 * @return the stateAbv
	 */
	public String getStateAbv()
	{
		return stateAbv;
	}

	/**
	 * get country
	 * @return the country
	 */
	public String getCountry()
	{
		return country;
	}
		



	/**
	 * method for toString
	 */
	public String toString()
	{
		return city+","+stateAbv+","+country;
	}
}
