class NegativeRadiusException extends Exception {
    public String getmessage() {
        return "radius cannot be negative";
    }

    public String toString() {
        return "Redius can not be negative";
    }
}//ye class banayi taki isse  ham exception ki jagah pr kya print karvana hai bo print ho jayega
//lekin try ke ander iss class ka object banana padega;

public class C84ThrowAndThrows {

    public static double area(int r) throws NegativeRadiusException {   //ye throws isliye taki iss method ko use karne balo ko pehle hi pta ho ki
                    //ye is type ki exception ko through kr sakta hai

        if (r < 0) {
            throw new NegativeRadiusException();       
        }
    double result = Math.PI * r * r;
        return result;

    }

    /*public static int divide(int a, int b) throws ArithmeticException {
        // made by Hari
        int result = a / b;
        return result;
    }*/

    public static void main(String[] args) {
        // Shivam uses divide function created by Hari
        // int c = divide(6, 0); // kyu be hello kitna ghatiya programm likh hai chal hi
        // nhi raha

        // try {
        // int c = divide(6, 0);
        // System.out.println(c);
        //
        // } catch (Exception e) {
        // System.out.println("exception" + e);
        // // TODO: handle exception
        // }
      
      
      
        try {
        double ar = area(-1);
            System.out.println(ar);
        } catch (Exception e) {

            System.out.println(e);

        }

    }
}
