package com.JavaApnaCollege;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        //one swap per iteration
  /*       int arr[]={7,8,9,3,1,2};
        for (int i = 0; i < arr.length; i++) {
            int smallest=i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }

                
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
    
}     */

Scanner sc= new Scanner(System.in);
int sizeOfArray=sc.nextInt();
int arrs []=new int[sizeOfArray];

for (int i = 0; i < arrs.length; i++) {
    arrs[i]=sc.nextInt();
    
}

for (int i = 0; i < arrs.length-1; i++) {
    int smallest=i;
    for (int j = i+1; j < arrs.length; j++) {
        if (arrs[smallest]>arrs[j]) {
          smallest=j;
        }
    }

    //one swap per iteration
    //swap 
    int temp=arrs[smallest];
    arrs[smallest]=arrs[i];
    arrs[i]=temp;
    
    
} 

//time comlexity=O(n^2)


for (int i = 0; i < arrs.length; i++) {
    System.out.print(arrs[i]+" ");
    
}


    }
    
}
