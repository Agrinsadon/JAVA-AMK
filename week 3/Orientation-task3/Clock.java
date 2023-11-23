public class Clock {
    private static Clock instance;
    private long currentTime;

    private Clock() {
        currentTime = System.currentTimeMillis();
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setTime(long newTime) {
        currentTime = newTime;
    }

    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Initial Time: " + clock.getCurrentTime());

        long newTime = System.currentTimeMillis() + 1000;
        clock.setTime(newTime);

        System.out.println("Updated Time: " + clock.getCurrentTime());

        Clock anotherClock = Clock.getInstance();
        System.out.println("Are both instances the same? " + (clock == anotherClock));
    }
}
