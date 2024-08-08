public class First {



    int xy = 56; 

    int x = 5;   



    // Constructor

    public First() {

      

    }

    public static int Addition(int a,int b) {

    	return a+b;

    }

    public static void basicMethod(int c) {

    	System.out.println(Math.sqrt(c));

    	String ab="applesarecostly";

    	System.out.println(ab.toUpperCase());

    	System.out.println(ab.toLowerCase());

    	System.out.println(ab.length());

    }

    public static void pars(int abs,int abt) {

    	System.out.println(abs-abt);

    }

    public static void is_prime(int p) {

    	//int count=0;

    	boolean if_prime=false;

    	if (p==0||p==1) {

    		System.out.println("Its not prime number");

    		

    	}

    	else {

    		for(int i=2;i<=Math.sqrt(p);i++) {

    			if(p%i==0) {

    				if_prime=false;

    				break;

    			}

    			

    		}

    		if(if_prime) {

    			System.out.println("Its a prime");

    		}

    		else {

    			System.out.println("Its a not prime number");

    		}

    	}

    }

    // Main method

    public static void main(String[] args) {

        // Create an instance of CreatingAClass

    	First myObj = new First();

        

        // Access the instance variable 'x' through the instance 'myObj'

        System.out.println(myObj.xy);

        System.out.println(Addition(9,10));

        basicMethod(5);

        pars(45,10);

        is_prime(83);

    }

}