import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumberAnalysis {
    public static void main(String[] args) {
        // 1. Create a list and fill it with random numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100) + 1); // Random number from 1 to 100
        }

        // 2. Print all elements of the list
        System.out.println("List of numbers: " + numbers);

        // 3. Find the minimum and maximum values
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // 4. Calculate the average value
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();
        System.out.println("Average value: " + average);

        // 5. Remove all even numbers
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("List after removing even numbers: " + numbers);

        // 6. Check if the list contains the number 50
        boolean contains50 = numbers.contains(50);
        System.out.println("Does the list contain the number 50? " + contains50);

        // 7. Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
