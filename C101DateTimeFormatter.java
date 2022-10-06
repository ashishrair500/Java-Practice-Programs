import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.xml.sax.DTDHandler;

public class C101DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

DateTimeFormatter df= DateTimeFormatter.ofPattern("DD-MM-YYYY|h-m-s");
String myDate = dt.format(df);
System.out.println(myDate);
//System.out.println(df);

    }
}
