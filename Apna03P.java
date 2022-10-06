package com.JavaApnaCollege;
// this a calculator;

import java.util.Scanner;

public class Apna03P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");

        int n = sc.nextInt();
        System.out.print("Enter operator  ");
        char Operator = sc.next().charAt(0);
        System.out.print("Enter second number ");
        int m = sc.nextInt();
        if (m == 0 & Operator == '/') {
            System.out.println("Infinity");

        } else {
            switch (Operator) {
                case '+':
                    System.out.println(n + m);

                    break;
                case '-':
                    System.out.println(n - m);
                    break;
                case '*':
                    System.out.println(n * m);
                    break;
                case '/':
                    System.out.println(n / m);
                    break;

                default:
                    System.out.println("invalid entry");
                    break;
            }

        }

    }
}
