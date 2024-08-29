package pc1;

class Recta {
private int len;
private int bre;
	public int getArea() {
	return len*bre;
}
	public void setArea(int a,int b) {
		this.len=a;
		this.bre=b;
	}
}
public class Rect{
	public static void main(String[] args) {
		Recta a =new Recta();
		a.setArea(3,4);
		System.out.println(a.getArea());
	}
}
