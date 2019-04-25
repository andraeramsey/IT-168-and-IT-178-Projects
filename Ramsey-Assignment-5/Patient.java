package proj4Ramsey;

public class Patient extends Person
{	
	//private String name;
	private String idNumber;
		
	public Patient(){}
	public Patient(String name,String idNumber)
	{
		//this.name=name;
		super(name);
		this.idNumber=idNumber;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber()
	{
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}
	
	public boolean isSame(Patient otherPatient)
    {
        if (this.getName().equalsIgnoreCase(otherPatient.getName())&&this.idNumber.equalsIgnoreCase(otherPatient.idNumber))
        	{System.out.println("They are the same");
        	return true;}
        else
        	System.out.println("They are not the same");
        	return false;
    }
}
