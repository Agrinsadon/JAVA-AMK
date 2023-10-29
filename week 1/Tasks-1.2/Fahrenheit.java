//Task 1: Fahrenheit to Celsius Converter
import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celsius = ((fahrenheit - 32) * 5) / 9;

        String formattedCelsius = String.format("%.1f", celsius);

        System.out.println("The temperature in Celsius is: " + formattedCelsius + " Celsius");
    }
}
