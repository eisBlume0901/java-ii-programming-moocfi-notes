package Part9.PolymorphismQuiz;

public class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " (" + age + " years) ";
    }
}

class Student extends Person
{
    private int credits;

    public Student(String name, int age, int credits)
    {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString()
    {
        return super.toString() + credits + " credits";
    }

    public static void main(String[] args)
    {
        Student studentMary = new Student("Mary Kate", 21, 26);

        Person personMary = studentMary;
        Object objectMary = studentMary;

        System.out.println(studentMary + ", ");
        System.out.println(personMary + ", ");
        System.out.println(objectMary);
    }
}
