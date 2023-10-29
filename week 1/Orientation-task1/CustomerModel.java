//OrientationTask 1_5-6

import java.util.LinkedList;
class CustomerModel {
    private int id;
    private long startTime;
    private long endTime;

    public CustomerModel(int id, long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}

class ServicePoint {
    private LinkedList<CustomerModel> queue = new LinkedList<>();
    private LinkedList<Long> serviceTimes = new LinkedList<>(); // Store service times

    public void addToQueue(CustomerModel customer) {
        queue.add(customer);
    }

    public CustomerModel removeFromQueue() {
        return queue.poll();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            CustomerModel customer = removeFromQueue();
            long serviceTime = (long) (Math.random() * 2000) + 1000; // Simulated service time between 1-3 seconds
            customer.setEndTime(System.currentTimeMillis() + serviceTime);
            serviceTimes.add(serviceTime); // Store service time
            System.out.println("Customer " + customer.getId() + " served. Service time: " + serviceTime + " milliseconds.");
        }
    }

    public double getAverageServiceTime() {
        if (serviceTimes.isEmpty()) {
            return 0.0; // Avoid division by zero
        }

        long totalServiceTime = 0;
        for (long time : serviceTimes) {
            totalServiceTime += time;
        }
        return (double) totalServiceTime / serviceTimes.size();
    }
}

class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numCustomers) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= numCustomers; i++) {
            servicePoint.addToQueue(new CustomerModel(i, startTime));
        }
    }
}

class ServiceSystemSimulation {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numCustomers = 5; // Number of customers to generate

        CustomerGenerator.generateCustomers(servicePoint, numCustomers);
        servicePoint.serve();

        double averageServiceTime = servicePoint.getAverageServiceTime();
        System.out.println("Average Service Time: " + averageServiceTime + " milliseconds");
    }
}
