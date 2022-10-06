class mythreadrunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("I am a thread not a threat");

        }

    }
}

class mythreadrunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("I am a thread 2 not a threat 2");

        }

    }

}

public class C71RunnableClass {
    public static void main(String[] args) {

        mythreadrunnable bullet1 = new mythreadrunnable();

        Thread gun1 = new Thread(bullet1);

        mythreadrunnable2 bullet2 = new mythreadrunnable2();

        Thread gun2 = new Thread(bullet2, "hello");

        System.out.println(gun2.getName());
        gun2.start();
        gun1.start();

    }
}
