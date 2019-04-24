import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> toDoList= new ArrayList<String>();
		boolean done=false;
		Scanner keyboard= new Scanner(System.in);
		while(!done)
		{
			System.out.println("Type an entry: ");
			String entry=keyboard.nextLine();
			toDoList.add(entry);
			System.out.println("Are there more entries?: ");
			String ans= keyboard.nextLine();
			if (!ans.equalsIgnoreCase("yes"))
				done=true;
		}
		System.out.println("The list contains: ");
		int listSize=toDoList.size();
		for(int position=0; position<listSize; position++)
			System.out.println(toDoList.get(position));
		
	}

}
