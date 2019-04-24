package proj6Ramsey;

public class Staff extends Employee
{
	int payGrade;
	
	public Staff(){}
	public Staff(String name, int employeeID, String department,int payGrade)
	{
		super(name,employeeID,department);
		setPayGrade(payGrade);
	}

	/**
	 * @return the payGrade
	 */
	public int getPayGrade()
	{
		return payGrade;
	}

	/**
	 * @param payGrade the payGrade to set
	 */
	public void setPayGrade(int payGrade)
	{
		this.payGrade = payGrade;
	}
	
	public void writeOutput( )
    {
		super.writeOutput();
		System.out.println("Psy Grade: "+payGrade);
    }
   
    public boolean isSame(Staff otherStaff)
    {
       if
    	(super.isSame(otherStaff)==true&&
    	this.payGrade==otherStaff.getPayGrade())
    		return true;
    	else return false;
    			
    }
}
