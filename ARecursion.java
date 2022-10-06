package com.JavaApnaCollege;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

//before going the recursion remember stack play a very crutial role here

public class ARecursion {
    // public static void rec(int n){
    // if (n==10) { //this is base case of the recursion
    // return;
    // }
    // System.out.println(n); //for every call of recursion n is declaring in memory
    // again and again
    // rec(n+1);

    // }

    // public static void sum(int n) {
    // int summ = 0;
    // summ = summ + n;
    // if (n == 10) {
    // System.out.println(summ);
    // return;
    //
    // }
    //
    // sum(n + 1);   
    //
    // }

    // to find the factorial of the n ;
    /*
     * public static int factorial(int n) {
     *
     * if (n == 1 || n == 0) {
     * return 1;
     * }
     * return n * factorial(n - 1);
     * 
     * }
     * 
     * //to print fibonacci sequence till nth term;
     * 
     * 
     * public static void factorial(int a, int b ,int n){
     * if(n<=a)
     * return;
     * b=b+a;
     * System.out.println(b);
     * 
     * factorial(b,a,n-1);
     * }
     */       /* 
     // To find the value of X to the power of n  stack height is n
    public static int cal_power(int x, int n) {          //stack height is n 
        if (n == 1) { // base case one
            return 1; // base case two
        }
        if (n == 0) {
            return 0;
        }
        int y = x * cal_power(x, n - 1);
        return y;                                                            

    }
     */
    //find the  height logn


public static  int xpower(int x , int n){
    if (n==0) 
    return 1;

    if(x==0)
    return 0;

    // if n is even
    if(n%2==0)
    return xpower(x, n/2)*xpower(x, n/2);
    else
    return xpower(x, n/2)*xpower(x, n/2)*x ;

}
    public static void main(String[] args) {
        // int x=0;
        // rec(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int f = sc.nextInt();
        System.out.println("Enter power of that number");
        int g = sc.nextInt();
        int cal = xpower(f, g);
        System.out.println(cal);

        // int input=sc.nextInt();
        // System.out.println("0");
        // factorial(0, 1,input-2);

        // int y = 1;
        // sum(y);
        // int a = sc.nextInt();
        //
        // int ans = factorial(a);
        // System.out.println(ans);

    }

}