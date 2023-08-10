package Part10.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        // .count()
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        System.out.println("Values: " + values.stream().count());

        // .forEach()
        List<Integer> values1 = new ArrayList<>();
        values1.add(3);
        values1.add(2);
        values1.add(17);
        values1.add(6);
        values1.add(8);

        values1.stream()
                .filter(value1 -> value1 % 2 == 0)
                .forEach(value1 -> System.out.println(value1));
        /*
                2
                6
                8
         */

        List<Integer> values2 = new ArrayList<>();
        values2.add(3);
        values2.add(2);
        values2.add(-17);
        values2.add(-6);
        values2.add(8);

        ArrayList<Integer> positives = values2.stream()
                .filter(value2 -> value2 > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        positives.stream()
                .forEach(value2 -> System.out.println(value2));

        /*
            3
            2
            8
         */

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        long howManyNumbers = numbers.stream()
                .filter(i -> i < 4)
                .map(i -> i * 2)
                .filter(i -> i > 10)
                .count();

        System.out.println("Numbers: " + howManyNumbers);

        // .collect()
        // .collect(Collectors.toList())
        // .collect(collectors.toCollection(ArrayList::new)) - can be used for returning ArrayLists
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(2);
        numbers1.add(-17);
        numbers1.add(-5);
        numbers1.add(7);

        ArrayList<Integer> divisible = divisible(numbers1);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));

        // .reduce() - action of reducing a list or collection of elements to a single value
        // by applying a specified operation

        // Using method reference
        List<Integer> numbers2 = List.of(4, 2, 9, 5, 1);

        Optional<Integer> max = numbers2.stream()
                .reduce(Integer::max);

        max.ifPresent(result -> System.out.println("Maximum value: " + result)); // 9


        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5);


        // Can use .sum() too!
        int sum = numbers3.stream()
                .reduce(0, (a, b) -> a + b); // Syntax

        System.out.println("Sum: " + sum); // 15


        List<Integer> numbers4 = List.of(4, 2, 9, 5, 1);

        Optional<Integer> min = numbers4.stream()
                .reduce((a, b) -> a < b ? a : b);

        min.ifPresent(result -> System.out.println("Minimum value: " + result)); // 1

        List<String> strings = List.of("Hello", " ", "World", "!");

        String joined = strings.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Joined String: " + joined); // Hello World!


    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers)
    {
        return numbers
                .stream()
                .filter(n -> (n % 2 == 0 || n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
