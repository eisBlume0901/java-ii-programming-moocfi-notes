package Part10.FilesAndStreams;

public class Person
{
    private String name;
    private int birthYear;

    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBirthYear()
    {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    @Override
    public String toString()
    {
        return this.name + " was born in " + this.birthYear;
    }
}