
public class Lab8
{
	private int x; 
	private double y; 
	public static void setValues(int a, double b) { 
	x = a; 
	y = b; 
	} 

	

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	enum Coffee { MEDIUM, DARK, DECAF } //Find the error(s) in the following switch statement: 
		// This code has errors! 
		Coffee myCup= DARK; 
		//myCup =Coffee.DARK;
		switch (myCup) 
		{ 
		case Coffee.MEDIUM : 
		System.out.println("Mild flavor."); break; 
		case Coffee.DARK : 
		System.out.println("Strong flavor."); 
		break; 
		case Coffee.DECAF : 
		System.out.println("Won’t keep you awake."); 
		break; 
		default: 
		System.out.println("Never heard of it."); 
		}
	}

}
