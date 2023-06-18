import java.util.Collections;
import java.util.LinkedList;

public class GENERICCOLLECTIONS {

        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();

            // Insert 25 random integers from 0 to 100
            for (int i = 0; i < 25; i++) {
                int random = (int) (Math.random() * 101);
                numbers.add(random);
            }

            // Sort the elements
            Collections.sort(numbers);

            // Calculate the sum of the elements
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            // Calculate the floating-point average of the elements
            double average = (double) sum / numbers.size();

            // Output the unsorted list, sorted list, sum, and average
            System.out.println("Unsorted List: " + numbers);
            System.out.println("Sorted List: " + numbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
