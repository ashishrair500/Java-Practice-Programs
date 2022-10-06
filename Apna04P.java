package com.JavaApnaCollege;

import java.util.Scanner;


public class Apna04P {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * for ( ; ; ) {
         * 
         * System.out.println("Admi chutiya hai");
         * 
         * }
         */
        int n;

        int marks = 0;
        int i = 1;

        do {
            System.out.println("Enter either 1 or 0");
            n = sc.nextInt();
            if (n == 1) {

                marks++;
            }
            i++;

        } while (i <= 100);

        if (marks >= 90) {
            System.out.println("this is good");

        } else if (marks >= 89) {
            System.out.println("This is also good");
        }

        else if (marks >= 60) {
            System.out.println("This is good as well");
        } else {
            System.out.println("this is good as well");
        }
    }

}
