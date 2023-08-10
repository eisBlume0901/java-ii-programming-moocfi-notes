package Part10.TheComparableInterface;
import java.util.*;
import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Member> member = new ArrayList<>();

        member.add(new Member("Mary Kate", 160));
        member.add(new Member("Mary Odette", 155));
        member.add(new Member("Fevie", 152));

        out.println("List of Members");
        member
                .stream()
                .forEach(out::println);

        out.println();

        out.println("List of Members using .sorted()");
        member
                .stream()
                .sorted()
                .forEach(out::println);

        out.println();

        out.println("List of Members using Collection class");
        Collections.sort(member);
        member
                .stream()
                .forEach(out::println);

        /*
        Negative: The first value is less than the second value.
        Zero: The first value is equal to the second value.
        Positive: The first value is greater than the second value.
         */
        int a = 5;
        int b = 10;

        int result = a - b;

        if (result < 0) {
            System.out.println("a is less than b");
        } else if (result == 0) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is greater than b");
        }

    }
}
