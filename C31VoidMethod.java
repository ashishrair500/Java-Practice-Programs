public class C31VoidMethod {

    // public static void telljock(){
    // System.out.println("I invented a new word!\nPlagiarism");
    static void change(int a){
        int x = 34;     
    }
   
    static void change2(int[] arr){       
        arr[0]=98;
    }
        /*public static int fact(int r ,int p) {
            int s;
            s=r%p;
         return s;   */
        

    

    

    public static void main(String[] args) {
        // telljock();
        
        //case:1 Changing the interger
        
        /*int x = 45;
        change(x);
        System.out.println("changing the value of the x ="+x); */
        
        
        /*int q=5;
        int t=4;
        int p1;
        p1=fact(q, t);
        System.out.println(p1);*/
        //Case:2 changing the array and it will change kyuki marks ka
        //reference pass kiya hai object ki copy change nhi ki hai 
        int[] marks = { 1, 2, 3, 4 };
        change2(marks);

System.out.println(marks[0]);
    }

}
