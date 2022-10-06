package com.JavaApnaCollege;



public class BackTracking {

    public static void BackTrcking(String str,String perm,int idx) {
      if(str.length()==0){
        System.out.println(perm);
        return;
      }
    for (int i = 0; i < str.length(); i++) {
    char curtchar=str.charAt(i);
    String newStr=str.substring(0, i)+str.substring(i+1);
    BackTrcking(newStr,perm+curtchar, idx+1);

}

    }    
    
public static void main(String[] args) {
    String str="ABC";
    BackTrcking(str, "", 0);

}




}
