import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class C22DowhileLoop {
    public static void main(String[] args) {
        //bina condition ko check karein ghos jaata hai loop main
        /*int b=0;
        do { 
            System.out.println(b);
            b++;
        } while (b<5); */

Scanner n=new Scanner(System.in);
System.out.println("Enter a number to where you want to print ");
int m=n.nextInt();
int i=0;
do {
    System.out.println(i);
    i++;
} while (i<=m);




    }
    
}
