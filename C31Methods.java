import java.util.Scanner;

public class C31Methods {

    static int logic(int a, int b) {       //static method  yadi static nhi banaunga to jitne
        //object banenge sabki apni apni logic ki copy rahegi
        int c;
                             // a or b value yadi change bhi
        if (a < b) {         // karenge to calling ke time koi fark nhi padega

            c = a * b;

        } else {
            c = a / b;
        }
        return c;

    }

    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int x=n.nextInt();
        int y=n.nextInt();
        int c1;
        //C31Methods obj= new C31Methods();    
        c1 =logic(x, y);
        System.out.println(c1);
    }

}
