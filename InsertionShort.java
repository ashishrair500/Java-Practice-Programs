package com.JavaApnaCollege;

import java.util.Scanner;

public class InsertionShort {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
int sizeOfArray=sc.nextInt();
int arrs []=new int[sizeOfArray];

for (int i = 0; i < arrs.length; i++) {
    arrs[i]=sc.nextInt();

}


for (int i = 1; i < arrs.length; i++) {
    int current=arrs[i];
    int j=i-1;                 //j is using to track the sorted part of the array
while(j>=0 && current<arrs[j]){

    arrs[j+1]=arrs[j];
j--;

}
//placement
arrs[j+1]=current;}


for (int i = 0; i < arrs.length; i++) {
    System.out.print(arrs[i]+" ");
}

   } 

}
