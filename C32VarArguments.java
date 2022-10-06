public class C32VarArguments {

   /* static int sum(int a, int b){
        return a=b;
    }
    static int sum (int a, int b, int c){
        return a+b+c;

    }
    static int sum (int a ,int b, int c,int d )
    {
        return a+b+c+d;
    }*/
    // essa kab tak karoge bhai 
    //Esse achcha jitne ka sum karna hain unko array mein dal do or loop se add kr do
    static int sum (int... z){        // three dots is imp    // yaha pr ek argument bhi den sakte hai  iske sath
        int result=0;
        int count=0;
       // Available as int [] arr;

       for (int r : z) {
           result+=r;
           count++;
       } return result/count;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the my code "+ sum(2, 4));
        System.out.println("Welcome to the my code "+ sum(2, 4,6));
        System.out.println("Welcome to the my code "+ sum(2, 4,5,7));
        System.out.println("Welcome to the my code "+ sum(2, 4,5,7,8));
    }
    
}
