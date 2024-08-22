package pc1;

public class o4 {
	static public class p1{
		void calculate(int m,int n) {
			System.out.println(m/n);
		}
	}
	static public class c1 extends p1{
		void calculate(int m,int n) {
			System.out.println("I am in child"+" "+(m*n));
		}
	}
	public static void main(String[] args) {
		c1 obj1=new c1();
		p1 obj2 =new p1();
		obj1.calculate(6, 9);
		obj2.calculate(10, 9);
	}

}
