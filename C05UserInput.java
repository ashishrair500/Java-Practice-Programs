
import java.util.Scanner;
public class C05UserInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number 1");
        String str=sc.nextLine();
         //int a = sc.nextInt();    /Here we can declare the datatype as we want;88
         float a = sc.nextFloat();   // these are methods inside the class
         System.out.println("enter number 2");
         int b=sc.nextInt();
         System.out.println("sum of two number is ");
         //int sum =a+b;
         float sum = a+b;
         System.out.println(sum);

        
          }
}


        // boolean c = sc.hasNextInt();  //to check weather c is int or not
        // System.out.print(c);
        // String str = sc.next();   // only to read single word
        // String strl = sc.nextLine(); // to read whole line 