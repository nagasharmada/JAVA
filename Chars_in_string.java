package Programs;
import java.util.Scanner;
public class Chars_in_string {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = myObj.nextLine();
		System.out.println(s.length());
	}

}
