package Part10.HandlingCollectionsAsStreams;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        // Initialize the scanner and the list into which
        // the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // Reading inputs
        while (true)
        {
            String row = scanner.nextLine();

            if (row.equals("end"))
            {
                break;
            }

            inputs.add(row);
        }

        // Counting the number of values divisible by three
        long numbersDivisibleByThree = inputs
                .stream() // implements the Collection interface
                .mapToInt(s -> Integer.valueOf(s))
                /* map = mapping or transformation in discrete mathematics -
                function maps or transforms elements from one set (domain)
                to another set (range) based on a specific rule or operation.

                .map() - perform a one-to-one mapping or transformation
                of each element in the stream.

                .mapToInt() - converting elements to integers
                 */
                .filter(number -> number % 3 == 0)
                .count();

        // Average of inputs
        double average = inputs
                .stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);


    }
}
