package Part9.BuiltInInterfacesListMapSetCollection;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        // List Interface
        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object");

        List<String> strings1 = new LinkedList<>();
        strings1.add("string objects inside a linkedlist object");

        // Map Interface
        Map<String, String> japanesePhrases = new HashMap<>();
        japanesePhrases.put("ganbatte", "goodluck");
        japanesePhrases.put("hai", "yes");
        japanesePhrases.put("itte", "say it");
        japanesePhrases.put("omedetou", "congrats");

        for (String key : japanesePhrases.keySet())
        {
            System.out.println(key + ": " + japanesePhrases.get(key));
            /*
                hai: yes
                omedetou: congrats
                itte: say it
                ganbatte: goodluck
             */
        }
        System.out.println(japanesePhrases.size());

        // Set Interface
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(1);
        numSet.add(2);
        numSet.add(1);

        System.out.println(numSet); // [1, 2]
        /*
        Hashset does not assume the order of a set of elements rather it removes duplicate
        elements in the set. If objects created from custom classes are added to the HashSet object,
        they must have both the equals and hashCode methods defined.
         */

        // Collection interface
        Map<Integer, String> germanNumber = new HashMap<>();
        germanNumber.put(1, "eins");
        germanNumber.put(2, "zwei");
        germanNumber.put(3, "drei");
        germanNumber.put(4, "vier");
        germanNumber.put(5, "fünf");

        Set<Integer> numSet2 = germanNumber.keySet();

        Collection<Integer> keyCollection = numSet2;

        System.out.println("Keys in Hashmap");
        for (Integer key : keyCollection)
        {
            System.out.println("\t" + key);
            /*
            Keys in Hashmap
                1
                2
                3
                4
                5
             */
        }

        System.out.println();
        System.out.println("Values in Hashmap");
        Collection<String> values = germanNumber.values();

        for (String value : values)
        {
            System.out.println("\t" + value);
            /*
            Values in Hashmap
                eins
                zwei
                drei
                vier
                fünf
             */
        }
    }
}
