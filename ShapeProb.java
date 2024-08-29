package pc1;

class Shape {

 void getArea(int a, int b) {
     System.out.println("I am a Shape with " + a + " " + b);
 }
}

class Rectangle extends Shape {

 void getArea(int a, int b) {
     System.out.println(a * b + " is the rectangle area");
 }
}


class ShapeProb {
 public static void main(String[] args) {
    
     Rectangle obj1 = new Rectangle();
    
     obj1.getArea(5, 6);
 }
}

