package pc1;

public class o5 {
    String name;

    // Static nested class
    static public class class1 {
        String name;
        int age;
    }

    public static void main(String[] args) {
        
        o5 outerObj = new o5();
       
        class1 obj1 = new class1();
        
        obj1.name = "Javi";
        obj1.age = 56;
        
        
        outerObj.name = "OuterName";

        
        System.out.println("Nested class name: " + obj1.name);
        System.out.println("Nested class age: " + obj1.age);
        System.out.println("Outer class name: " + outerObj.name);
    }
}
