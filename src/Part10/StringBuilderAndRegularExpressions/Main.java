package Part10.StringBuilderAndRegularExpressions;

import java.util.*;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder numbers = new StringBuilder();
        List<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");
        for (int i = 0; i < words.size(); i++)
        {
            numbers.append(words.get(i));
        }
        out.println(numbers.toString());
        out.println(numbers.reverse());

        out.println();
        out.println("Provide a student number: ");
        Scanner scanner = new Scanner(System.in);
        String studentNumber = scanner.nextLine();
        /*
        Correct format:
        01:2458763
        010000001
        019999999
         */

        if (studentNumber.matches("01:[0-9]{7}"))
            out.println("Correct format");
        else
            out.println("Incorrect format");

        /*
        01 means a number should begin with "01"
        [0-9] means that it is followed by numbers between 0 and 9
        {7} means it should be only 7 digits between 0 and 9
         */

        out.println();
        out.println("Enter series of 0's or 1's or both");
        String binary = scanner.nextLine();
        /*
        Accepted values:
        00
        11
        0000
         */

        if (binary.matches("00|11|0000"))
            out.println("The string contains one of the three alternatives");
        else
            out.println("The string contained none of the alternatives");

        out.println();
        out.println("Repeating character");
        String quantifier = "trolololololo";
        out.println(quantifier);

        if (quantifier.matches("trolo(lo)*"))
            out.println("Correct form");
        else
            out.println("Incorrect form");

        /*
        Quantifiers
        * (Zero or more quantifier)- repeats 0 or more recurrences
        Example: a* would match empty string, a, aa, aaa, and so on
        + (One or more quantifier) - repeats 1 or more recurrences
        Example: a+ would match a, aa, aaa, and so on
        {a} (Exact quantifier) - repeats a times
        Example: a{3} would match aaa only
        {a,} (At least quantifier) - matches n or more occurrences of the preceding pattern
        Example: a{2,} would match aa, aaa, aaaa, and so on
        {a, b} (Range quantifier) - repeats a - b times (a range)
        Example: a{2, 4} would match aa, aaa, or aaaa, but not a or aaaaa
         */

        out.println();
        String quantifier2 = "nananananana Banana";
        out.println(quantifier2);

        if (quantifier2.matches("(na)+ Banana"))
            out.println("Correct form");
        else
            out.println("Incorrect form");

        out.println();
        String quantifier3 = "1010";
        out.println(quantifier3);

        if (quantifier3.matches("(10){2}"))
            out.println("There are two 10's consecutively");
        else
            out.println("There is no two 10's consecutively");

        out.println();
        String quantifier4 = "1111";
        out.println(quantifier4);

        if (quantifier4.matches("1{2,4}"))
            out.println("There is two 1's and four 1's");
        else
            out.println("There is no two 1's and four 1's");

        out.println();
        String quantifier5 = "11111";
        out.println(quantifier5);

        if (quantifier5.matches("1{2,}"))
            out.println("There is two 1's in the string. It means that 11 is existing (11,11,1)");
        else
            out.println("There is no two 1's in the string");

        out.println();
        String quantifier6 = "5550101010555";

        if (quantifier6.matches("5{3}(1|0)*5{3}"))
            out.println("It begins with three 5's and followed by series of 0's or/and 1's then end with" +
                    "three 5's");
        /*

         */
        else
            out.println("It does not begin with three 5's, followed by series of 0's or/and 1's, and does" +
                    "not end with three 5's");


        out.println();
        out.println("Time");
        String time1 = scanner.nextLine();

        if (time1.matches("(([01][0-9])|2[0-3]):([0-5][0-9]):([0-5][0-9])"))
            out.println("Correct time format");
        /*
        can also be:
        "(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])"

        | - acts as a logical or
        The regex read the string per character that is why instead of
        0-23:0-59:0-59
        It has to be converted to
        01[0-9]|2[0-3] -> 01-19 or 20-23 = 00-23
        [0-5][0-9] -> 0-5 and 0-9 = 00-59
        [0-5][0-9] -> 0-5 and 0-9 = 00-59
         */
    }
}
