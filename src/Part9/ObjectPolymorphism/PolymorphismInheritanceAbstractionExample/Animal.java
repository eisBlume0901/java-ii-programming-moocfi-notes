package Part9.ObjectPolymorphism.PolymorphismInheritanceAbstractionExample;

public abstract class Animal
{
    // Encapsulate instance variable
    private String name;
    // Constructor
    public Animal(String name)
    {
        this.name = name;
    }

    // Methods
    public void eat()
    {
        System.out.println(getName() + " eats");
    }

    public void sleep()
    {
        System.out.println(getName() + " sleeps");
    }

    // Getter
    public String getName()
    {
        return this.name;
    }
}
