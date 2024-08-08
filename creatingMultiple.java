//2) Write a Java Program to create multiple objects
public class creatingMultiple{
    int a=34;
    double b=45.7;
    char as='a';
    public void creatingMultiple(int x,double y){
        System.out.println(x+(int)y);

    }
    public static void main(String[] args){
        creatingMultiple object_1 = new creatingMultiple();
        creatingMultiple object_2 = new creatingMultiple();
        creatingMultiple object_3 = new creatingMultiple();
        System.out.println((float)object_1.a+object_2.b+(float)object_3.a);
    }
}