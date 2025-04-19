import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumberAnalysisTest {

    @Test
    public void testRandomNumbersGeneration() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            assertTrue(num >= 1 && num <= 100, "Number should be between 1 and 100");
            numbers.add(num);
        }
        assertEquals(20, numbers.size(), "List should contain 20 elements");
    }

    @Test
    public void testMinMaxAverage() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20, 30, 40, 50);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        assertEquals(10, min, "Minimum value should be 10");
        assertEquals(50, max, "Maximum value should be 50");
        assertEquals(30.0, average, 0.001, "Average value should be 30.0");
    }

    @Test
    public void testRemoveEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);
        numbers.removeIf(n -> n % 2 == 0);
        assertFalse(numbers.contains(2), "List should not contain number 2");
        assertFalse(numbers.contains(4), "List should not contain number 4");
        assertFalse(numbers.contains(6), "List should not contain number 6");
        assertEquals(3, numbers.size(), "List should contain 3 elements");
    }

    @Test
    public void testContainsNumber() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20, 30, 40, 50);
        assertTrue(numbers.contains(50), "List should contain number 50");
        assertFalse(numbers.contains(60), "List should not contain number 60");
    }

    @Test
    public void testSorting() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 50, 20, 40, 10, 30);
        Collections.sort(numbers);
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 10, 20, 30, 40, 50);
        assertEquals(expected, numbers, "List should be sorted in ascending order");
    }
}
