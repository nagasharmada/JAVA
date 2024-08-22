package pc1;

public class o6 {
public double simple_interest(int p ,double t,double r) {
	return (p*t*r)/100;
}
public static void main(String[] args) {
 o6 obj1 = new o6();
 System.out.println(obj1.simple_interest(102342, 12, 14));
}
}
