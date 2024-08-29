package pc1;
class Animal{
	void move() {
		System.out.println("I am Movinggg");
	}
}
class Cheetah extends Animal{
	void move() {
		System.out.println("Cheetah is movingg");
	}
}
public class AniCla {
	public static void main(String[] args) {
	Cheetah obj =new Cheetah();
	obj.move();
}}
