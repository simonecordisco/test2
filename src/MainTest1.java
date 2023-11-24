import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {

    @Test
    void shortTest() {

            OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
            assertEquals("01/03/02",Main.shortTest(offsetDateTime));
        }
    @Test
    void mediumTest() {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        assertEquals("1 mar 2002",Main.mediumTest(offsetDateTime));
        }
    @Test
    void longTest() {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        assertEquals("1 marzo 2002",Main.longTest(offsetDateTime));

    }
    }
