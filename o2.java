package pc1;
import java.util.Scanner;
public class o2 {
	
	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		System.out.print("Type Sudent Name: ");
		String c=s3.nextLine();
		System.out.print("Type StudenT Roll no: ");
		
		int b=so.nextInt();
		System.out.print("Type Student Class:");
		int d=so.nextInt();
		System.out.print("Type Student branch:");
		String e=s3.nextLine();
		System.out.println("Student Details:"+"\n"+c+"\n"+b+"\n"+d+"\n"+e);
		

	}

}
