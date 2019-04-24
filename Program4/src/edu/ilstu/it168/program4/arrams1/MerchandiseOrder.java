package edu.ilstu.it168.program4.arrams1;
/**
 * 
 * <holds base info to run all calculations>
 * @author Andrae Ramsey
 *
 */
public class MerchandiseOrder
{
	private final double TAX_RATE=.0775;
	final double TSHIRTS=12.00;
	final double SWEATSHIRTS=25.00;
	final double HATS=15.00;
	final double BANNERS=10.00;
	private final double DELIVERY_CHARGE=3.50;
	private final double DELIVERY_SURCHARGE=20.00;
	
	
	
	private int numOfTshirts;
	private int numOfSweatshirts;
	private int numOfHats;
	private int numOfBanners;
		
	private boolean isOutOfContUS;
	

	/**
	 * used for US validation
	 * @return the isOutOfContUS
	 */
	public boolean isOutOfContUS()
	{
		return isOutOfContUS;
	}


	/**
	 * setter for US validation
	 * @param isOutOfContUS the isOutOfContUS to set
	 */
	public void setOutOfContUS(boolean isOutOfContUS)
	{
		this.isOutOfContUS = isOutOfContUS;
	}

	/**
	 * increments menu choice
	 * @param choice
	 * @param quantity
	 */
	public void sellProduct(int choice,int quantity)
	{
		if (choice==1)
			this.numOfTshirts=numOfTshirts+quantity;
		if (choice==2)
			this.numOfSweatshirts=numOfSweatshirts+quantity;
		if (choice==3)
			this.numOfHats=numOfHats+quantity;
		if (choice==4)
			this.numOfBanners=numOfBanners+quantity;		
	}
		
	/**
	 * calcs sub total
	 * @return sub total
	 */
	public double calculateSubTotal(){
		double subTotal=numOfTshirts*TSHIRTS+numOfSweatshirts*SWEATSHIRTS+numOfHats*HATS+numOfBanners*BANNERS;
		return subTotal;
	}
	/**
	 * calcs sales tax
	 * @return sales tax
	 */
	public double calculateSalesTax()
	{
		double salesTax=calculateSubTotal()*TAX_RATE;
		return salesTax;
	}
	/**
	 * calcs delivery
	 * @param customer
	 * @return delivery cost
	 */
	public double calculateDelivery(AddressBook customer,MerchandiseOrderInput input)
	{
		double deliveryCost=0;
		if (isOutOfContUS==true)
			{deliveryCost=DELIVERY_CHARGE+DELIVERY_SURCHARGE;
			return deliveryCost;}
		else if (isOutOfContUS==false)
			{deliveryCost=DELIVERY_CHARGE;
			return deliveryCost;}
		return deliveryCost;
				
	}
	/**
	 * calcs total
	 * @param customer
	 * @return total
	 */
	public double calculateTotal(AddressBook customer,MerchandiseOrderInput input)
	{
		double total=calculateSubTotal()+calculateSalesTax()+calculateDelivery(customer,input);
		return total;
	}
	
	
	/**
	 * getter for shirts
	 * @return the numOfTshirts
	 */
	public int getNumOfTshirts()
	{
		return numOfTshirts;
	}
	
	
	/**
	 * setter for shirts
	 * @param numOfTshirts the numOfTshirts to set
	 */
	public void setNumOfTshirts(int numOfTshirts)
	{
		this.numOfTshirts = numOfTshirts;
	}
	
	
	/**
	 * getter for sweatshirts
	 * @return the numOfSweatshirts
	 */
	public int getNumOfSweatshirts()
	{
		return numOfSweatshirts;
	}
	
	
	/**
	 * setter for sweaters
	 * @param numOfSweatshirts the numOfSweatshirts to set
	 */
	public void setNumOfSweatshirts(int numOfSweatshirts)
	{
		this.numOfSweatshirts = numOfSweatshirts;
	}
	
	
	/**
	 * getter for hats
	 * @return the numOfHats
	 */
	public int getNumOfHats()
	{
		return numOfHats;
	}
	
	
	/**
	 * setter for hats
	 * @param numOfHats the numOfHats to set
	 */
	public void setNumOfHats(int numOfHats)
	{
		this.numOfHats = numOfHats;
	}
	
	
	/**
	 * getter for banners
	 * @return the numOfBanners
	 */
	public int getNumOfBanners()
	{
		return numOfBanners;
	}
	
	
	/**
	 * setter for banners
	 * @param numOfBanners the numOfBanners to set
	 */
	public void setNumOfBanners(int numOfBanners)
	{
		this.numOfBanners = numOfBanners;
	}
	
}
