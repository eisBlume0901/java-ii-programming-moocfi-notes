package Part8.GroupingDataUsingHashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupingDataUsingHashMaps
{
    public static void main(String[] args)
    {
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Mary Kate", "09672143124");
        phoneNumbers.put("Fevie", "09176228232");

        HashMap<String, ArrayList<String>> phoneNumbers1 = new HashMap<>();
        phoneNumbers1.put("Emerald", new ArrayList<>());

        phoneNumbers1.get("Emerald").add("09092001");
        phoneNumbers1.get("Emerald").add("10401501");

        System.out.println("Emerald's numbers: " + phoneNumbers1.get("Emerald"));
        //Emerald's numbers: [09092001, 10401501]


    }
}
