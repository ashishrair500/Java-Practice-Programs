package com.JavaApnaCollege;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.sound.midi.Soundbank;

public class Recursion2 {

    // Tower of Hanoi
    /*
     * public static void towerOfHanoi(int n, String src, String helper,String
     * dest){
     * if(n==1){
     * System.out.println("transfer disk "+n+" from "+src+" to "+dest);
     * return;
     * }
     * 
     * 
     * towerOfHanoi(n-1, src, dest, helper);
     * System.out.println("transfer disk "+n+" from "+src+" to "+dest);
     * towerOfHanoi(n-1, helper, src, dest);
     * //System.out.println("transfer disk"+n+"from"+src+"to"+dest);
     * 
     * 
     * 
     * 
     * }
     */
    /*
     * //TO print String in reverse order
     * //Time complexity wii be O(n)
     * 
     * public static void string_reverse(int idx,String s){
     * if(idx==0){
     * System.out.print(s.charAt(idx));
     * return;
     * }
     * System.out.print(s.charAt(idx));
     * 
     * 
     * string_reverse(idx-1, s);
     * }
     * 
     */

    // To find the first and last occurance of the character
   //time complexcity is O(n);
   /* 
    public static int first = -1;
    public static int last = -1;

    public static void first_last_index(int idx, String s, char c) {

        if (s.length() == idx) {
            System.out.println(first + " " + last);
            return;
        }
        if (s.charAt(idx) == c) {
            if (first == -1) {
                first = idx;
            }
            last = idx;

        }

        first_last_index(idx + 1, s, c);
    }
*/
/*
//check if array is sorted is not

Time complexity is O(n) 

public static boolean is_arraySorted(int s, int arr[]){

if(s==arr.length-1){
return true;
}
if (arr[s]>arr[s+1]) {
         //Array is sorted
     return false ;
    
    }
else{
    return  is_arraySorted(s+1, arr);

}
   
  

}
*/
/* 
//Move all "x" to the end of the String

public static void moveAllx(String str,int idxx,int count,String newString){
    if (idxx==str.length()) 
    {
        for (int i = 0; i < count; i++) {
            newString+='x';
            
        }
        System.out.println(newString);
        return;
    }
    
    char currentchar=str.charAt(idxx);
    if (currentchar=='x') {
        count ++;
        moveAllx(str, idxx+1, count, newString);
    }
    else{
        newString+=currentchar;  //newString =newString+currentchar
        moveAllx(str, idxx+1, count, newString);

    }


}
//time complexity O(n+n)=O(2n)=O(n)   //we remove constant
 */
    public static void main(String[] args) {
        // int n=4;
        // towerOfHanoi(n, "source ", "Helper", "destination");
        // String t="abcd";
        // string_reverse(t.length()-1, t);

        Scanner sc = new Scanner(System.in);

       // String u = sc.nextLine();
       // char d = sc.next().charAt(0);
       // sc.close();
//
       // first_last_index(0, u, d);
//

//int s=sc.nextInt();
//int arr[]={1,2,3,4,5,6,7,8,9};
//
//System.out.println(is_arraySorted(0, arr));

//int marks[]={1,2,3,4};

String str="axbcxxd";

//moveAllx(str, 0, 0, "");  

    }
}
