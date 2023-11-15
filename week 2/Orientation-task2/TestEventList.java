import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    private String name;
    private long time;

    public Event(String name, long time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Time: " + time;
    }
}

class EventList {
    private PriorityQueue<Event> events = new PriorityQueue<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.poll();
    }

    public void printEvents() {
        events.forEach(System.out::println);
    }
}

public class TestEventList {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event("Event1", 500));
        eventList.addEvent(new Event("Event2", 300));
        eventList.addEvent(new Event("Event3", 700));

        Event firstEvent = eventList.getNextEvent();
        System.out.println("Removed " + firstEvent);

        System.out.println("Remaining Events:");
        eventList.printEvents();
    }
}
