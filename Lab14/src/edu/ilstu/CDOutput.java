/*
 * File name: CDOutput.java
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * <outputs collection info to screen>
 *
 * @author Cathy Holbrook
 *
 */
public class CDOutput 
{
	PrintWriter outputFile;	
	
	/**
	 * Prints the menu
	 */
	public void printMenu()
	{
		System.out.println();
		System.out.println();
		System.out.println("CD Collection Menu\n");
		System.out.println("1. Add a CD");
		System.out.println("2. Print List");
		System.out.println("3. Quit");
	}

	/**
	 * Prints the CD collection in the array
	 * 
	 * @param:	array of songs
	 * @param:	count of elements currently in array
	 */
	public void printCollection(Song[] songArray, int count)
	{
		Scanner inputStream=null;
		try
			{
				inputStream=new Scanner(new File("Collection.txt"));
			}
		catch(IOException ioe)
			{
				System.out.print("error opening file");
				System.exit(0);
			}
		while(inputStream.hasNextLine())
		{
			int t=0;
			//System.out.print(inputStream.nextLine());
			//System.out.print("\n");
			String title=inputStream.nextLine();
			String artist=inputStream.nextLine();
			Song song=new Song(title,artist);
			songArray[t]=song;
			t++;
			System.out.println(song);
			
		}
		System.out.print("count: "+count);		
	}
	
	/**
	 * Opens an existing file to append data to
	 * 
	 * @param:	file reference
	 * @throws IOException 
	 */
	public void openFile(String filename) 
	{
		//PrintWriter outputFile=new PrintWriter();
		//PrintWriter outputFile=null;
		try
			{
				//PrintWriter outputFile=new PrintWriter(fileName);
				outputFile=new PrintWriter(new FileOutputStream("Collection.txt", true));
			}
		catch(IOException ioe)
			{
				System.out.print("Error");
				System.exit(0);
			}
		
	}
	
	/**
	 * Writes a song to the file
	 * - title on one line
	 * - artist on the next line
	 * 
	 */
	public void writeToFile(Song song)
	{
		outputFile.print("\n");
		outputFile.println(song.getTitle());
		outputFile.println(song.getArtist());
		//System.out.print("\n");	
		
	}
	
	/**
	 * Close the file
	 */
	public void closeFile()
	{
		outputFile.close();
	}
}
