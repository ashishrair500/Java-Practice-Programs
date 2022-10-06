 class Employee {
    int id;  
    int salary;
    String name;
    String profession;
    public void my(){
        System.out.println("my id is"+id );
        System.out.println("and name is"+name);
    }
    public int getsalary(){
        
        return salary;
    }
    public void getdetails(){
        System.out.println("I am  a "+profession);
    }
}


public class C38CustomClass {
   // int id;  
   // String name;
   // public void my(){
   //     System.out.println("my id is"+id );
   //     System.out.println("and name is"+name); }
    
    public static void main(String[] args) {
        System.out.println("This is our custom class");  
    
        Employee harry= new Employee();
        Employee john= new Employee();
        john.id=34; 
        john.salary=3400;  //Instantiating a new employee object // Ye upar bali class ke liye object ban gya hai
        john.name="harry";
        
        harry.id=6;                      //setting attributes
        harry.name="codewithharry ";  
        harry.profession="IAS"   ; 
        harry.my();
        john.my(); 
        int salary=john.getsalary();
         System.out.println(salary); 
         harry.getdetails();
    }

}
   