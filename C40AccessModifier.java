class my_employee{
private int id;           //we can not directly access these to access we  have to use methods;
private String name;
public void setid(int r){
    id=r;
    

} 
public int getid(){
    System.out.println(id);
    return id;
}
public void setString( String n){
    name=n;
}
public String getString(){
    System.out.println(name);
    return name;
}





}


public class  C40AccessModifier {
    public static void main(String[] args) {
        my_employee e=new my_employee();
        e.setid(5);
        e.getid();
        e.setString("harry");
        e.getString();

      //  e.id=7;            //this line will through error
      //   e.name="harry";  //this line will through error
    }
}
