import java.util.Scanner;

public class C18SwitchCase {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = st.nextInt();
        // var can be an integer,character or string in java A switch can occur within
        // another but in practice this is rare
        switch (age) { // breake will needed to used with switch
            case 18:
                System.out.println("you are going to vote");
                break;
            case 19:
                System.out.println("you are going to married");
                break;
            case 20:
                System.out.println("you are good");
        }

        // enhance switch
        switch (age) {
            case 18 -> System.out.println("you are going to vote"); // here no need of breake statement;
            case 19 -> System.out.println("you are going to married");
        }

        /*
         * if (age>18) {
         * System.out.println("you can vote");
         * }
         * else if (age==18)
         * {
         * System.out.println("you can also vote");
         * }
         * else {
         * System.out.println("you can not vote");
         * }
         */
        // switch cases

    }

}
