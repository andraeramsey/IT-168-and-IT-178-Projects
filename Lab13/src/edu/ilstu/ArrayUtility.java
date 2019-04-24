/*
 * File name: ArrayUtility.java
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
package edu.ilstu;

/**
 * <assist class for ArrayDriver to practice using methods with arrays>
 * @author Andrae Ramsey
 *
 */
public class ArrayUtility
{
	/**
	 * find percent of those larger than 20 in array
	 * @param intArray
	 * @return
	 */
	public double findPercentageGreaterThanTwenty(int[] intArray)
	{		
		//int greater=intArray[9];
		int count=0;
		for(int e=0; e<intArray.length;e++)
		{
			if (intArray[e]>20)
				count=count+1;
		}		
		double percentOf=(double)count/intArray.length;
		return percentOf;
	}
	
	/**
	 * finds smallest int from array
	 * @param intArray
	 * @return
	 */
	public int findSmallestInt(int[] intArray)
	{
		int smallest=intArray[9];
		for (int b=0; b<intArray.length;b++)
			{
				if (smallest>intArray[b])
						smallest=intArray[b];
			}
		return smallest;
	}
	
	/**
	 * finds largest int on the array
	 * @param intArray
	 * @return
	 */
	public int findLargestInt(int[] intArray)
	{
		int largest=intArray[9];		
		for(int a=0; a<intArray.length;a++)
			{
				if (largest<intArray[a])
						largest=intArray[a];
			}
		return largest;
	}
	
	/**
	 * method comparing smallest and largest then finding the difference
	 * @param intArray
	 * @return
	 */
	public int findDifferenceLargestSmallest(int[] intArray)
	{		
		int range=findLargestInt(intArray)-findSmallestInt(intArray);
		return range; 
	}
	
	/**
	 * printing array in reverse order
	 * @param intArray
	 */
	public void printReverseOrder(int[] intArray)
	{
		System.out.print("intArray[9] ="+intArray[9]+"\n"+"intArray[8] ="+intArray[8]+"\n"+"intArray[7] ="+intArray[7]+"\n"+"intArray[6] ="+intArray[6]
+"\n"+"intArray[5] ="+intArray[5]+"\n"+"intArray[4] ="+intArray[4]+"\n"+"intArray[3] ="+intArray[3]+"\n"+"intArray[2] ="+intArray[2]+"\n"+"intArray[1] ="+intArray[1]+"\n"+"intArray[0] ="+intArray[0]);
	}
	
	/**
	 * multiplies each element by 4 and return value
	 * @param intArray
	 */
	public void increaseValues(int[] intArray)
	{
		for(int g=0; g<intArray.length;g++)
		{
			intArray[g]=intArray[g]*4;
		}
	}
	
}
