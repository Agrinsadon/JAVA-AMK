//Task 3: Prime number generator
import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two positive integers (where first < second)");

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        if (first < 2 || second <= first) {
            System.out.println("Invalid input.");
        }
        System.out.println("Prime numbers between " + first + " and " + second + ": ");

        for (int x = first; x <= second; x++) {
            boolean prime = true;
            for (int i = 2; i <= x - 1; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(x + " ");
            }
        }
    }
}