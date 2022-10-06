package com.JavaApnaCollege;
import java.util.Scanner;
import java.util.jar.Manifest;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.text.html.HTMLDocument.RunElement;
import javax.xml.transform.Source;

import org.xml.sax.SAXNotRecognizedException;

public class A09functionPractice {
    // Question 01

    /*
     * public static int avg(int a, int b, int c) {
     * int avg=(a+b+c)/3;
     * return avg;
     * 
     * }
     * 
     * public static void main(String[] args) {
     * 
     * 
     * Scanner sc= new Scanner(System.in);
     * int a=sc.nextInt();
     * int b= sc.nextInt();
     * int c=sc.nextInt();
     * 
     * int average=avg(a, b, c);
     * System.out.println(average);
     * 
     * }
     */

    // Question 2; Sum of odd number
    /*
     * public static int sum = 0;
     * 
     * public static void sumOfOddNumber(int n) {
     * for (int index = 1; index <= n; index++) {
     * sum = sum + 2 * index - 1;
     * }
     * System.out.println(sum);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * Scanner s = new Scanner(System.in);
     * int n = s.nextInt();
     * sumOfOddNumber(n);
     * }
     */
    // Question 3:- greater number

    /*
     * public static void greaterNumber(int x, int y) {
     * if (x > y) {
     * System.out.println(x);
     * 
     * } else if (x == y) {
     * System.out.println("Both are equal");
     * 
     * } else {
     * System.out.println(y);
     * }
     * 
     * }
     * 
     * public static void main(String[] args) {
     * 
     * Scanner st = new Scanner(System.in);
     * int x = st.nextInt();
     * int y = st.nextInt();
     * 
     * greaterNumber(x, y);
     * }
     */

    // Question no 4:- Return circumference
    /*
     * public static double circumference(int radius){
     * return 2*Math.PI*radius;
     * 
     * }
     * public static void main(String[] args) {
     * System.out.println("Enter the radius of circle");
     * Scanner se= new Scanner(System.in);
     * int radius=se.nextInt();
     * double c=circumference(radius);
     * System.out.println("Circumference fo cirlce is: "+c);
     * }
     * 
     */
    // Question no 5:- Age ka khela

    /*
     * public static String Age(int age){
     * if (age>=18) {
     * return "Eligible to vote";
     * 
     * } else {
     * return "Not Eligible to vote";
     * 
     * }
     * }
     * public static void main(String[] args) {
     * Scanner a= new Scanner(System.in);
     * int age= a.nextInt();
     * String s=Age(age);
     * System.out.println(s);
     * }
     */

    // Question no 6:- infinite do while loop
    /*
     * public static void main(String[] args) {
     * int i=0;
     * 
     * do {
     * System.out.println("THis is a infinite loop");
     * i++;
     * } while (i>=0);
     * }
     */

    // Question no 7:- Return and print total number

    /*
     * public static void main(String[] args) {
     * 
     * 
     * 
     * int countPositive = 0;
     * int countNegative = 0;
     * int countzeroes = 0;
     * for (int i = 0; i >=0; i++) {
     * Scanner n= new Scanner(System.in);
     * 
     * int number= n.nextInt();
     * 
     * 
     * if (number > 0) {
     * countPositive++;
     * } else if (number == 0) {
     * countzeroes++;
     * 
     * } else {
     * countNegative++;
     * }
     * System.out.println("Total number of positive input "+countPositive);
     * System.out.println("Total number of zero input  "+countzeroes);
     * System.out.println("Total number of negative input "+countNegative);
     * 
     * }
     * 
     * }
     * 
     */

    // Question number 8:- find value of power over another number

    /*
     * public static void main(String[] args) {
     * Scanner t= new Scanner(System.in);
     * int x=t.nextInt();
     * int n= t.nextInt();
     * int y=1;
     * for (int i = 0; i < n; i++) {
     * y=y*x;
     * 
     * }
     * 
     * System.out.println(y);
     * }
     * 
     * 
     */

    // Question Number 9:- To find greatest common divisor
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         int n=s.nextInt();
        int a = 0;
        int b = 1;
         if(n>1){
       //  find nth term
        System.out.print(a+" ");
        for (int i = 0; i <= n; i++) {
            System.out.print(b + " ");
            // Swaping

            int temp = b;
            b = a + b;
            a = temp;

             }

        }

    }
}
