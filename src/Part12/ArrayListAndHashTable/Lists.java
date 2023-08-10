package Part12.ArrayListAndHashTable;
import java.util.*;
public class Lists
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.contains("Hello!"));
        strings.add("Hello!");
        System.out.println(strings.contains("Hello!"));
        strings.remove("Hello!");
        System.out.println(strings.contains("Hello!"));

        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("World");

        for (int i = 0; i < 11; i++)
        {
            myList.add("hello");
        }
        System.out.println(myList.contains("hello"));
    }
}

// Data Structures and Algorithms
// This is just imitating the arrays
class List<Type>
{
    private Type[] values;
    private int firstFreeIndex;

    public List()
    {
        // Type[] is explicit casting operation that casts the Object array to a generic type "Type" array
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value)
    {
        if (this.firstFreeIndex == this.values.length)
            grow();

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    // Data structures and algorithm topic
    // It grows 1.5 times the size of the old array so for instance 10 would be 10 + 5 = 15
    private void grow()
    {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];

        /*
        The reason this.values.length is used is that the newSize would cause error because of
        their difference in array sizes. For loop is used to copy the elements from the old array
        to the new array. However, since the new array is larger than the old array, we only copy
        the elements up to the size of the old array to ensure that we do not access undefined or
        uninitialized elements in the new array.

        To avoid NullPointerException
         */
        for (int i = 0; i < this.values.length; i++)
            newValues[i] = this.values[i];

        this.values = newValues;
    }

    public boolean contains(Type value)
    {
        return indexOfValue(value) >= 0;
    }

    // Data structures and algorithm topic
    public int indexOfValue(Type value)
    {
        for (int i = 0; i < this.firstFreeIndex; i++)
            if (this.values[i].equals(value))
                return i;
        return -1;
    }

    private void moveToTheLeft(int fromIndex)
    {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++)
            this.values[i] = this.values[i + 1];
    }

    public void remove(Type value)
    {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0)
            return;

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public Type value(int index)
    {
        if (index < 0 || index >= this.firstFreeIndex)
            throw new ArrayIndexOutOfBoundsException
                    ("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        return this.values[index];
    }

    public int size()
    {
        return this.firstFreeIndex;
    }

}