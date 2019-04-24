package edu.ilstu;

public class Time
{
	private int theHour;
	private int theMinute;
	
	public Time()
	{
		theHour=0;
		theMinute=0;
	}
	public Time(int hour, int minute)
	{
		if(isValid(hour,minute))
		{
			theHour=hour;
			theMinute=minute;
		}
	}
	public Time(int hour, int minute, boolean isAM)
	{
		if(hour>1&&hour<=12)
		{
			if(isAM && hour<=12)
				hour=0;
			else if(!isAM && hour<12)
			{
				hour=hour+12;
			}
		}
		theHour=hour;
		theMinute=minute;
	}
	
	private boolean isValid(int hour, int minute)
	{
		return (hour>=0&&hour<=23)&&(minute>=0&&minute<=59);
	}
	//public int getTime(){return hour;}
	public void setTime(int hour, int minute)
	{
		if(isValid(hour,minute))
		{
			theHour=hour;
			theMinute=minute;
		}
	}
	public void setTime(int hour, int minute, boolean isAM)
	{
		if(hour>1&&hour<=12)
		{
			if(isAM && hour<=12)
				hour=0;
			else if(!isAM && hour<12)
			{
				hour=hour+12;
			}
		}
		theHour=hour;
		theMinute=minute;
	}
	//2 methods same name is called overloading
	public static void main(String[] args)
	{
		Time time1=new Time();
		System.out.println("Default value is "+ time1.theHour);
		System.out.println("Default minute is "+time1.theMinute);
		time1.setTime(4,15);
		System.out.println("Time is "+time1.theHour+":"+time1.theMinute);
		time1.setTime(4,15,false);
		System.out.println("Time is "+time1.theHour+":"+time1.theMinute);
	}

}
