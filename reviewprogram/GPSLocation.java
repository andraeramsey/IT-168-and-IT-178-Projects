/*
 * File name: GPSLocation.java
 * Programmer: Andrae Ramsey
 * ULID: arrams1
 * Date: Aug 23, 2016
 *
 * Class: IT 178
 * Lecture Section: 01
 * Lecture Instructor: Pierce
 */
package edu.ilstu.reviewprogram;

/**
 * <class to get and format info from a .txt file>
 * @author Andrae Ramsey
 *
 */
public class GPSLocation
{
		private String name;
		private String latitude;
		private String longitude;
		
		public GPSLocation(String name, String latitude, String longitude)
		{
			this.name=name;
			this.latitude=latitude;
			this.longitude=longitude;					
		}
		
		/**
		 * @return the name
		 */
		public String getName()
		{
			return name;
		}

		/**
		 * @return the latitude
		 */
		public String getLatitude()
		{
			return latitude;
		}

		/**
		 * @return the longitude
		 */
		public String getLongitude()
		{
			return longitude;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name)
		{
			this.name = name;
		}
		/**
		 * @param latitude the latitude to set
		 */
		public void setLatitude(String latitude)
		{
			this.latitude = latitude;
		}
		/**
		 * @param longitude the longitude to set
		 */
		public void setLongitude(String longitude)
		{
			this.longitude = longitude;
		}

		
		//int i=100;
		//GPSLocation[] locationList=new GPSLocation[i];
		
		public String toString()
		{
			return   getName()+" is at"+"\t"+"\t"+getLatitude()+", "+getLongitude()+"\n";
		}			
}
