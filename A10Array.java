package com.JavaApnaCollege;

import java.util.Scanner;

public class A10Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size]; // initialization
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
int x=sc.nextInt();
        // initialization
        for (int i = 0; i < size; i++) {

            if (number[i]==x ){                         //linear search
                System.out.println("X found at index number: "+i);
                
            }

        }
    }

}
