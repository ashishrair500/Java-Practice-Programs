package com.JavaApnaCollege;


public class A13Stringbuilder {
    public static void main(String[] args) {
      //   string is immutable   
StringBuilder sb = new StringBuilder("Tony");

System.out.println(sb);

//char at index 0
System.out.println(sb.charAt(0));
  

//set char at index 0  

sb.setCharAt(0, 'p');

System.out.println(sb);

sb.insert(2, 's');

System.out.println(sb);

sb.delete(1, 2);
System.out.println(sb);

sb.append("s");         //last s ko jod dega ye
System.out.println(sb);
    }
    
}
