import java.util.Scanner;

public class C23ForLoops {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        
        for (int i = 0; i <= a; i++) {
            
            System.out.println(2*i+1);
            
        }

//decrementing for loop
        for(int i=5; i!=0; i--){
            System.out.println(i);

        }

    }
}
