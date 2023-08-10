package Part9.ObjectPolymorphism;

import java.io.Serializable;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String a = "I am a string";
        Object b = "I am an object but can be a string!";

        Object c = a;
        System.out.println(c); // I am a string

//        String d = b; // Does not work and needs to cast since Object is higher than String
        // The String class inherits the Object class. String objects are always type Object.
        // The Object class does not inherit a String class.

        Printer printer = new Printer();

        String string = " o ";
        List<String> oopTopics = new ArrayList<>();
        oopTopics.add("polymorphism");
        oopTopics.add("inheritance");
        oopTopics.add("encapsulation");
        oopTopics.add("abstraction");

        printer.printManyTimes(string, 3);
        /*
         o
         o
         o
         */
        printer.printManyTimes(oopTopics, 2);
        /*
        [polymorphism, inheritance, encapsulation, abstraction]
        [polymorphism, inheritance, encapsulation, abstraction]
         */

        Serializable serializableString = "string";
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";

        String works = "works";
        printer.printCharacters(works);
        /*
        w
        o
        r
        k
        s
         */
    }
}
