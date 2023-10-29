import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers you want in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the integers into the array!");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        ArrayList<Integer> elements = new ArrayList<>();

        for (int number : array) {
            if (!elements.contains(number)) {
                elements.add(number);
            }
        }

        int[] fixedArray = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            fixedArray[i] = elements.get(i);
        }

        System.out.println("\nArray without duplicates:");
        for (int number : fixedArray) {
            System.out.print(number + " ");
        }
    }
}