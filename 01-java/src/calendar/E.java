package calendar;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class E implements Comparable<E> {
    public Date date;
    public Set<Event> events;

    public E(Date date) {
        this.date = date;
        this.events = new HashSet<>();
    }

    @Override
    public int compareTo(E element) {
        return date.compareTo(element.date);
    }
}