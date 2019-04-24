package proj4Ramsey;

public class Billing extends Patient
{	
	private Patient patient;
	private Doctor doctor;
	
	public Billing(){}
	public Billing(Patient patient,Doctor doctor)
	{
		patient=new Patient();
		doctor=new Doctor();
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient)
	{
		this.patient = patient;
	}
	/**
	 * @return the doctor
	 */
	public Doctor getDoctor()
	{
		return doctor;
	}
	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor)
	{
		this.doctor = doctor;
	}
	
	public boolean isEqual(Billing otherBill)
	{
		if(patient.equals(otherBill.patient)&&doctor.equals(otherBill.doctor))
			return true;
		else return false;
	}
	
	
	
	
	
	
	/*public static void main(String[] args)
	{
		
	}*/

}
