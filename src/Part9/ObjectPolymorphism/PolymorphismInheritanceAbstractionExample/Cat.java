package Part9.ObjectPolymorphism.PolymorphismInheritanceAbstractionExample;

// Inheritance
public class Cat extends Animal implements NoiseCapable
{
    // Polymorphism
    public Cat(String name)
    {
        super(name);
    }

    // Constructor Overloading
    public Cat()
    {
        super("Cat");
    }

    // Method
    public void purr()
    {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise()
    {
        purr();
    }
}
