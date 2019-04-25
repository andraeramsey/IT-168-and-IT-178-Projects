package proj4Ramsey;

public class BillingTest
{
	public static void main(String[] args)
	{
		Patient patient1=new Patient("Troy","202083");
		Patient patient2=new Patient("Andrew","360172");
		
		Doctor doctor1=new Doctor("John Dorian",500.00,"Internal Medicine");
		Doctor doctor2=new Doctor("Chris Turk",1000.00,"Surgery");
		int doc1PatientNum=0;
		int doc2PatientNum=0;		
		
		Billing billPatient1=new Billing(patient1,doctor1);
		Billing billPatient2=new Billing(patient2,doctor2);
		
		System.out.println("Patient 1: "+patient1.getName());
		System.out.println("ID: "+patient1.getIdNumber());
		System.out.println("Doctor 1: "+doctor1.getName());		
		System.out.println("Field: "+doctor1.getSpecialty());
		System.out.println("Visit Cost: "+doctor1.getVisitFee());
		doc1PatientNum ++;
		
		
		System.out.println("Patient 2: "+patient2.getName());
		System.out.println("ID: "+patient2.getIdNumber());
		System.out.println("Doctor 2: "+doctor2.getName());
		System.out.println("Field: "+doctor2.getSpecialty());
		System.out.println("Visit Cost: "+doctor2.getVisitFee());
		doc2PatientNum ++;
		
		double totalIncome=(doctor1.getVisitFee()*doc1PatientNum)+(doctor2.getVisitFee()*doc2PatientNum);
		System.out.println("Total income is: "+totalIncome);
	}
}
