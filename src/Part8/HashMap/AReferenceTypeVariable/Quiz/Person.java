package Part8.HashMap.AReferenceTypeVariable.Quiz;

import java.util.HashMap;

class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args)
    {
        HashMap<String, Person> lists = new HashMap<>();

        Person natsume = new Person("Natsume Takashi", 15);
        Person satowa = new Person("Hozuki Satowa", 16);

        lists.put(natsume.getName(), natsume);
        lists.put(satowa.getName(), satowa);

        if (lists.get("Hozuki Satowa").getAge() == 16)
        {
            System.out.println("Correct!");
        }
    }
}
