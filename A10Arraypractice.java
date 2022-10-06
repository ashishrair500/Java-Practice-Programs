package com.JavaApnaCollege;

import java.util.Scanner;

public class A10Arraypractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int size = sc.nextInt();
         * 
         * String s[]=new String[size];
         * for (int i = 0; i < s.length; i++) {
         * s[i] = sc.next();
         * 
         * }
         * 
         * for (int i = 0; i < s.length; i++) {
         * System.out.println(s[i]);
         * }
         */

        // to check weather array is sorted or not ;

        /*
         * int size = sc.nextInt();
         * 
         * int marks[] = new int[size];
         * 
         * for (int i = 0; i < marks.length; i++) {
         * marks[i] = sc.nextInt();
         * }
         * 
         * int min = Integer.MAX_VALUE;
         * int max = Integer.MIN_VALUE; // don't know how it works
         * 
         * for (int i = 0; i < marks.length; i++) {
         * if (marks[i] < min) {
         * min = marks[i];
         * 
         * }
         * 
         * if (marks[i] > max) {
         * max = marks[i];
         * 
         * }
         * 
         * }
         * 
         * for (int i = 0; i < marks.length - 1; i++) {
         * System.out.println(marks[i]);
         * if (marks[i] > max) {
         * System.out.println("Array is not sorted in acending order");
         * 
         * break;
         * 
         * }
         * }
         */

        // Another method to check weather array is sorted or not

        int size = sc.nextInt();

        int marks[] = new int[size];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        boolean isAcending=true;

        for (int i = 0; i < marks.length - 1; i++) {

            if (marks[i] > marks[i + 1]) {

                isAcending = false;

            }
        }
        if (isAcending) {
            System.out.println("Array is sorted");
            
        } else {
            System.out.println("Array is not sorted");
            
        }

    }

}
