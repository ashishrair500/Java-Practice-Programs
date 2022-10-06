package com.JavaApnaCollege;

import java.util.Scanner;

public class A02P {
    int radius;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter radius of circle");
         int r=sc.nextInt();
         double area=r*r*Math.PI;
         System.out.println("Area of the circle is "+area);


    }
    
}
