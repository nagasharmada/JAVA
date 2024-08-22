package pc1;

public class o1 {
	  
	public int meth1() {
		int a=78;
		int b=45;
		return a+b;
	}
	public double meth1(double c) {
		int x=5;
		int y=34;
		return c+x+y;
	}
	public int  meth1(int b) {
		return b;
	}
	public int meth1(int b, int c ) {
		return b*c;
	}
	
	public static void main(String[] args) {
		o1 obj1 = new o1();
		System.out.println(obj1.meth1());
		System.out.println(obj1.meth1(4));
		System.out.println(obj1.meth1(25.0));
		System.out.println(obj1.meth1(4,9));

	}

}
