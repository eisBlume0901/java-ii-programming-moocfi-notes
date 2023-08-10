package Part8.GroupingDataUsingHashMaps.RemovingSpecificList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility
{
    private HashMap<String, ArrayList<String>> inventory;

    public StorageFacility()
    {
        this.inventory = new HashMap<>();
    }

    public void add(String unit, String item)
    {
        this.inventory.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> itemList = this.inventory.get(unit);
        itemList.add(item);
    }

    public ArrayList<String> contents(String storageUnit)
    {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.inventory.getOrDefault(storageUnit, emptyList);
    }

    public void remove(String storageUnit, String item)
    {
        this.inventory.get(storageUnit).remove(item);

        if (this.inventory.get(storageUnit).isEmpty())
        {
            this.inventory.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits()
    {
        ArrayList<String> storageUnits = new ArrayList<>();

        for (String storageUnit : this.inventory.keySet())
        {
            storageUnits.add(storageUnit);
        }
        return storageUnits;
    }

    public void printKeysAndValues()
    {
        for (Map.Entry<String, ArrayList<String>> entry : inventory.entrySet())
        {
            System.out.println(entry.getKey() + " ," + entry.getValue());
        }
    }
}
