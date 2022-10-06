import java.security.AlgorithmParameterGeneratorSpi;
import java.util.Scanner;

class myexception extends Exception {
    @Override
    public String toString() {
        return "I am toString()";

    }

    @Override
    public String getMessage() {
        return "I am getmessage()";

    }
}

public class C83ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 9) {
            try {
                throw new myexception();
                // throw new ArithmeticException("This is an exception") {

                // };

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
                System.out.println(e); // this will run toString method
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");

            }

        }
        System.out.println("Yes finished");

    }
}
