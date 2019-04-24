package proj6Ramsey;

public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Person[] people = new Person[4];

		people[0] = new Faculty("Scott",1008,"Information Technolgy","System Admin");
		people[1] = new Staff("Brian",5011,"HR", 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}