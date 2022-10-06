import java.util.ArrayList;

public class C26Arrays {
    public static void main(String[] args) {
        // class of 500 students if we want to store their marks
        // we have two method :-
        // 1. create 500 varials
        // 2. Create array;
        // Array is a collection of similar type of data;
        //3 ways to create array;
        //ArrayList<Integer>=
        int[] marks;      //declaration 
        marks= new int[5]; // memory will allocate for 5 students/allocation
        
        //or int[]marks=new int[5]; decalaration + memory allocation
        //or int marks={100,99,98,97,96}    decalaratoin + allocation+initialize ;
        
        // memory allocation:-
        // total 5 Integer
        // one integer take 4 byte
        // total=5*4=20 byte;
        //Accesing array elements 

        //Initialization
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;      //these value can aslo we changed
        marks[3]=65;
        marks[4]=99;
       // marks[5]=101;                This is not possible because of index out of bound this problem is solved by ArraryList
        System.out.println(marks[4]);
//array start from 0 to (n-1);
    }

}
