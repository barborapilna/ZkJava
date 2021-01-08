package event;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Event implements Comparable<Event>, Serializable {

    private Date date;
    private String title;

    public Date getDate() {
        return date;
    }

    @Override
    public int compareTo(Event element) {
        return date.compareTo(element.date);
    }

    public Event(Date date, String title) {
        this.date = date;
        this.title = title;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Event other = (Event) object;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.date);
        return hash;
    }
    @Override
    public String toString() {
        return "Event{" + "date=" + date + ", title=" + title + '}';
    }
}
