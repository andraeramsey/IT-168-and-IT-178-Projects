package proj4Ramsey;

public class PatientTest
{
	public static void main(String[] args)
	{
		Patient patient1=new Patient("Kevin","ICU830");
		Patient patient2=new Patient("Drew","OC198");
		
		Patient otherPatient=patient2;
		patient1.isSame(otherPatient);
	}
}
