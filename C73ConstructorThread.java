//This programme is for naming a thread and provide id a id taki ham 
//hame baad me usko pehchan sake ki kon sa thread hai 

class mythred extends Thread {
    public mythred(String name) {
        super(name);
    }
     public void run(){
     int i=34;
    // while (i<5) {
     System.out.println("Thank You");
     //i++;
     //}
     }
}

public class C73ConstructorThread {
    public static void main(String[] args) {
//Here job1 2 3 will execute in sequential manner as they are in main thread

//If on job1 or 2 3 is taking more time to executed as expect they our app will slow and may be
// mis functioning to this problem thread comes with a great solution 
/*       
// job1
        System.out.println("Application start");
        // job2
        for (int docs = 1; docs <= 10; docs++) {
            System.out.println("Printing documnets " + docs);
        }
        // job3
        System.out.println("Application finished");
        */

        mythred my = new mythred("Hello");
        mythred m = new mythred("Namaste");
        my.start();
        m.start();
        System.out.println("the id of the thread t is " + my.getId());
        System.out.println("the name of the thread t is " + my.getName());
        System.out.println("the id of the thread t is " + m.getId());
        System.out.println("the name of the thread t is " + m.getName());
        
        
    }

}
