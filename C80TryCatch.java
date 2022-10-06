import javax.sound.sampled.SourceDataLine;

public class C80TryCatch {

    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b; // dekho isme error to ayega lekin try karega uske execute karne ki nhi hoga
                           // execute to phir aage badh jayega
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("We failed to divide. reason :- " + e);
        }
        System.out.println("End of the program");
    }

}
