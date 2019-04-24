/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.IOException;

/**
 * <driver class to read/write a cd collection>
 *
 * @author Andrae Ramsey
 *
 */
public class CDDriver 
{

	public static void main(String[] args) throws IOException 
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";
			
		CDOutput out = new CDOutput();
		CDInput in = new CDInput();
		//Song song=new Song(String, String);
		
		int	count = 0;  // Counter to keep track of number of elements in the array
		int choice = 0; // Menu choice
					
			Song[] songArray=new Song[MAX_ARRAY_SIZE];
			for(int i=0;i<MAX_ARRAY_SIZE;i++)
				{
					songArray[i]=new Song("","");
				}
		
		// Read the data from the input file into the array
			in.readMusicCollection(songArray);
		// Return the count for the elements currently in the array 
			//System.out.print(songArray.length);
			//System.out.println(in.readMusicCollection(songArray));
				
		// Open the file to append  (this is the same file used for the input
			out.openFile(FILENAME);				
		// Print the menu
			out.printMenu();
		// Read the menu choice
			choice=in.readMenuChoice();
		
		count=in.readMusicCollection(songArray);
		
		while (choice != 3)
		{
			switch (choice)
			{
				case 1:
					
					// Read a new song to add to the collection from the keyboard
					Song newSong= in.readSong(); //call song variable 
					// Add the song to the array
					songArray[count]=newSong;	
					// Don't forget to increment the count
					count++;					
					// Add the song to the file
					out.writeToFile(newSong);	
					out.closeFile();

					break;
					
				case 2:
					// Print the list
					out.openFile(FILENAME);				

					out.printCollection(songArray,count);					
					break;
					
				default:
					System.out.println("Invalid menu choice.  Please try again.");
					break;
			}		
			out.printMenu();			
			choice=in.readMenuChoice();
		}
		out.closeFile();
	}

}
