package com.JavaApnaCollege;

import java.util.Scanner;

/*  public class A112Darray {
public static void main(String[] args) {
    // 2 d arrays is nothing but matrix 2*2 which is row* columns

    // memory occupied by any array = rows*coloumn*size of data type

    int [][]  marks=new int[2][2];
    marks[0][0]=1;
    marks[0][1]=2;
    marks[0][2]=3;
    marks[1][0]=4;
    marks[1][1]=5;
    marks[1][2]=6;
    marks[2][0]=7;
    marks[2][1]=8;
    marks[2][2]=9;
/* 
for (int i = 0; i < marks.length-1; i++) {

    for (int index = 0; index<marks.length-1; index++) {

        System.out.println(marks[i][index]);
        
    }    */

public class A112Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns");

        int columns = sc.nextInt();

        int[][] mark = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                mark[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(mark[j][i] + " ");

            }
            System.out.println();
        }

        /* 
        // to search a number and print thier indice
        System.out.println("Enter the that you want to search");
        int number = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mark[i][j] == number) {
                    System.out.println(i + " " + j);

                }
            }

        }    */

    }

}

/*
 * 
 * 
 * 
 * // Transpose of the matrix
 * 
 * public class A112Darray{
 * public static void main(String[] args) {
 * Scanner sc= new Scanner(System.in);
 * int row =sc.nextInt();
 * 
 * 
 * 
 * 
 * int marks[][]=new int[][]
 * }
 * }
 */
