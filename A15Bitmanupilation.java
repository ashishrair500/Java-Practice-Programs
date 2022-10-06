package com.JavaApnaCollege;

public class A15Bitmanupilation {

    public static void main(String[] args) {
        // Get the 3rd bit(position=2)of a number n. (n=0101)  
//Bit masking

        //bit mask:1<<i
//Operation:AND
//(i)
//Bit mask:1<<i;
//Operation:AND;
 
//1<<3
//0001<<3
//1000
//(n=0101) And 1000;
//answer=0000  

int n=5; //into decimal number
int pos=3;
int bitmask=1<<pos;
//System.out.println(bitmask);
if((bitmask&n)==0){
    System.out.println("Bit was zero");
} else {
    System.out.println("bit was one");
}


    }
    
}
