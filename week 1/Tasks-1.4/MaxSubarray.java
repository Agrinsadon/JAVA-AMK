import java.util.Scanner;
public class MaxSubarray {
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

        int max = Integer.MAX_VALUE;
        int current = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < size; i++) {
            current += array[i];

            if (current > max) {
                max = current;
                start = tempStart;
                end = i;
            }

            if (current < 0) {
                current = 0;
                tempStart = i + 1;
            }
        }
        start++;
        end++;
        System.out.println("\nMax sum: " + max);
        System.out.println("Integers: " + start + "-" + end);
    }
}
