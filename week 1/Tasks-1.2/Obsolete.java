import java.util.Scanner;
public class Obsolete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weightInGrams = scanner.nextDouble();

        int leiviska = 20;
        int naula = 32;
        double luoti = 13.28;

        int leiviska1 = (int) (weightInGrams / (leiviska * naula * luoti));
        int naula1 = (int) ((weightInGrams % (leiviska * naula * luoti)) / (naula * luoti));
        double luoti1 = ((weightInGrams % (leiviska * naula * luoti)) % (naula * luoti)) / luoti;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                weightInGrams, leiviska1, naula1, luoti1);
    }
}