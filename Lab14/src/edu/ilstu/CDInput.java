/*
 * File name: CDInput.java
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
import java.io.IOException;
import java.util.Scanner;

/**
 * <class for receiving info for collection>
 *
 * @author Cathy Holbrook
 *
 */
public class CDInput 
{
	private File file;
	private Scanner keyboard = new Scanner(System.in);
	private Scanner fileInput;
	
	/**
	 * Read menu choice
	 * 
	 * @return:  choice from menu
	 */
	public int readMenuChoice()
	{	
		System.out.print("Enter menu choice:");
		int choice=keyboard.nextInt();
		keyboard.nextLine();
		return choice;
	}
	
	/**
	 * Reads data for a new song from the keyboard
	 * 
	 * @return:	one song object
	 */
	public Song readSong()
	{		
		System.out.println("Please enter a title:  ");
		String title=keyboard.nextLine();
		
		System.out.println("Please enter the artist:  ");
		String artist=keyboard.nextLine();
		
		Song song=new Song(title,artist);
		
		return song;
	}
	
	/**
	 * Reads the data from the input file and
	 * keeps a count of the number of items
	 * read into the array
	 * 
	 * @param:	array of songs
	 * @param:  input filename
	 * @return:	count of items in array
	 */
	public int readMusicCollection(Song[] songArray)
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
			
		int count2 = 0;
		while(inputStream.hasNextLine())
			{
				String title=inputStream.nextLine();
				String artist=inputStream.nextLine();
				Song song=new Song(title,artist);
				songArray[count2]=song;
				count2++;
				//System.out.println(song);
			}
		inputStream.close();		
		return count2;
	}
		
}
