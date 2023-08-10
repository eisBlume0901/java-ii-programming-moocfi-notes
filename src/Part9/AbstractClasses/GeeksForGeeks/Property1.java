package Part9.AbstractClasses.GeeksForGeeks;

// Instance of an abstract class cannot be created but can be referenced
abstract class Base1
{
    abstract void fun();
}

class Derived1 extends Base1
{

    @Override
    void fun()
    {
        System.out.println("Derived1 fun() called");
    }
}
public class Property1
{
    public static void main(String[] args)
    {
        // We can reference Base type
        Base1 b = new Derived1();
        b.fun(); // Derived fun() called
    }
}
