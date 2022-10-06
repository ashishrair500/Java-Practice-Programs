package com.JavaApnaCollege;

import java.util.Scanner;

public class Apna03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age =sc.nextInt();
        // if (age>=18){
        // System.out.println("Your are iligible to vote");
        // }
        // else{
        // System.out.println("Your are not iligible to vote");
        // }
        /*
         * System.out.println("Enter a number");
         * long x= sc.nextLong();
         * if (x%2==0) {
         * System.out.println("It is Even number");
         * 
         * } else {
         * System.out.println("Not a even number");
         * 
         * }
         */
       
       /*  System.out.println("Enter first number");

        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (a == b) { // if we do use curlie bracket it will work 'amazing"

            System.out.println("both are equal");
        }

        else if (a > b) {

            System.out.println("A is greater");

        } else {
            System.out.println("B is greater");
        }*/

        int button= sc.nextInt();
        switch (button) {
            case 1: System.out.println("power on");
                
                break;
        case 2:
        System.out.println("power off");
            default:
            System.out.println("are karna kya chahte ho");
                break;
        }

    }

}
