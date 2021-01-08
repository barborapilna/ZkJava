/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Date;
import java.util.Iterator;

public class Calendar implements Iterable<E>{

    @Override
    public Iterator<E> iterator() {
        return calendar.iterator();
    }

    private Tree<E> calendar;

    public Calendar() {
        calendar = new Tree<>();
    }

    public void addEv(Event event) {
        E events = new E(event.getDate());
        if (calendar.contaix(events)) {
            events = calendar.get(events);
        } else {
            calendar.add(events);
        }
        
        events.events.add(event);
    }
    
    public void DeleteAll(Date date) {
        calendar.erase(new E(date));
    }
}
