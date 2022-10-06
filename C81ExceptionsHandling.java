import java.util.Scanner;

public class C81ExceptionsHandling {
    public static void main(String[] args) {
        int[] marks = { 100, 99, 98, 90, 96 };
        // System.out.println(marks[i]);
        // for (int i = marks.length - 1; i >= 0; i--) {
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide th value with");
        int num = sc.nextInt();

        try {
            System.out.println("Value of index you entered is " + marks[idx]);
            System.out.println("The value of arrat-value/number is " + marks[idx / num]);
        } catch (ArithmeticException e) {
            System.out.println("Arithematic " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Programm can not be executed due to " + e);

        } catch (Exception e) { // ye bala exception isliye taki koi essi problem aye jisko ham expect nhi kiye
                                // ho to usko ye chhod de
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}