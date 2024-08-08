//15) Write a program to calculate the sum of first 10 natural number.
public class sum_of_ten{
    public sum_of_ten(){

    }
    static int sum1(){
        int s=0,i=0;
        while(i<=10){
            s=s+i;
            i++;            
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println(sum1());
    }
}