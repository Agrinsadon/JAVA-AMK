import java.util.Random;
import java.util.Scanner;
public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {"Mohammed", "Agrin", "Adam", "Isam", "Usama", "Hanna"};
        String[] lastNames = {"Sadon", "Sadik", "Jumah", "Silva", "Beckham", "Bolivia"};

        System.out.print("How many random names would you like to generate? ");
        int names = scanner.nextInt();

        if (names <= 0) {
            System.out.println("Enter 1 or more numbers !");
        } else {
            for (int i = 1; i <= names; i++) {
                int firstName = random.nextInt(firstNames.length);
                int lastName = random.nextInt(lastNames.length);

                String fullName = firstNames[firstName] + " " + lastNames[lastName];

                System.out.println("Name " + i + ": " + fullName);
            }
        }
    }
}
