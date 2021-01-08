import java.util.Date;
import java.util.List;

import calendar.Calendar;
import event.E;
import event.Event;
import persistence.Storage;

public class Main {

    public static void main(String[] args) {
        /* TODO:
         0) vytvořit git repozitář a COMMITovat každou dílčí ucelenou změnu!
         1) vyčistit kód (clean code)
         2) unit testy
         ---- je nutné důkladně otestovat binární strom
         ---- přidání do prázdného, neprázdného stromu (levá/pravá větev)
         ---- mazání - kořene, listu, vnitřních prvků
         ---- iterování přes prázdný/plný strom
         ---- testy kalendáře, skupiny událostí
         3) celý repozitář odevzdat na stag - semestrální práce
         */

        Storage storage = new Storage();
        storage.store(new Event(new Date(117, 6, 1), "1-4"));
        storage.store(new Event(new Date(117, 7, 1), "1-4"));
        storage.unstore(new Event(new Date(117, 6, 1), "1-4"));

        List<Event> eventList = storage.load(Event.class);
        System.out.println(eventList);
        System.out.println("");

        Calendar calendar = new Calendar();
        calendar.addEv(new Event(new Date(117, 6, 1), "1-1"));
        calendar.addEv(new Event(new Date(117, 6, 2), "2-1"));
        calendar.addEv(new Event(new Date(117, 6, 3), "3-1"));
        calendar.addEv(new Event(new Date(117, 6, 1), "1-2"));
        calendar.addEv(new Event(new Date(117, 6, 1), "1-3"));
        calendar.addEv(new Event(new Date(117, 6, 1), "1-4"));

        for (E element : calendar) {
            System.out.println(element.date);
            System.out.println(element.events);
        }

        calendar.DeleteAll(new Date(117, 6, 1));
        System.out.println("");

        for (E element : calendar) {
            System.out.println(element.date);
            System.out.println(element.events);
        }
    }
}
