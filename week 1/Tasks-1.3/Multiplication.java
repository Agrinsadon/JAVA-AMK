import java.util.Random;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;

        while (total < 10) {
            int number1 = random.nextInt(10) + 1;
            int number2 = random.nextInt(10) + 1;
            int answer = number1 * number2;

            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("Correct good job!");
                total++;
            } else {
                System.out.println("Incorrect! The correct answer is " + answer);
            }
        }
        System.out.println("Congratulations you've mastered the multiplication tables & terminates !");
    }
}
