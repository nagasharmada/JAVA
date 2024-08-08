
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = myObj.nextInt();
		int s = 1;
		for(int i = 1;i<=n;i++) {
			s*=i;
		}
		System.out.println("The factorial is"+s
	}

}
