/*
 * File name: Song.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Nov 19, 2015
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Schaefer
 * Lab Section: 21
 * Lab Instructor: Kora
 */
package edu.ilstu;

/**
 * <song to set up for song info>
 * @author Andrae Ramsey
 *
 */
public class Song
{
	private String title;
	private String artist;
	
	/**
	 * Song constructor
	 * @param title
	 * @param artist
	 */
	public Song(String title,String artist)
		{
			this.title=title;
			this.artist=artist;
		}
	
	/**
	 * title getter
	 * @return the title
	 */
	public String getTitle()
		{
			return title;
		}

	/**
	 * artist getter
	 * @return the artist
	 */
	public String getArtist()
		{
			return artist;
		}

	/**
	 * method for toString
	 */
	public String toString()
		{
			return title+" by "+artist;
		}
}
