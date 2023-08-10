package Part12.ArrayListAndHashTable;
public class Pair <K, V>
{
    private K key;
    private V value;

    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue(V value)
    {
        this.value = value;
    }
}

class HashMap<K, V>
{
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap()
    {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key)
    {
        // Read the article again to know what is the internal architecture of Hashmap
        // https://javabypatel.blogspot.com/2015/10/how-hashmap-works-internally-explain-relation-with-hashcode-and-equals-method.html
        // Calculate the hash value of the key and use it to figure which is the relevant
        // index of the internal array of the hash map.
        // Modulo operator ensures that the index stays within the size boundaries of the internal array

        int hashValue = Math.abs(key.hashCode() % values.length); // Index for array
        if (values[hashValue] == null) return null;

        List<Pair<K, V>> valuesAtIndex = values[hashValue];
        for (int i = 0; i < valuesAtIndex.size(); i++) // Index for array
            if (valuesAtIndex.value(i).getKey().equals(key)) // equals for linkedList
                return valuesAtIndex.value(i).getValue();

        return null;

    }

    // This version does not increase the size of the internal array when new values are added
    // to the hash map
    public void add(K key, V value)
    {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0)
        {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        }
        else
            valuesAtIndex.value(index).setValue(value);

        if ((double) firstFreeIndex / values.length > 0.75)
            grow();
    }

    private List<Pair<K, V>> getListBasedOnKey(K key)
    {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null)
            values[hashValue] = new List<>(); // Initializes new collection set

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key)
    {
        // If a newly added key is existing already in the collection set
        for (int i = 0; i < myList.size(); i++)
            if (myList.value(i).getKey().equals(key))
                return i;
        return -1;
    }

    private void grow()
    {
        // Create a new array which grows 2 times
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++)
            copy(newArray, i);

        // Replace the old array which we declared to have a variable name of values to newArray
        this.values = newArray;
    }

    // Copies the list of values at one index of the old array to the new one
    private void copy(List<Pair<K, V>>[] newArray, int fromIndex)
    {
        if (this.values[fromIndex] == null) {
            return; // If the source list is null, nothing to copy
        }

        for (int i = 0; i < this.values[fromIndex].size(); i++)
        {
            Pair<K, V> value = this.values[fromIndex].value(i);

            // https://youtu.be/CBYHwZcbD-s?t=9622
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);

            if (newArray[hashValue] == null)
                newArray[hashValue] = new List<>();

            newArray[hashValue].add(value); // adds the value
        }
    }

    public V remove(K key)
    {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0)
            return null;

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0)
            return null;

        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

}

class Pairs
{
    public static void main(String[] args)
    {
        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
    }
}
