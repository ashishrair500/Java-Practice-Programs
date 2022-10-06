class c1 {

    public int x = 5;
    protected int y = 5;
    int z = 6;
    private int q = 5;

public void zq(){

    //Access Modifier
    //Public
    //Protected
    //Private:- can not be used in the different class
    //Default (no)  :-can not be used in the different packages
    

System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}

class c2 {
    public void zr(){
       // System.out.println(q);   no useful since q is private variable

    }

}

class c3 {

}

public class C66AccessModifier {
    public static void main(String[] args) {
        c1 c = new c1();
        c.zq();
    }

}
