package Part9.WhenIsInheritanceWorthUsing;

public class ReferencingCar
{
    private String make;
    private String model;

    public ReferencingCar(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public void start()
    {
        System.out.println("The " + make + " " + model + " is starting.");
    }
}

class Person
{
    private String name;
    private int age;
    private ReferencingCar car;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setCar(ReferencingCar car)
    {
        this.car = car;
    }

    public void drive()
    {
        car.start();
    }
}

class Main2
{
    public static void main(String[] args)
    {
        Person andré = new Person("André", 25);

        ReferencingCar car = new ReferencingCar("Toyota", "Camry");

        andré.setCar(car);

        andré.drive(); //The Toyota Camry is starting.
    }
}

