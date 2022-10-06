import javax.sound.sampled.SourceDataLine;

//Abstract means khyali pulab  , Existing only in thougths.  iss ham object nhi bana sakte hai
// A abstract method is declare without an implementation.
//Abstract class matlab jisme absract method ho.
abstract class base3 {
    public base3() {
        System.out.println("I  am constructor of base3 class");

    }

    public void sayHello() {
        System.out.println(" Hello");
    }

    abstract public void greet();
    abstract public void greet2();

}
class derived3 extends base3{
    
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Say hello");
    }
}

abstract class child2 extends base3{
    public void th(){
        System.out.println("Good evening");
    }
}

public class C53AbstractClass {
    public static void main(String[] args) {
        derived3 x=new derived3();
        //base3 y=new base3();      not possilbe since it is a abstract method 
       //child2 z=new child2();     not possilbe since it is a abstract method 
    }

}
