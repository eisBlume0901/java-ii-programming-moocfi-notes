package Part10.StreamMethods;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Stream methods categories
        1. Intermediate operations - transform or filter the elements of a stream, returning a
        new stream as a result
        2. Terminal operations - produce a final result or side effect, consuming the elements
        of a stream (e.g., count(), collect(), forEach(), reduce())
         */

        List<Integer> list = Arrays.asList(3, 7, 4, 2, 6);

        List<Integer> values = list
                .stream()
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .collect(Collectors.toList());

        System.out.println(values); // [14, 12]
    }
}
