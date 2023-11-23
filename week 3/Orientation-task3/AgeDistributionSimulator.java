import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AgeDistributionSimulator {

    public static void main(String[] args) {
        int[] ageGroups = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Map<Integer, Integer> ageCountMap = new HashMap<>();
        for (int age : ageGroups) {
            ageCountMap.put(age, 0);
        }

        Random random = new Random();
        int numberOfPeople = 100;

        for (int i = 0; i < numberOfPeople; i++) {
            int randomAge = random.nextInt(101);
            int ageGroup = findAgeGroup(randomAge, ageGroups);
            ageCountMap.put(ageGroup, ageCountMap.get(ageGroup) + 1);
        }

        System.out.println("Age Distribution:");
        for (int age : ageGroups) {
            System.out.println(age + " - " + (age + 9) + " : " + ageCountMap.get(age));
        }
    }

    private static int findAgeGroup(int age, int[] ageGroups) {
        for (int i = 0; i < ageGroups.length - 1; i++) {
            if (age >= ageGroups[i] && age < ageGroups[i + 1]) {
                return ageGroups[i];
            }
        }
        return ageGroups[ageGroups.length - 1];
    }
}
