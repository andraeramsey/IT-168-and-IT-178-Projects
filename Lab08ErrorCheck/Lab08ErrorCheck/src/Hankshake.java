
public class Hankshake
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=0;i<101;i++)
		{
			System.out.println("If there are "+ i +" people in the room then there is a total of "+handshake(i)+"handshakes.");
		}
	}
	public static int handshake(int n)
	{
		//use static so can use w/o crating an instance of it
		if (n<=1)
			return 0;
		else if (n==2)
			return 1;
		return (n-1)+handshake(n-1);
	}
}
