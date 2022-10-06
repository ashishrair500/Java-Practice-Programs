import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        Random r=new Random();
        float a= r.nextFloat(3.0f);
        System.out.println(a);
        System.out.println(args[0]);
    }
}
