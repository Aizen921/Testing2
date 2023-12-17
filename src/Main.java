import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args){
        String data = "2002-03-01T13:00:00Z";
        OffsetDateTime data2 = OffsetDateTime.parse(data,DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        System.out.println(data2);

        DateTimeFormatter fullFormat =DateTimeFormatter.ofPattern("EEEE d MMMM yyyy HH:mm:ss 'Coordinated Universal Time'");
        String fullData = data2.format(fullFormat);
        System.out.println(fullData);

        DateTimeFormatter midFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy HH:mm:ss");
        String midData = data2.format(midFormat);
        System.out.println(midData);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        String shortData = data2.format(shortFormat);
        System.out.println(shortData);

    }
}
