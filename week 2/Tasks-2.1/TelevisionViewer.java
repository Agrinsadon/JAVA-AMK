class Television {
    private int currentChannel;
    public Television() {
        currentChannel = 1;
    }
    public void turnOn(int day) {
        System.out.println("Woke up, day " + day);
    }

    public void watch(int numTimes) {
        for (int i = 1; i <= numTimes; i++) {
            System.out.println("Watching channel " + currentChannel);
            currentChannel = (currentChannel % 10) + 1;
        }
    }
    public void turnOff() {
        System.out.println("Falling asleep");
    }
}

public class TelevisionViewer {
    public static void main(String[] args) {
        Television news = new Television();

        for (int day = 1; day <= 10; day++) {
            news.turnOn(day);

            if (day == 1) {
                news.watch(3);
            }
            else if (day % 2 == 0) {
                news.watch(4);
            }
            else {
                news.watch(6);
            }

            news.turnOff();
        }
    }
}
