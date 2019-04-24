/*
 * File name: Airline.java
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
 * <holds airline name, designator as an object, name of frequent flyer program, alliance, location object, and website name>
 * @author Andrae Ramsey
 *
 */
public class Airline
{
//Instance Variables
	private String name;
	private Designator designator;
	private String frequentFlyerProg;
	private String alliance;
	private Location location;
	private String website;

//Getter, Setter, Methods, Constructors
	/**
	 * constructor for airline
	 * @param name
	 * @param designator
	 * @param frequentFlyerProg
	 * @param alliance
	 * @param location
	 * @param website
	 */
	public Airline(String name, Designator designator, String frequentFlyerProg, String alliance, Location location, String website)
	{
		this.name=name;
		this.designator=designator;
		this.frequentFlyerProg=frequentFlyerProg;
		this.alliance=alliance;
		this.location=location;
		this.website=website;
		
	}
			
	/**
	 * getter for airline name
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * getter for designator
	 * @return the designator
	 */
	public Designator getDesignator()
	{
		return designator;
	}

	/**
	 * getter for frequent flyer program
	 * @return the frequentFlyerProg
	 */
	public String getFrequentFlyerProg()
	{
		return frequentFlyerProg;
	}

	/**
	 * getter for alliance
	 * @return the alliance
	 */
	public String getAlliance()
	{
		return alliance;
	}

	/**
	 * getter for location constructor
	 * @return the location
	 */
	public Location getLocation()
	{
		return location;
	}

	/**
	 * getter for website
	 * @return the website
	 */
	public String getWebsite()
	{
		return website;
	}

	/**
	 * method for toString
	 */
	public String toString()
	{
		return name+","+designator+","+frequentFlyerProg+","+alliance+","+location+","+website;
	}
	
	/**
	 * equals method that compares planeIATA
	 * @param planeIATA
	 * @return
	 */
	public boolean equals(Designator planeIATA)
	{
		boolean status;
		
		if(planeIATA.equals(designator.getPlaneIATA()))
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
		
	}
}
