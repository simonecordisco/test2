
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);
        shortTest(offsetDateTime);
        mediumTest(offsetDateTime);
        longTest(offsetDateTime);
    }

    public static String shortTest(OffsetDateTime dateString) {
     String shortstring = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(shortstring);
               return shortstring;

    }
    public static String mediumTest(OffsetDateTime dateString){
        String mediumstring = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(mediumstring);
        return mediumstring;
    } 
    public static String longTest(OffsetDateTime dateString) {
        String longstring = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(longstring);
        return longstring;
    }
}

