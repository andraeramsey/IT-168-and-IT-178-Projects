package proj3Ramsey;

import java.util.Arrays;

public class EmployeeHours
{
	public static void main(String[] args)
	{
		int employeeInfo[][]=new int[9][9];
		int employeeHours[]=new int[8];
		
		employeeInfo[1][1]=2;
		employeeInfo[1][2]=4;
		employeeInfo[1][3]=3;
		employeeInfo[1][4]=4;
		employeeInfo[1][5]=5;
		employeeInfo[1][6]=8;
		employeeInfo[1][7]=8;
		
		employeeInfo[2][1]=7;
		employeeInfo[2][2]=3;
		employeeInfo[2][3]=4;
		employeeInfo[2][4]=3;
		employeeInfo[2][5]=3;
		employeeInfo[2][6]=4;
		employeeInfo[2][7]=4;
		
		employeeInfo[3][1]=3;
		employeeInfo[3][2]=3;
		employeeInfo[3][3]=4;
		employeeInfo[3][4]=3;
		employeeInfo[3][5]=3;
		employeeInfo[3][6]=2;
		employeeInfo[3][7]=2;
		
		employeeInfo[4][1]=9;
		employeeInfo[4][2]=3;
		employeeInfo[4][3]=4;
		employeeInfo[4][4]=7;
		employeeInfo[4][5]=3;
		employeeInfo[4][6]=4;
		employeeInfo[4][7]=1;
		
		employeeInfo[5][1]=3;
		employeeInfo[5][2]=5;
		employeeInfo[5][3]=4;
		employeeInfo[5][4]=3;
		employeeInfo[5][5]=6;
		employeeInfo[5][6]=3;
		employeeInfo[5][7]=8;
		
		employeeInfo[6][1]=3;
		employeeInfo[6][2]=4;
		employeeInfo[6][3]=4;
		employeeInfo[6][4]=6;
		employeeInfo[6][5]=3;
		employeeInfo[6][6]=4;
		employeeInfo[6][7]=4;
		
		employeeInfo[7][1]=3;
		employeeInfo[7][2]=7;
		employeeInfo[7][3]=4;
		employeeInfo[7][4]=8;
		employeeInfo[7][5]=3;
		employeeInfo[7][6]=8;
		employeeInfo[7][7]=4;
		
		employeeInfo[8][1]=6;
		employeeInfo[8][2]=3;
		employeeInfo[8][3]=5;
		employeeInfo[8][4]=9;
		employeeInfo[8][5]=2;
		employeeInfo[8][6]=7;
		employeeInfo[8][7]=9;
		
		int t=0;
		for (int row=1;row<9;row++)
		{
		int i=1;
		int tempTotal=0;	
			while (i<9)
			{
				tempTotal= employeeInfo[row][i]+tempTotal;
				i++;
			}
		employeeInfo[row][8]=tempTotal;
		employeeHours[t]=tempTotal;
		t++;
		}
		Arrays.sort(employeeHours);
		
		/*for(int index=0;index<employeeHours.length;index++)
		{
			System.out.println(employeeHours[index]);
		}*/
		
		for(int index=1;index<9;index++)
		{
			if (employeeHours[0]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[0]);
		}		
		for(int index=1;index<9;index++)
		{
			if (employeeHours[1]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[1]);
		}
		/*for(int index=1;index<9;index++)
		{
			if (employeeHours[2]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[2]);
		}*/
		for(int index=1;index<9;index++)
		{
			if (employeeHours[3]==employeeInfo[index][8])
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[3]);
		}
		for(int index=1;index<9;index++)
		{
			if (employeeHours[4]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[4]);
		}
		for(int index=1;index<9;index++)
		{
			if (employeeHours[5]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[5]);
		}
		for(int index=1;index<9;index++)
		{
			if (employeeHours[6]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[6]);
		}
		for(int index=1;index<9;index++)
		{
			if (employeeHours[7]==employeeInfo[index][8]) 
				System.out.println("Employee number is: "+index+" and Total Hours= "+employeeHours[7]);
		}
		 
			
	}
	

}
