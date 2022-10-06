class A {
    public int harry() {
        return 4;

    }

    public void meth2() {
        System.out.println("I am meth2 of class A");

    }

}

class B extends A {
    int a;

    public int harry() {
        return 4;
    }
@Override                     //override annotation laga jaruri to nhi hai lekin recommended hai
    public void meth2(){
        System.out.println("I am a meth2 of class B");
    }

    
}

public class C48MethodOverriding {
    public static void main(String[] args) {

        B y = new B();
        A x = new A();
        x.meth2();
y.meth2();
    }

}
