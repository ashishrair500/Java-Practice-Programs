class mythred2 extends Thread {
   
@Override
    public void run() {
        int i=0;
         while (true) {
        System.out.println("my  Thank you " + this.getName());
         i++;
         }
    }
}
class mythred3 extends Thread {
  @Override
    public void run() {
        int i = 0;
         while (true) {
             try {
                 Thread.sleep(455);   //455 milisecond ke liye band kr diya hai
             } catch (InterruptedException e) {
                 //TODO: handle exception
                 e.printStackTrace();
             }
        System.out.println("Thank you ");
         i++; 
         }
    }
}

public class C75ThreadMethods {

    public static void main(String[] args) {
       mythred2 t1=new mythred2();
       mythred3 t2=new mythred3();
       t1.start(); 
       /*
       try {
        t1.join();          //Is method ki help se jab tak t1 khatm nhi hoga tab tak t2 start nhi hoga

       } catch (Exception e) {
           System.out.println(e);
       }   */

       t2.start();

        
    }
    
}
