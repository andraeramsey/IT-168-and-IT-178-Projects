/*
 * File name: Designator.java
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
 * <holds IATA, ICAO, and airlines call sign from text file>
 * @author Andrae Ramsey
 *
 */
public class Designator
{
//Instance Variables
	private String planeIATA;
	private String planeICAO;
	private String callSign;	
//Methods	
	
	/**
	 * designator constructor
	 * @param planeIATA
	 * @param planeICAO
	 * @param callSign
	 */
	Designator(String planeIATA,String planeICAO,String callSign)
	{
		this.planeIATA=planeIATA;
		this.planeICAO=planeICAO;
		this.callSign=callSign;
	}

	
	/**
	 * getter for IATA
	 * @return the planeIATA
	 */
	public String getPlaneIATA()
	{
		return planeIATA;
	}

	/**
	 * getter for ICAO
	 * @return the planeICAO
	 */
	public String getPlaneICAO()
	{
		return planeICAO;
	}

	/**
	 * getter for call sign
	 * @return the callSign
	 */
	public String getCallSign()
	{
		return callSign;
	}

	/**
	 * method for toString
	 */
	public String toString()
	{
		return planeIATA+","+planeICAO+","+callSign;
	}
}
