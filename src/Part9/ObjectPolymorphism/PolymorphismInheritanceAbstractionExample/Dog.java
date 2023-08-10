package Part9.ObjectPolymorphism.PolymorphismInheritanceAbstractionExample;

// Inheritance
public class Dog extends Animal implements NoiseCapable
{

    // Polymorphism
    public Dog(String name)
    {
        super(name);
    }

    // Constructor overloading
    public Dog()
    {
        super("Dog");
    }

    // Method
    public void bark()
    {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise()
    {
        bark();
    }
}
