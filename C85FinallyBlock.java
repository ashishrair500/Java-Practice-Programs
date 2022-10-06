import javax.swing.text.StyledEditorKit.ForegroundAction;

//Finally block contains the code which is always  executed whether the exception is handled or not 
//It is used to execute code containing instructions to 'release the system resourses', 'close a connection etc'.
public class C85FinallyBlock {

    // static public int greet() {
    // try {
    // int a = 8;
    // int b = 0;
    // int c = a / b;
    // return c;
    // } catch (Exception e) {
    //
    // System.out.println(e);
    // } finally { // harhal me ye run hoge hi manega
    // System.out.println("Cleanig up resources ....This is the end of the
    // program");
    // }
    // return -1; // -1 means error
    // }

    public static void main(String[] args) {
        // int y = greet();
        // System.out.println(y);

        for (int i = 0; i < 10; i++) {
            System.out.println("hello hari");
            if (i == 6) {
                try {
                    System.out.println(2*i);
                    break;
                } catch (Exception e) {
                    System.out.println(e);
                    // TODO: handle exception
                }

                finally {
                    System.out.println("Program ends");
                }
            }
        }
    }
}
