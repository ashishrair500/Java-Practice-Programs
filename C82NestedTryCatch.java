import java.util.Scanner;

public class C82NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = { 1, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
       
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");

            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to vedio");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // TODO: handle exception
                    System.out.println("sorry this index do not exit");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
                // TODO: handle exception
            }
        }
        System.out.println("Thanks for using program");
    }
}
