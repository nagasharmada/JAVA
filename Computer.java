package pc1;

public class Computer {
	public class Processor {
		String brand="Intel";
		int speed=50;
		void displayDetails() {
			System.out.println(brand+" "+"Its speed "+speed);
		}
	
}
	public static void main(String[] args) {
		Computer outer=new Computer();
		Computer.Processor inner = outer.new Processor();
		inner.displayDetails();
		//System.out.println(outer.displayDetails());
	}
}
