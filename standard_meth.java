//4) Write a Java Program to implement Standard Methods    	
//(Math.sqrt(),toUpperCase(),toLowerCase(),length())
public class standard_meth{
    public standard_meth(){

    }
    public static void basicMethod(int c) {

    	System.out.println(Math.sqrt(c));

    	String ab="apples_are_costly";

    	System.out.println(ab.toUpperCase());

    	System.out.println(ab.toLowerCase());

    	System.out.println(ab.length());

    }
    public static void main(String[] args){
        basicMethod(5);
    }
}
