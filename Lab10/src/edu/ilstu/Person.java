/*
 * File name: Person.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Oct 29, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <hold basic info for Person object>
 * @author Andrae Ramsey
 *
 */


public class Person
{
	String firstName;
	String lastName;
	int age;
	public Person(String firstName,String lastName,int age)
	{		
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	public String toString() 
	{
		return (this.firstName+" "+this.lastName+", "+this.age+" years old ");
	}
	
}
