package pc1;
class Person{
	String fname;
	void getFirstName(String Frat) {
		fname=Frat;
	}
	void getLastName(){
		System.out.println("The last name is Dodra");
	}
}
class Chld extends Person{
	
	void getEmployeeeId() {
		System.out.println("Employee id is 56");
	}
	void getLastName() {
		System.out.println("The last name is Gogru "+"I work at Local Office");
	}
}
public class name {
	public static void main(String[] args) {
Chld j =new Chld();
j.getLastName();

}
	}
