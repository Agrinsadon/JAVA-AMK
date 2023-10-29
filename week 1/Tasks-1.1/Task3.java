//Task3: Task 3
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        float avg = (first + second + third);

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("Number of the product is " + (first * second * third));
        System.out.println("The average number is " + ((avg) / 3));
    }
}