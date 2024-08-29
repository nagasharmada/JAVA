package pc1;

public class cat {
		int age;
		String name;
		 public cat() {
			 age=0;
			 name="Unknown";
		 }
	
	public static void main(String[] args) {
		cat obj1= new cat();
		System.out.println(obj1.age+" "+obj1.name);
	}
}
