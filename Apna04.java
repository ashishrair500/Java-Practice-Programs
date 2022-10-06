package com.JavaApnaCollege;

import java.util.Scanner;

public class Apna04 {
    public static void main(String[] args) {

        /*
for (int i = 0; i < 50; i=i+1 ){
    System.out.println(i);
    
}        */
/*
int x=0;
while (x<11) {
    System.out.println(x);
    x++;
    
}*/


/*int n=0;
do {     //do atleast one time;
    System.out.println(n);
n++;
    
} while (n<11);    */

//sum of n natural number
/*
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;

for (int i = 1; i <= n; i++) {
     sum=sum+i;

}    System.out.println(sum);
*/

// Table of number 
Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int t=s.nextInt();
for (int i = 1; i < 11; i++) {
    System.out.println(t+"*"+i+"="+t*i);
    
}
        
    }
    
}
