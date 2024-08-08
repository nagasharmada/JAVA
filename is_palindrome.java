package Programs;
import java.util.Scanner;
public class if_palindrome {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = myObj.nextInt();
		int r = 0;
		int t = n;
		int s = 0;
		while(n>0) {
			r = n%10;
			s = s*10 + r;
			n = n/10;
		}
		if(t==s) {
			System.out.println("It is a palindrome.");
		}
		else {
			System.out.println("It is not a palindrome.");
		}
	}

}
