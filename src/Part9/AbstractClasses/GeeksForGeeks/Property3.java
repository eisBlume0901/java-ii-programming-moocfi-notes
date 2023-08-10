package Part9.AbstractClasses.GeeksForGeeks;

// An abstract class without any abstract method. It allows us to create
// classes that cannot be instantiated but can only be inherited.
abstract class Base3
{
    void fun()
    {
        System.out.println("Function of Base3 class is called");
    }
}

class Derived3 extends Base3
{
    // This class only inherits the Base class methods and properties
    // In this case, the void fun() method only.
}
public class Property3
{
    public static void main(String[] args)
    {
        Derived3 d = new Derived3();
        d.fun(); // Function of Base3 class is called
    }
}
