package EventManagement;

public class Event {
    private EventType type;
    private int time;

    public Event(EventType type, int time) {
        this.type = type;
        this.time = time;
    }

    public EventType getType() {
        return type;
    }

    public int getTime() {
        return time;
    }
}
