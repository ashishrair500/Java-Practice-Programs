public class C31MethodOverloading {
static void foo(){
    System.out.println("heloooooooooooo");
}
static void foo(int a){
    System.out.println("Good morning"+a);
}
static void foo(int b ,int a){
    System.out.println("heloo "+b+" "+a);

}
public static void main(String[] args) {
    foo();
    
    
    foo(300);
    foo(30,  40);
}   //In method overloading if we apply return type then its does't work
    
}
