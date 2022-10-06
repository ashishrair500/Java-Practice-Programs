class myemployee {
    private int id; // we can not directly access these to access we have to use methods;
    private String name;

    public myemployee() {          //This will invoke automatically and called constructor
        id = 6;                    //we can also add parameter
        name = "this happing because of constructor";
    }
    public myemployee(int a, String g){    //constructor overloading
        id=a;
        name=g;
    }


    public void setid(int r) {
        this.id = r;

    }

    public int getid() {

        return id;
    }

    public void setString(String n) {
        this.name = n;
    }

    public String getString() {

        return name;
    }

}

public class C42Constructor {
    public static void main(String[] args) {
        myemployee e = new myemployee();         //and we pass argument here
        // e.setid(5); // Har line me method ko call karo ye thodi boring sa lag raha
        // hai
        System.out.println(e.getid()); // iss ke liye constructor kam ayenge
        // e.setString("harry");
        System.out.println(e.getString());

        // e.id=7; //this line will through error kyuki ye private hai
        // e.name="harry"; //this line will through error
    } 
}

//just like method overloading we can also overload constructor
