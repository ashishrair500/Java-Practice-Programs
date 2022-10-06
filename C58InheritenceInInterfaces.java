
//Inheritence is allowed in interfaces

interface sampleinterrface {
    void math1();

    void math2();
}

interface childsampleinterface extends sampleinterrface {

    void math3();

    void math4();
}

class sampleclass implements childsampleinterface {
    public void math3() {
        System.out.println("meth3");
    }

    public void math4() {
        System.out.println("meth4");
    }

    public void math1() {
        System.out.println("math1");
    }

    public void math2() {
        System.out.println("math2");
    }
}

public class C58InheritenceInInterfaces {
    public static void main(String[] args) {

        sampleclass c = new sampleclass();
        c.math1();
        c.math2();
        c.math3();
        c.math4();

    }
}
