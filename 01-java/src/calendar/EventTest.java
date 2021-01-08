package calendar;

import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void getDate() {
    }

    @Test
    public void compareTo() {
        Event firstEvent = new Event(new Date(117, 6, 1), "1-4");
        Event secondEvent = new Event(new Date(117, 6, 1), "1-4");

        assertEquals(firstEvent, secondEvent);
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
    }
}