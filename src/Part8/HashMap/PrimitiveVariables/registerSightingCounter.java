package Part8.HashMap.PrimitiveVariables;
/*
A hash map's key and the object to be stored are always
reference-type variables.

Autoboxing - Java converts primitive variables to reference-types
automatically as they are added to either a HashMap or an ArrayList.
 */
import java.util.HashMap;

public class registerSightingCounter
{
    private HashMap<String, Integer> allSightings;

    public registerSightingCounter()
    {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted)
    {
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }

    public int timesSighted(String sighted)
    {
        /*
        When performing automatic conversion, we should ensure that the value to be
        converted is not null. Or else, we will encounter java.lang.reflect.Invocation
        TargetException error.

        From
        return this.allSightings.get(sighted);

        To
         */
        //return this.allSightings.get(sighted); //Returns Null Pointer Exception Error for null (e.g., "")
        return this.allSightings.getOrDefault(sighted, 0);
        /*
        getOrDefault method of the HashMap searches for the key passed to it as a
        parameter from the HashMap. If the key is not found, it returns the value
        of the second parameter passed to it.

        Alternative
        if (this.allSightings.containsKey(sighted))
        {
            return this.allSightings.get(sighed)
        }
        return 0;
         */
    }
}
