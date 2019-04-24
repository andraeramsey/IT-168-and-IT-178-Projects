/*
 * Filename:  BankAccount.java
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  IT 168
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */

package edu.ilstu;

/**
 * Handles processing for a bank account
 *
 * @author Cathy Holbrook
 * @author Modified by: Andrae Ramsey
 *
 */
public class BankAccount 
{
	private final double OVERDRAFT_CHARGE= 30.0;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	
	/**
	 * Fully loaded constructor
	 */
	public BankAccount(String accountNumber,String firstName,String lastName,double balance)
	{		
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	/**
	 * 
	 * Gets the amount the customer wants to withdraw, checks to 
	 * be sure they have enough in their balance for the amount,
	 * process the withdrawal or provide an insufficient funds
	 * message.
	 *
	 * @param: withdrawal
	 *
	 */
	public void processWithdrawal(double withdrawal)
	{
		boolean sufficientFunds = validateWithdrawalAmount(withdrawal);
		
		if (sufficientFunds)
		{
			System.out.printf("$","%.2f, %s", withdrawal, " has been withdrawn from your account"+"\n");
			balance = balance - withdrawal;
		} 
		else 
		{
			System.out.printf("$%.2f",withdrawal);
			balance= balance-withdrawal-OVERDRAFT_CHARGE;
			System.out.println("\nYou do not have sufficient funds to withdraw "+"\n$30 overdraft charge has been applied");
		}
		System.out.print("\nYour current balance is ");
		System.out.printf("$%.2f", balance);
		
	}
	
	/**
	 * 
	 * Validates whether there is enough money in the account
	 * for the amount the customer wants to withdraw.
	 *
	 * @param: 	 withdrawal
	 * @return:  sufficientFunds
	 *
	 */
	private boolean validateWithdrawalAmount(double withdrawal)
	{
		boolean sufficientFunds = true;
		
		if (withdrawal > balance){
			sufficientFunds = false;
		}
		
		return sufficientFunds;
	}
	
	/**
	 *  
	 * Processes a deposit by adding the amount to the balance
	 *
	 * @param: 	 deposit
	 *
	 */
	public void processDeposit(double deposit)
	{
		System.out.print("\n");
		System.out.printf("$%.2f", deposit, " has been added to your account");
		balance = balance + deposit;
	}
	
	/**
	 * getter for account number
	 * @return the accountNumber
	 */
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	/**
	 * getter for balance
	 * @return the balance
	 */
	public double getBalance() 
	{
		return balance;
	}

	/**
	 * getter for first name
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
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
	 * toString method
	 */
	public String toString()
	{
		return accountNumber+"\n"+firstName+"\n"+lastName+"\n"+balance;
	}
}
