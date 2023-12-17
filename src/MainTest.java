import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main test = new Main();

    @org.junit.jupiter.api.Test
    void data() {
        String data = "2002-03-01T13:00:00Z";
        OffsetDateTime data2 = OffsetDateTime.parse(data, DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        DateTimeFormatter fullFormat =DateTimeFormatter.ofPattern("EEEE d MMMM yyyy HH:mm:ss 'Coordinated Universal Time'");
        String fullData = data2.format(fullFormat);

        DateTimeFormatter midFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy HH:mm:ss");
        String midData = data2.format(midFormat);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        String shortData = data2.format(shortFormat);

        assertEquals("venerdì 1 marzo 2002 13:00:00 Coordinated Universal Time",fullData);
        assertEquals("1-mar-2002 13:00:00",midData);
        assertEquals("01/03/02 13:00",shortData);
    }
}