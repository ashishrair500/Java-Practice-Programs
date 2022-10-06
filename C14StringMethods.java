import javax.sound.sampled.SourceDataLine;


public class C14StringMethods {
    public static void main(String[] args) {

        // string are immutables;
        String name = "Harry"; // indexing of this string will start from 0
        int str = name.length();
        System.out.println(str);

        String sttr = name.toUpperCase();
        System.out.println(sttr);

        String stttr = name.toLowerCase();
        System.out.println(stttr);

        // trimming of string
        String NTS = "    harry   ";
        System.out.println(NTS);
        String trimmedString = NTS.trim();
        System.out.println(trimmedString);

        // indexing
        System.out.println(name.substring(1));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace('r', 'p')); // used to replace alphabet
        System.out.println(name.replace("rr", "ps"));

        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("pp"));

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("rry")); // r at first index at 2
        System.out.println(name.indexOf("r", 3)); // start searching from index 3
        System.out.println(name.lastIndexOf("r"));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harrY"));   //this will ingnore upper as well as lower case and return true;

//escape sequence character;
        System.out.println("i am \n a \t space \\ sequence \" character");

    }
}
