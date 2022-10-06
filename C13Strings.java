import java.util.Scanner;

public class C13Strings {
    public static void main(String[] args) {
        // String is class
        // String name =new String("hello");
        // System.out.println(name);
        // String is class but it can be used as data type
        // String name = "Hello";
        // System.out.println(name);
        int d = 5;
        float a = 1.33f;
        System.out.printf("hello %d how are you %f ", d, a);
        // System.out.format(l, format, args) this will also work in same way as printf
        // work
        Scanner st = new Scanner(System.in);
        // String sc=st.next(); // this method will only take sigle word as input
        String sc = st.nextLine();
        System.out.println(sc);

    }

}
