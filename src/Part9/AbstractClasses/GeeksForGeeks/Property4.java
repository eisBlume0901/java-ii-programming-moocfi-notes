package Part9.AbstractClasses.GeeksForGeeks;

// Abstract classes can also have final (cannot be overridden) methods
// But abstract class themselves cannot be declared as final since
// they are intended to be subclassed and extended by other classes.
abstract class Base4
{
    final void fun()
    {
        System.out.println("Base4 fun() called");
    }
}

class Derived4 extends Base4
{
    // This class only inherits the Base class methods and properties
    // In this case, the void fun() method only.
}
public class Property4
{
    public static void main(String[] args)
    {
        Base4 b = new Derived4();
        b.fun(); // Base4 fun() called
    }
}
