package EventManagement;
public class Main {
    public static void main(String[] args) {
        Event arrivalEvent = new Event(EventType.ARRIVAL, 100);
        Event exitEvent = new Event(EventType.EXIT, 200);

        System.out.println("Arrival Event Type: " + arrivalEvent.getType());
        System.out.println("Exit Event Type: " + exitEvent.getType());
    }
}
