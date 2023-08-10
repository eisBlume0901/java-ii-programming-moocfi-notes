package Part9.ActualTypeOfObjectDictatesWhichMethodIsExecuted;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
//        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
////        ollie.credits();        // DOESN'T WORK! Can only work when it is declared Student ollie
////        ollie.study();              // DOESN'T WORK! Can only work when it is declared Student ollie
//        System.out.println(ollie);   // ollie.toString() WORKS

        /*
        The reason why ollie.study and ollie.credits does not work because the parent/super class
        declared is Person instead of Student. It means that the method in the Person class is only
        available or accessible. However, the ollie.toString() works because methods in the Person
        and main Object (generic/default has the toString() method) is available or accessible; thus,
        allowing us to execute the .toString() method.

        Note:
        The method that is allowed to be executed is closed to the inheritance hierarchy.
         */

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);
//
        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);

//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        ollie.study(); //IT WORKS! Because we declared Student ollie
//        System.out.println(ollie); //toString is overridden(polymorphism) that is why the output is
//        /*
//        Ollie
//            6381 Hollywood Blvd. Los Angeles 90028
//            Study credits 1
//         */

        Teacher kate = new Teacher("Mary Kate", "179-L 24th Avenue East Rembo, Makati City",
                2500);
        System.out.println(kate);
        /*
        Mary Kate
          179-L 24th Avenue East Rembo, Makati City
          salary 2500 euro/month
         */
    }

    public static void printPersons(ArrayList<Person> persons)
    {
        for (Person p: persons)
        {
            System.out.println(p.toString());
        }
    }
}

class Person
{
private String name;
    private String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    @Override
    public String toString()
    {
        return this.name + "\n  " + this.address;
    }
}

class Student extends Person
{
    private int credit;

    public Student(String name, String address)
    {
        super(name, address);
        this.credit = 0;
    }

    public void study()
    {
        this.credit++;
    }

    public int credits()
    {
        return this.credit;
    }

    //Polymorphism since toString of Person class is overridden
    @Override
    public String toString()
    {
        return this.getName() + "\n  " + this.getAddress() + "\n  Study credits " + this.credit;
    }
}

class Teacher extends Person
{
    private int salary;

    public Teacher(String name, String address, int salary)
    {
        super(name, address);
        this.salary = salary;
    }

    //Polymorphism since toString of Person class is overridden
    @Override
    public String toString()
    {
        return this.getName() + "\n  " + this.getAddress() + "\n  salary " + this.salary + " euro/month";
    }
}