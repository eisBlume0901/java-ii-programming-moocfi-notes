package Part10.ObjectsAndStream;

public class Person
{
    // Encapsulate instance variable
    private String name;
    private int birthYear;
    // Parametrized Constructor
    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getter
    public String getName()
    {
        return this.name;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    @Override
    public String toString()
    {
        return this.name + " (" + this.birthYear + ")";
    }
}
