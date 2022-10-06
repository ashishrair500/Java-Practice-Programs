import java.time.YearMonth;

class base {      //super class
    int x;
    public void setx(int x) {
    this.x = x;
        System.out.println("i am setting x in base now");
    }
    public int getx() {
        return x;

    }

   
}
//subclass derived
class derived extends base {           //base class ka sab kuchh yaha available ho jayega or 
   int y;                              //or yaha jo add karenge bo bhi include ho jayega
   public int gety() {
    return y;

}

public void sety(int y) {
    System.out.println("i am setting y in derived class");
    this.y = y;
}


}

public class C45Inheritence {
    public static void main(String[] args) {

        base b=new base();
        b.setx(10 );
        b.getx();
        System.out.println( b.getx());

        //creating a object of derived class
        derived d=new derived();
        d.setx(5);
        d.sety(7);
       
        System.out.println(d.gety());
        System.out.println( d.getx());
    }
}
