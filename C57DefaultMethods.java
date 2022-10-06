





//This code is not working why i dont know

/*



interface camera {
    void takesnap(); // We can not update interface to solve this problem default methods are used

    void recordvedio();

    private void greet() {                        // we can use it directly since it is a private method
        System.out.println("Hellooooo");
    }

    default void record4kvedio() {
        greet();                          //we can use private by taking it inside the default method
        System.out.println("Recording  4k  vedio.....");

    }
}

interface Wifi {
    String[] getNetwork();

    void connectnetwork(String network);
}

class cellphone {
    //void callnumber(int phonenumber) {
    //    System.out.println("calling " + phonenumber);

    

    void pickcall() {
        System.out.println("connecting....");

    }

    public void takesnap() {
        System.out.println("Takin snap");
    }
}

class smartphone extends cellphone implements Wifi, camera {
    public void takesnap() {
        System.out.println("Taking snap");

    }

    public void recordvedio() {
        System.out.println("taking snap");
    }

    public String[] getNetwork() {
        System.out.println("getting list of networks");
        String[] networklist = { "Honey", "Prashant", "Anjali" };
        return networklist;
    }

    public void connectnetwork(String network) {
        System.out.println("connecting to " + network);

    }

}
public class C57DefaultMethods{
   

    public static void main(String[] args) {
        smartphone s=new smartphone();
       //s.callnumber(565656);
        s.recordvedio();
    }
}
    


*/




