public class C27Array {
    public static void main(String[] args) {
        int[] marks = { 100, 99, 90, 99, 98, 98 };
        // float[] mark = { 10, 19, 4, 4.0f, 5 };
        // String[] mar = { "h", "r", "f" };
        // char[] ma={'a','b'};
        // System.out.println(mark.length);
        System.out.println(marks.length); // to find length of array
        // to display array first method
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // System.out.println(marks[5]);
        // display array why using for loop

        /*
         * int i = 0;
         * while (i <marks.lenght) {
         * System.out.println(marks[i]); // array transversal
         * i++;
         * }
         */

        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        // For each loop introduced in new version of java to display elements of array
        for (int elements : marks) {
            System.out.println(elements);
        }

    }
}
