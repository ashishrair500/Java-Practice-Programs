//Thread se actually help to run two function 
//at the time concurrently not parally   
//Run method below which is overrided in both the class will run at the same time 
//




class mythread1 extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (i < 40000) {
            System.out.println("My cooking thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class mythread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("thread 2 for chating with her good");
            System.out.println("I am good ");

        }
    }

}

public class C70CreatingThread {
    public static void main(String[] args) {
        mythread1 m1 = new mythread1();
        mythread2 m2 = new mythread2();
        m1.start();
        m2.start();
    }
}
