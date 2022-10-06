class ekclass {
    int a;

    public int getA() {
        return a;
    }

    ekclass(int a) {
        this.a = a;        //This is a reference

    }

    public int returnone() {
        return 1;
    }
}

public class C47ThisAndSuperKeyword {
    public static void main(String[] args) {
        ekclass e = new ekclass(5);
        System.out.println(e.getA());
    }

}
