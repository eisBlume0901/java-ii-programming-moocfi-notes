package Part8.HashMap;

import java.util.HashMap;

public class HashMap1
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> postalCodes = new HashMap<>();

        //                 Key       Value
        postalCodes.put("Chitose", 6250135);
        postalCodes.put("Nagatani", 6240111);
        postalCodes.put("Ooyama", 6250158);
        postalCodes.put("Yoshino", 625003);

        System.out.println(postalCodes.get("Chitose")); //6250135

        /* If hashmap does not contain the key used for search, its
        get method returns a null reference
         */

        HashMap<String, Integer> Zahlen = new HashMap<>();

        Zahlen.put("Eins",1);
        Zahlen.put("Zwei",2);
        Zahlen.put("Drei",3);
        Zahlen.put("Vier",4);

        // .get(key) not value
        Integer translation = Zahlen.get("Eins");
        System.out.println(translation); //1
        System.out.println(Zahlen.get("Zwei")); //2
        System.out.println(Zahlen.get("Drei")); //3
        System.out.println(Zahlen.get("Vier")); // 4
        System.out.println(Zahlen.get("Fünf")); //null

        HashMap<String, Integer> conversionMap = new HashMap<>();

        conversionMap.put("3",9);
        conversionMap.put("6",6);
        conversionMap.put("9",3);

        if (conversionMap.get("9") == 3)
        {
            System.out.println("Correct!");
        }

        //Hash Map Keys Correspond to a Single Value at Most
        /* Hash Map has a maximum of one value per key. If a new
            key-value pair is added to the hashmap, but the key has
            already been associated with some other value stored in the
            hash map, the old value will vanish from the hash map.

            Summary: It will be overridden or updated.
         */
        HashMap<String, String> greetings = new HashMap<>();

        greetings.put("Hallo", "Hi");
        greetings.put("Wie geht es dir?" , "How are you?");
        greetings.put("Mir geht es so gut", "I am good.");
        greetings.put("Hallo", "Hello");

        String translate = greetings.get("Hallo");
        System.out.println(translate); //"Hello"


        //To consider how fast the searching performance. Use this:
        long start = System.nanoTime();
        System.out.println("Hello! ");
        long end = System.nanoTime();
        double seconds = (end - start)/ 1000000000;
        double minutes = seconds / 60;
        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);

        //HashMap is faster than ArrayList
    }
}
