import java.util.Scanner;

public class C34Recursion{
    //Recursion essa function jo khud hi call hue jata hai
static int Factorial(int n){
    if (n==1||n==0) {
        return 1;
        
    } else {
        
       
    return n*Factorial(n-1); }

}

    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
System.out.println("Enter a number ");
        int x=w.nextInt();
        int p=Factorial(x);
        System.out.println(p);
    
}
}