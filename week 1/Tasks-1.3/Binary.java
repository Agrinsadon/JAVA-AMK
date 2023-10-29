//Task 2: Binary values
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(i);

            if (bit == '0' || bit == '1') {
                decimal = decimal * 2 + (bit - '0');

            } else {
                System.out.print("Enter a binary number composed of 0s and 1s.");
                scanner.close();
                return;
            }
        }
            System.out.print("Decimal is: " + decimal);
        scanner.close();
    }
}
