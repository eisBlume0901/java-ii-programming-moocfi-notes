package Part10.TheComparableInterface.SortingMethodAsALambdaExpression;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", 1815));
        persons.add(new Person("Irma Wyman", 1928));
        persons.add(new Person("Grace Hooper", 1906));
        persons.add(new Person("Mary Coombs", 1929));

        System.out.println("Unsorted");
        for (Person p : persons)
            System.out.println(p.getName());

        System.out.println();

        System.out.println("Sorted Alphabetically from A to Z");
        persons
                .stream()
                .sorted((p1, p2) ->
                {
                    return p1.getName().compareTo(p2.getName());
                })
                .forEach(p -> System.out.println(p.getName()));
    }
}
