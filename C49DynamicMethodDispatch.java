import java.net.SocketTimeoutException;
import java.util.jar.Attributes.Name;

class phone{
    public void on(){
        System.out.println("Phone on");
    }
public void Showtime(){
    System.out.println("Time is 7:44 Am");
}

}
class smartphone extends phone{

    public void music() {
        System.out.println("music on");
            
    }
    @Override
    public void on(){

      
        System.out.println("Smartphone on");
    }

}
public class C49DynamicMethodDispatch {
    public static void main(String[] args) {
        //phone obj= new phone();
        //smartphone obj2=new smartphone();
        //
        //obj.name();


        //reference   //object
        phone obj  =  new smartphone();        //Allowed
        
       // smartphone obj2=new phone();      This is not allowed
       obj.on();
       // obj.music();     Not allowed 
    }
    
}
