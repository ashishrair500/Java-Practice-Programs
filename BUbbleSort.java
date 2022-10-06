package com.JavaApnaCollege;
import java.util.*;
public class BUbbleSort {



/* 

public class BubbleSort {
   

    public static void main(String[] args) {
        // buble sort
  /*       int marks[] = { 7, 8, 3, 1, 2 };
       // for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length -i- 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                }
        //    }

        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();    

        int arr[]={100,96,99,98,97,80,89,85};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
            }
            
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }System.out.println();
    }

    }
  */




    public static void printArray(int arr[]) {    /* 
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
  
    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};
  
        //bubble sort
        for(int i=0; i<arr.length-1; i++) {   //this will also work i<arr.length but unnecessary sorting last element
            for(int j=0; j<arr.length-i-1; j++) {        //this will also wark arr.lenght-1 but unnecessary sorting sorted element
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
  //time complexity= 0(n^2); 
        printArray(arr);     */
        Scanner sc= new Scanner(System.in);
        int sizeOfArray=sc.nextInt();
int ar[]=new int[sizeOfArray];

for (int i = 0; i < ar.length; i++) {
     ar[i]=sc.nextInt();
    
}
for (int index = 0; index < ar.length; index++) {
    System.out.println(ar[index]+" ");
    
}

    }
  

  

    
}
