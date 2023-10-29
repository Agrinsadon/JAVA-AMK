//OrientationTask 1_3: Customer
public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    public Customer(int id, long startTime, long endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, System.currentTimeMillis(), System.currentTimeMillis() + 10000); // 10 seconds
        Customer customer2 = new Customer(2, System.currentTimeMillis(), System.currentTimeMillis() + 5000);  // 5 seconds

        System.out.println("Customer " + customer1.getId() + " spent " + customer1.getTimeSpent() + " milliseconds.");
        System.out.println("Customer " + customer2.getId() + " spent " + customer2.getTimeSpent() + " milliseconds.");
    }
}
