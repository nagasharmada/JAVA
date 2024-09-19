//Write a Java Program to Print first letter of your name (Use Scanner class & loop)
class Pattern{
    public static void main(String[] args)
    { 
    int n=5;
        int i, j;
        
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= n - i; j++) {
                System.out.print("*");

}
System.out.println();
            }
            for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
            System.out.println("*");
            
            
            }
            System.out.println();
            }
            
            }
            }
