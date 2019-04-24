import java.util.HashMap;
import java.util.Scanner;
public class HashMapHistogram
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> histogram=new HashMap<Integer, Integer>();
		Scanner keyboard=new Scanner(System.in);
		int num=0;
		do
		{
			System.out.println("Enter a positive integer, -1 to quit:");
			num=keyboard.nextInt();
			if(num>0)
			{
				if(histogram.containsKey(num))
					histogram.put(num, histogram.get(num)+1);
				else
					histogram.put(num,1);
				
			}
		}while (num!=-1);
		printHistorgram(histogram);
	}
	public static void printHistorgram(HashMap<Integer, Integer> histogram)
	{
		for(Integer key: histogram.keySet())
		{
			Integer count=histogram.get(key);
			System.out.println("THe number "+key+" occurs "+count.intValue()+" times.");
		}
	}
}
