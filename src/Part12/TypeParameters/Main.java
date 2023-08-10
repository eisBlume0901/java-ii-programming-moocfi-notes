package Part12.TypeParameters;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Locker<String> string = new Locker<>();
        string.setValue("String made from Generic");
        System.out.println(string.getValue()); // String made from Generic

        Locker<Integer> integer = new Locker<>();
        integer.setValue(1);
        System.out.println(integer.getValue()); // 1

        Locker<ArrayList<String>> list = new Locker<>();
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("generics");
        stringList.add("type parameters");
        list.setValue(stringList);
        System.out.println(list.getValue()); // [generics, type parameters]

        Locker<Random> random = new Locker<>();
        random.setValue(new Random());
        System.out.println(random.getValue().nextDouble());

    }
}
