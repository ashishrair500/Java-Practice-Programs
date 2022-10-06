
//We can not fully relly on priorities sometimes depends upon opertating system

class mythred1 extends Thread {
    public mythred1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
         while (true) {
        System.out.println("Thank you " + this.getName());
         //i++;
         }
    }
}

public class C74ThreadPriorities {
    public static void main(String[] args) {
        // Ready queue:T1 T2 T3 T4 T5
        mythred1 t1 = new mythred1("Hello");
        mythred1 t2 = new mythred1("Namaste1");
        mythred1 t3 = new mythred1("Namaste2");
        mythred1 t4 = new mythred1("Namaste3");
        mythred1 t5 = new mythred1("Namaste4 (Most important)");
       t5.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
