/*
 * File name: CheesecakeOrder.java
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

/**
 * <insert class description here>
 * @author Andrae Ramsey
 *
 */
public class CheesecakeOrder
{
	//Cheesecake Prices
		private final double PLAIN_CHEESECAKE_PRICE=10.0;
		private final double MARBLE_CHEESECAKE_PRICE=15.0;
		private final double CHOCO_CHIP_CHEESECAKE_PRICE=18.0;
		private final double VARIETY_CHEESECAKE_PRICE= 24.0;
	
	//Instance Variables & other Constants	
		private final double SCHOOL_SHARE_RATE=.12;
		
		private int plainCheesecakeCount;
		private int marbleCheesecakeCount;
		private int chocoChipCheesecakeCount;
		private int varietyCheesecakeCount;
		
		double subTotal;
		double total;
		double donationShare;
		
	//Calculations
		/**
		 *  Calculates Sub-Total of Order
		 * @return
		 */
		public double calculateSubTotal()
			{
				double subTotal=(PLAIN_CHEESECAKE_PRICE*plainCheesecakeCount)+(MARBLE_CHEESECAKE_PRICE*marbleCheesecakeCount)+(CHOCO_CHIP_CHEESECAKE_PRICE*chocoChipCheesecakeCount)+(VARIETY_CHEESECAKE_PRICE*varietyCheesecakeCount);
				return subTotal;
			}
		/**
		 * Calculates final Total
		 * @return
		 */
		public double calculateTotal()
			{
				double total=(calculateSubTotal()*SCHOOL_SHARE_RATE)+calculateSubTotal();
				return total;
			}
		/**
		 * Calculates Donation Amount from Order
		 * @return
		 */
		public double calculateDonationShare()
			{
				double donationShare=calculateSubTotal()*SCHOOL_SHARE_RATE;
				return donationShare;
			}
	//Getters and Setters (For instance variables)
		/**
		 * Setter for Plain Amount
		 * @param plainCheesecakeCount
		 */
		public void setPlainCheesecakeCount(int plainCheesecakeCount)
			{
				this.plainCheesecakeCount=plainCheesecakeCount;
			}
		/**
		 * Getter for Plain Amount
		 * @return
		 */
		public int getPlainCheesecakeCount()
			{
			return plainCheesecakeCount;
			}

		
		/**
		 * Setter for Marble Amount
		 * @param marbleCheesecakeCount
		 */
		public void setMarbleCheesecakeCount(int marbleCheesecakeCount)
			{
				this.marbleCheesecakeCount=marbleCheesecakeCount;
			}
		/**
		 * Getter for Marble Amount
		 * @return
		 */
		public int getMarbleCheesecakeCount()
			{
				return marbleCheesecakeCount;
			}
		
		
		/**
		 * Setter for Chocolate Chip Amount
		 * @param chocoChipCheesecakeCount
		 */
		public void setChocoChipCheesecakeCount(int chocoChipCheesecakeCount)
			{
				this.chocoChipCheesecakeCount=chocoChipCheesecakeCount;
			}
		/**
		 * Getter for Chocolate Chip Amount
		 * @return
		 */
		public int getChocoChipCheesecakeCount()
			{
				return chocoChipCheesecakeCount;
			}
		
		
		/**
		 * Setter for Variety Amount
		 * @param varietyCheesecakeCount
		 */
		public void setVarietyCheesecakeCount(int varietyCheesecakeCount)
			{
				this.varietyCheesecakeCount=varietyCheesecakeCount;
			}
		/**
		 * Getter for Variety Amount
		 * @return
		 */
		public int getVarietyCheesecakeCount()
			{
				return varietyCheesecakeCount;
			}

	//Getters and Setters (For constants)	
		/**
		 * Getter for Plain Price
		 * @return
		 */
		public double getPLAIN_CHEESECAKE_PRICE()
			{
				return PLAIN_CHEESECAKE_PRICE;
			}		
		/**
		 * Getter for Marble Price
		 * @return
		 */
		public double getMARBLE_CHEESECAKE_PRICE()
			{
				return MARBLE_CHEESECAKE_PRICE;
			}		
		/**
		 * Getter for Chocolate Chip Price
		 * @return
		 */
		public double getCHOCO_CHIP_CHEESECAKE_PRICE()
			{
				return CHOCO_CHIP_CHEESECAKE_PRICE;
			}		
		/**
		 * Getter for Variety Price
		 * @return
		 */
		public double getVARIETY_CHEESECAKE_PRICE()
			{
				return VARIETY_CHEESECAKE_PRICE;
			}		
		/**
		 * Getter for Donation Rate
		 * @return
		 */
		public double getSCHOOL_SHARE_RATE()
			{
				return SCHOOL_SHARE_RATE;
			}
}
