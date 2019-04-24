import java.util.ArrayList;
import java.util.Scanner;

public class CharacterFrequency
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub //pg 926?
		ArrayList<Integer> digitCount=new ArrayList<Integer>();
		for(int x=0;x<10;x++)
			digitCount.add(0);
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter a phone number: ");
		String phone=keyboard.next();
		for(int i=0;i<phone.length();i++)
		{
			Character c=phone.charAt(i);
			switch(c)
			{
			case'0':
				digitCount.set(0,digitCount.get(0)+1);
				break;
			case'1':
				digitCount.set(1,digitCount.get(1)+1);
				break;
			case'2':
				digitCount.set(2,digitCount.get(2)+1);
				break;
			case'3':
				digitCount.set(3,digitCount.get(3)+1);
				break;
			case'4':
				digitCount.set(4,digitCount.get(4)+1);
				break;
			case'5':
				digitCount.set(5,digitCount.get(5)+1);
				break;
			case'6':
				digitCount.set(6,digitCount.get(6)+1);
				break;
			case'7':
				digitCount.set(7,digitCount.get(7)+1);
				break;
			case'8':
				digitCount.set(8,digitCount.get(8)+1);
				break;
			case'9':
				digitCount.set(9,digitCount.get(9)+1);
				break;
			//default:
				
				//break;
			}
		}
		System.out.println("The count for each digit is: ");
		for(int i=0; i<10; i++)
			System.out.println("Count of"+i+" is "+digitCount.get(i));
	}

}
