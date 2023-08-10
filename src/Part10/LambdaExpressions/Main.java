package Part10.LambdaExpressions;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Lambda Expression - shorthand
        A lambda expression is a concise way to represent an
        anonymous function or behavior that can be passed around as a value.

        anonymous function
        - does not need a named function declaration
        - use inline or as a parameter to other functions or methods
        - defined without a specific name
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> greaterThan5 = new ArrayList<>();

        // Version 1
        greaterThan5 = list
                .stream()
                .filter(value -> value > 5)
                .collect(Collectors.toList());

        System.out.println(greaterThan5);

        // Version 2
        greaterThan5 = list
                .stream()
                .filter((Integer value) ->
                {
                    if (value > 5)
                    {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());

        System.out.println(greaterThan5);

        // Version 3
        greaterThan5 = list
                .stream()
                .filter(Screeners::greaterThanFive)
                .collect(Collectors.toList());

        System.out.println(greaterThan5);

        // Global variables that are not final cannot be used inside an anonymous function

        // initializing a scanner and a list to which values are read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

//        int numberOfMappedValues = 0; // Cause of error
        final int[] numberOfMappedvalues = {0};

        // determining the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> {
                    // variables declared outside of an anonymous function cannot be used, so this won't work
                    numberOfMappedvalues[0]++;
//                    numberOfMappedValues++; // Cause of error
                    // Error would be: Variables used in lambda expression should be final or effectively final
                    return Integer.valueOf(s);
                }).filter(value -> value % 3 == 0)
                .count();

        System.out.println("Count of numbers divisible by 3: " + numbersDivisibleByThree);
    }
}

class Screeners
{
    public static boolean greaterThanFive(int value)
    {
        return value > 5;
    }
}
