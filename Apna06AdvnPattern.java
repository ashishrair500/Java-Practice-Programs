package com.JavaApnaCollege;

import javax.swing.SpringLayout;

public class Apna06AdvnPattern {
    public static void main(String[] args) {

        
         //Butterfly Pettern
         int n=3;
         for (int i = 0; i <= n; i++) {
         
         for (int j = 0; j <=i; j++) {
         System.out.print("*");
         
         }
         for (int j = 0; j < 2*(n-i); j++) {
         System.out.print(" ");
         
         }
         for (int j = 0; j <=i; j++) {
         System.out.print("*");
         
         }
         
         System.out.println();
         
         
         }
         
         
         
         for (int i = n; i>= 0; i--) {
         
         for (int j = 0; j <=i; j++) {
         System.out.print("*");
         
         }
         for (int j = 0; j < 2*(n-i); j++) {
         System.out.print(" ");
         
         }
         for (int j = 0; j <=i; j++) {
         System.out.print("*");
         
         }
         
         System.out.println();
         
         
         }
         
         
         // for (int i = 0; i <= n; i++) {
         //
         // for (int j = n; j >=i; j--) {
         // System.out.print("*");
         //
         // }
         // for (int j = n; j >= 2*(n-i); j--) {
         // System.out.print(" ");
         //
         // }
         // for (int j = n; j >=i; j--) {
         // System.out.print("*");
         //
         // }
         //
         // System.out.println();
         //
         //
         // }
        
        /* 
         * int m = 4;
         * int a = 4;
         * 
         * for (int i = a; i >=0; i--) {
         * 
         * for (int j = 0; j <= i; j++) {
         * System.out.print(" ");
         * 
         * }
         * for (int j = 0; j <=m; j++) {
         * 
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * }
         */

        // second method to print butterfly pattern

        /*
         * int m = 4;
         * int a = 4;
         * 
         * for (int i = 0; i <m; i++) {
         * 
         * for (int j = 0; j <= (m-i); j++) {
         * System.out.print(" ");
         * 
         * }
         * for (int j = 0; j <=m; j++) {
         * 
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * }
         * 
         * 
         */
        /*
         * 
         * // Number pyramid
         * int n=5;
         * for (int i = 1; i <=n; i++) {
         * 
         * for (int j = 0; j <=(n-i); j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <=i; j++) {
         * System.out.print(i+" ");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * //Palindromic pattern
         * 
         * int n=5;
         * 
         * for (int i = 1; i <=n; i++) {
         * for (int index = 0; index <= (n-i); index++) {
         * System.out.print(" ");
         * }
         * for (int j = i; j >= 1; j--) {
         * System.out.print(j);
         * 
         * }
         * 
         * for (int j = 2; j <=i; j++) {
         * System.out.print(j);
         * }
         * 
         * System.out.println();
         * 
         * }
         */

        // Diamond Star save
/* 
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");

            }

            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");

            }

            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
 */
    }

}
 