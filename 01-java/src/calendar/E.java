/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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