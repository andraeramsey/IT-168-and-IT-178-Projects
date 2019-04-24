/*
 * File name: Element.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Dec 1, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu.program6.arrams1;

/**
 * <holds basic info from elements to set>
 * @author Andrae Ramsey
 *
 */
public class Element
{
	private String elementName;
	private int atomicNum;
	private String symbol;
	private double boilingPoint;
	private double meltingPoint;
	private double density;
	private double molecularWeight;
	
	/**
	 * Custom constructor for element
	 * @param elementName
	 * @param atomicNum
	 * @param symbol
	 * @param boilingPoint
	 * @param meltingPoint
	 * @param density
	 * @param molecularWeight
	 */
/*	Element (String elementName,double atomicNum,String symbol,double boilingPoint,
double meltingPoint,double density,double molecularWeight)
	{
		this.elementName = elementName;
		this.atomicNum = atomicNum;
		this.symbol = symbol;
		this.boilingPoint = boilingPoint;
		this.meltingPoint = meltingPoint;
		this.density = density;
		this.molecularWeight = molecularWeight;
	}*/
	
	Element (String[] element)
	{
		this.elementName = element[0];
		this.atomicNum = Integer.parseInt(element[1]);
		this.symbol = element[2];
		if (element[3].equals(""))
			this.boilingPoint=0;
		else 
			this.boilingPoint = Double.parseDouble(element[3]);
		if (element[4].equals(""))
			this.meltingPoint=0;
		else 
			this.meltingPoint = Double.parseDouble(element[4]);
		if (element[5].equals(""))
			this.density=0;
		else
			this.density = Double.parseDouble(element[5]);
		if (element[6].equals(""))
			this.molecularWeight=0;
		else
			this.molecularWeight = Double.parseDouble(element[6]);
	}
	
	/**
	 * element name getter
	 * @return the elementName
	 */
	public String getElementName()
	{
		return elementName;
	}

	/**
	 * atomic number getter
	 * @return the atomicNum
	 */
	public double getAtomicNum()
	{
		return atomicNum;
	}

	/**
	 * symbol getter
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * boiling point getter
	 * @return the boilingPoint
	 */
	public double getBoilingPoint()
	{
		return boilingPoint;
	}

	/**
	 * melting point getter
	 * @return the meltingPoint
	 */
	public double getMeltingPoint()
	{
		return meltingPoint;
	}

	/**
	 * density getter
	 * @return the density
	 */
	public double getDensity()
	{
		return density;
	}

	/**
	 * molecular weight getter
	 * @return the molecularWeight
	 */
	public double getMolecularWeight()
	{
		return molecularWeight;
	}

	/**
	 * sets element name
	 * @param elementName the elementName to set
	 */
	public void setElementName(String elementName)
	{
		this.elementName = elementName;
	}

	/**
	 * sets atomic number
	 * @param atomicNum the atomicNum to set
	 */
	public void setAtomicNum(int atomicNum)
	{
		this.atomicNum = atomicNum;
	}

	/**
	 * sets symbol
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	/**
	 * sets boiling point
	 * @param boilingPoint the boilingPoint to set
	 */
	public void setBoilingPoint(double boilingPoint)
	{
		this.boilingPoint = boilingPoint;
	}

	/**
	 * sets melting point
	 * @param meltingPoint the meltingPoint to set
	 */
	public void setMeltingPoint(double meltingPoint)
	{
		this.meltingPoint = meltingPoint;
	}

	/**
	 * sets density
	 * @param density the density to set
	 */
	public void setDensity(double density)
	{
		this.density = density;
	}

	/**
	 * sets molecular weight
	 * @param molecularWeight the molecularWeight to set
	 */
	public void setMolecularWeight(double molecularWeight)
	{
		this.molecularWeight = molecularWeight;
	}

	/**
	 * toString method for printing elements
	 */
	public String toString()
	{	
		return "Element name:\t  "+elementName+"\nAtomic number:\t  "+atomicNum+"\nSymbol:\t\t  "+symbol+"\nBoiling Point:\t  "+boilingPoint+" K"+"\nMelting Point:\t  "+meltingPoint+" K"+"\nDensity:\t  "
				+density+" g/L"+"\nMolecular Weight: "+molecularWeight+" g/mole\n";			
	
	}
}

