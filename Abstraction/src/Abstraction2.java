abstract class Loan
{
	abstract public void dispInterest();
	public void welcomeNote() {
		
		System.out.println("Welcome in xyz Bank");
	}
}
class PersonalLoan extends Loan
{
	public void dispInterest() {
		
		System.out.println("Rate is 12%");
	}
}
class EducatinLoan extends Loan
{
	public void dispInterest() {
		
		System.out.println("Rate is 2%");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		
		Loan ln = new PersonalLoan();
		
		ln.dispInterest();
		ln.welcomeNote();

	}

}
