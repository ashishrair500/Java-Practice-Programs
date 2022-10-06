package com.JavaApnaCollege;

import java.util.Scanner;

public class Apna05p {
    public static void main(String[] args) {
        /*
         * for (int i = 1; i <=4; i++) {
         * for (int j= 1; j <=5; j++) {
         * System.out.println("*");
         * }
         * 
         * System.out.println();
         * }
         */
        // int n = 4;
        int m = 5;
        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * 
         * for (int j = 1; j <= m; j++) {
         * if(i==1 || j==1 || i==n || j==m){
         * 
         * System.out.print("*");}
         * else{
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * 
         * 
         * 
         * }
         */

        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = n; j > i-1; j--) {
         * System.out.print("*");
         * 
         * }
         * System.out.println("");
         * 
         * }
         */

        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * 
         * }
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * 
         * }
         */
        int n = 5;

        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = 1; j <=n-i+1; j++) {
         * System.out.print(j);
         * 
         * }System.out.println("");
         * //if (i<5) {
         * // System.out.println();
         * //
         * //}
         * 
         * }
         */

        // Floyd's Triangle
        /*
         * int number=0;
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = 1; j <= i; j++) {
         * 
         * number++;
         * System.out.print(number+" ");
         * 
         * }
         * System.out.println();
         * 
         * }
         */

        // 0 1 triangle

         
        
        /*int x = 0;
        int y = 1;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {

                    System.out.print(y);
                } else {
                    System.out.print(x);
                }

            }
            System.out.println();

        }
*/

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number ");
int a=sc.nextInt();

boolean isPrime=true;
for (int i = 2; i<=n/2; i++) {
    if (n%i==0) {
        isPrime=false;
        break;
    
    }
    
}

if (isPrime) {

    if (n==1) {
        System.out.println("this is neither a prime or composite number");
        
    } else {
        System.out.println("This is a prime number");
        
    }
    
} else {
       System.out.println("this is not a prime number");
    
}





    }
}
