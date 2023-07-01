package junit_examples;

import junit.UhrZeit;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UhrZeitTest {

    @Test
    void testPersonNeededAt16OClock() {
        UhrZeit uhrZeit = new UhrZeit();
        int result = uhrZeit.personsNeeded(LocalDateTime.of(2023,5,13,16,36));
        assertEquals(result, 4);
    }

    @Test
    void testPersonNeededAt3OClock() {
        UhrZeit uhrZeit = new UhrZeit();
        int result = uhrZeit.personsNeeded(LocalDateTime.of(2023,5,13,3,0));
        assertEquals(result, 2);
    }
}
