package proj6Ramsey;

public class Faculty extends Employee
{
	private String professionalTitle;
	
	public Faculty(){}
	public Faculty(String name,int employeeID,String department,String professionalTitle)
	{
		super(name,employeeID,department);
		setProfessionalTitle(professionalTitle);
	}

	/**
	 * @return the professionalTitle
	 */
	public String getProfessionalTitle()
	{
		return professionalTitle;
	}

	/**
	 * @param professionalTitle the professionalTitle to set
	 */
	public void setProfessionalTitle(String professionalTitle)
	{
		this.professionalTitle = professionalTitle;
	}
	
	public void writeOutput( )
    {
        super.writeOutput();
        System.out.println("Job Title/Position: "+professionalTitle);
    }
   
    public boolean isSame(Faculty otherFaculty)
    {
       if
    	(super.isSame(otherFaculty)==true&&
    	this.professionalTitle.equalsIgnoreCase(otherFaculty.getProfessionalTitle()))
    		return true;
    		else return false;
    	   
    }
	
}
