//OrientationTask 1_4: CustomerQueue
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueue {
    public static void main(String[] args) {
        LinkedList<Customer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Quit");

            int choice = getUserChoice(scanner);

            if (choice == 1) {
                Customer newCustomer = createCustomer(customerQueue.size() + 1);
                customerQueue.add(newCustomer);
                System.out.println("Customer " + newCustomer.getId() + " added to the queue.");
            } else if (choice == 2) {
                if (!customerQueue.isEmpty()) {
                    Customer removedCustomer = customerQueue.remove();
                    long timeSpentInQueue = System.nanoTime() - removedCustomer.getStartTime();
                    System.out.println("Customer " + removedCustomer.getId() + " dequeued.");
                    System.out.println("Time spent in the queue: " + timeSpentInQueue + " nanoseconds");
                } else {
                    System.out.println("The queue is empty.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = -1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
        }
        return choice;
    }

    private static Customer createCustomer(int id) {
        long startTime = System.nanoTime();
        long endTime = 0;
        return new Customer(id, startTime, endTime);
    }
}

