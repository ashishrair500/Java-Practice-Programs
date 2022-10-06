package com.JavaApnaCollege;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class A07Function {
/*
    //functions are store in the memory in the form of stack frame


    public static void printName(String name){
        System.out.println("Your name is "+name);



    } 
    public static int sumOfTwoNumber(int a , int b)
    {
        int sum=a*b;
     //   System.out.println(sum);
        return sum;
    }

*/

public static void  Factorial(int n){
    if (n<=0) {
        System.out.println("Invalid entry");
     return;   
    }

    int f=1;
   for (int j = n; j >=1; j--) {
            f= f*j;
       
   }
    System.out.println(f);
    
}

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
  //  String name=sc.next();
    //printName(name);           //calling a function
        
//int a=sc.nextInt();
//int b=sc.nextInt(); 

int n=sc.nextInt();
//or
//int sum=sumOfTwoNumber(a, b);
//System.out.println("Product of two number is"+sum);
Factorial(n);


}
    
}
