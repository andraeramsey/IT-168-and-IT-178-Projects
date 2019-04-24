package proj4Ramsey;

public class Doctor extends Person
{
	private double visitFee;
	private String specialty;
	
	public Doctor(){}
	public Doctor(String name,double visitFee, String specialty)
	{
		//this.name=name;
		super(name);
		this.visitFee=visitFee;
		this.specialty=specialty;
	}

	/**
	 * @return the visitFee
	 */
	public double getVisitFee()
	{
		return visitFee;
	}

	/**
	 * @param visitFee the visitFee to set
	 */
	public void setVisitFee(double visitFee)
	{
		this.visitFee = visitFee;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty()
	{
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}
	
	public boolean isSame(Doctor otherDoctor)
    {
       if(this.specialty.equalsIgnoreCase(otherDoctor.specialty)&&
    		 this.visitFee==otherDoctor.visitFee)
    	   	return true;
       else return false;
    }
}
