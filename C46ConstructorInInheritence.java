class base1 {
    int x;

    base1() {
        System.out.println("i am a constructor");
    }

    base1(int a) { // constructor overloading
        System.out.println("I am a overloaded constructor with value of a as " + a);
    }

    public int getx() {
        return x;

    }

    public void setx(int x) {
        this.x = x;
        System.out.println("i am setting x in base now");
    }

}

class derived1 extends base1 {
    int y;

    derived1() {
        // super(0); // base class ka argument bala constructor run karne ke liye super
        // keyword ka
        // use karna padta hai
        System.out.println("i am a derived class constructor");
    } // or yaha jo add karenge bo bhi include ho jayega

    derived1(int a, int b) {
        super(a);
        System.out.println("I am derived class overloaded constructor " + b);
    }

    public int gety() {
        return y;

    }

    public void sety(int y) {
        System.out.println("i am setting y in derived class");
        this.y = y;
    }
}

class childOfderived extends derived1 {
    childOfderived() {
        System.out.println("I am a  childOfderived ");

    }

    childOfderived(int a, int b, int c) {
        super(a, b);
        System.out.println("i am overloaded constructor of  childOfderived " + c);
    }

}

public class C46ConstructorInInheritence {

    public static void main(String[] args) {
        // base1 b = new base1(); // sabse pehle base class ka constructor run hota Hai
        // derived1 d = new derived1(10, 12); // bad derived class ka constructor run
        // hota hai
        //childOfderived c = new childOfderived();
        childOfderived c = new childOfderived(10,12,14);
    }
}
