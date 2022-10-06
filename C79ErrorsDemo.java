import java.util.Scanner;


public class C79ErrorsDemo {
    public static void main(String[] args) {
        // Logical error demo
        // write a program to print numbers between 1 to 10
        System.out.println(2);
        for (double i = 1; i < 10; i++) {
            System.out.println(2 * i + 1);
            // this will also print 9  which is not a prime number that why this is logical
            // error
        }

        //Runtime error is also a exception
        //
        int k ;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Interger past of 1000 divided by k is "+1000/k);
    
    //If user input 0 then it through an exception because it is not define in java 
    //this is a exapmle of run time error
    }

}
