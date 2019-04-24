package proj6Ramsey;

public class Employee extends Person
{
	private int employeeID;
	private String department;
	
	public Employee(){}
	public Employee(String name, int employeeID, String department)
	{
		super(name);
		setEmployeeID(employeeID);
		setDepartment(department);
		
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID()
	{
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	/**
	 * @return the department
	 */
	public String getDepartment()
	{
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public void writeOutput( )
    {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: "+getEmployeeID());
        System.out.println("Department: "+getDepartment());
    }
   
    public boolean isSame(Employee otherEmployee)
    {
       if 
       (super.hasSameName(otherEmployee)==true&&
        this.getEmployeeID()==(otherEmployee).getEmployeeID()&&
        this.getDepartment().equalsIgnoreCase(otherEmployee.getDepartment()))
    	   return true;
       else return false;
    }
}
