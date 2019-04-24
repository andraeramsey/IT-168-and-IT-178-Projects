package proj4Ramsey;

public class Person2
{
	private String name;
	private String idNumber;
	
	public Person2()
	{
		name="No name yet";
		idNumber="No ID yet";
	}
	public Person2(String initialName,String initialID)
	{
		name=initialName;
		idNumber=initialID;
	}
	public void setName(String newName)
	{
		name=newName;
	}
	public String getName()
	{
		return name;
	}
	
	public void setIDNumber(String newID)
	{
		idNumber=newID;
	}
	public String getID()
	{
		return idNumber;
	}
	public void writeOutput()
	{
		System.out.println("Name: "+name);
		System.out.println("ID Number: "+idNumber);
	}
	public boolean hasSameName(Person2 otherPerson)
	{
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
	public boolean hasSameID(Person2 otherPerson)
	{
		return this.idNumber.equalsIgnoreCase(otherPerson.idNumber);
	}
	
}
