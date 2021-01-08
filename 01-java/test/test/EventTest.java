package test;

import event.Event;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void compareTo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String date = "02-04-2013 11:35:42";
        Date newDate = new Date();
        try {
            newDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Event firstEvent = new Event(newDate, "1-4");
        Event secondEvent = new Event(newDate, "1-4");

        assertEquals(firstEvent, secondEvent);
    }

    @Test
    public void testEqualsSame() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String date = "02-04-2013 11:35:42";
        Date newDate = new Date();
        try {
            newDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Event firstEvent = new Event(newDate, "1-4");
        Event secondEvent = new Event(newDate, "1-4");

        assertEquals(firstEvent, secondEvent);
    }

    @Test
    public void testEqualsNotSame() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String firstDate = "02-04-2013 11:35:42";
        String secondDate = "02-04-2015 01:35:42";
        Date firstNewDate = new Date();
        Date secondNewDate = new Date();
        try {
            firstNewDate = dateFormat.parse(firstDate);
            secondNewDate = dateFormat.parse(secondDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Event firstEvent = new Event(firstNewDate, "1-4");
        Event secondEvent = new Event(secondNewDate, "1-4");

        assertNotEquals(firstEvent, secondEvent);
    }
}