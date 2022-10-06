import javax.swing.text.FlowView.FlowStrategy;

public class C27MultidimensionalArray {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 34;
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 99;
        flats[0][1] = 98;  
        flats[0][2] = 97;
        flats[1][0] = 96;
        flats[1][1] = 94;
        flats[1][2] = 95;

 // This is method to print 2-D array 
 //If we want to print 3-D array then we have 3 nested loops  
for (int i = 0; i < flats.length; i++) {
   for (int j = 0; j < flats[i].length; j++) {
    System.out.print(flats);
    System.out.print(" ");
   }
   System.out.println("");
}

                       //accesing method
    }
}
