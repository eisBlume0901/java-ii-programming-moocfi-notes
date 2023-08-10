package Part10.IntermediateOperations;
import java.util.*;
public class Person
{
   /*
   Stream methods has two categories:
    1. Intermediate operations - transform or filter the elements of a stream, returning a
    new stream as a result (e.g., distinct(), filter(), mapToInt(), sorted())
    2. Terminal operations - produce a final result or side effect, consuming the elements
    of a stream (e.g., count(), collect(), forEach(), reduce())
    */

    // Encapsulate instance variables
    private String firstName;
    private String lastName;
    private int birthYear;

    // Parametrized Constructor
    public Person(String firstName, String lastName, int birthYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Getter
    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getBirthYear()
    {
        return this.birthYear;
    }

    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Emerald", "Greenleaf", 1963));
        persons.add(new Person("Mary Kate", "Anecito", 2001));
        persons.add(new Person("Claire", "Ethereal", 1999));
        persons.add(new Person("Mary Odette", "Anecito", 2003));
        persons.add(new Person("Fevie", "Anecito", 1977));
        // Duplicate, not printed cause of distinct() method
        persons.add(new Person("Emerald", "Greenleaf", 1963));

        // Print the number of persons born before the year 1970
        long count = persons
                .stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();

        System.out.println("Born before year 1970: " + count);

        // Print the number of person's first name starts with the letter M
        long count1 = persons
                .stream()
                .filter(person -> person.getFirstName().startsWith("M"))
                .count();

        System.out.println("First Name starts with M: " + count1);

        // Print the alphabetical order of names in the Person database
        persons
                .stream()
                .map(person -> person.getFirstName())
                .distinct() // returns a stream that only contains unique values
                .sorted() // sort alphabetically
                .forEach(name -> System.out.println(name));



    }
}
