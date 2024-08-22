package pc1;
import java.util.Scanner;
public class o7 {
	static int add(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static double div(int a,int b) {
		return a/b;
	}
	static int rem(int a, int b) {
		return a%b;
	}
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Remainder\n6.Exit");
			System.out.println("Enter an Option: ");
			int c=i.nextInt();
			System.out.println("Enter a  value: ");
			int a=i.nextInt();
			System.out.println("Enter b value: ");
			int b= i.nextInt();
			switch(c) {
		
		case 1:
			System.out.println(add(a,b));
			break;
		case 2:
			
			System.out.println(sub(a,b));
			break;
		case 3:
			
			System.out.println(mul(a,b));
			break;
		case 4:
			
			System.out.println(div(a,b));
			break;
		case 5:
			
			System.out.println(rem(a,b));
			break;
		case 6:
			System.out.println("Exiting...Thank YOU!!");
			break;
		}
	}
	}
}
