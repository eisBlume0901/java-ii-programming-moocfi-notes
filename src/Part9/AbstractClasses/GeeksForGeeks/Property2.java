package Part9.AbstractClasses.GeeksForGeeks;

// Can contain constructors. A constructor of an abstract class is called
// when an instance of an inherited class is created.
abstract class Base2
{
    //Constructor of class 2
    Base2()
    {
        System.out.println("Base2 Constructor Called");
    }
    // Method of class 2
    abstract void fun();

}

class Derived2 extends Base2 // inherited
{
    Derived2()
    {
        System.out.println("Derived2 Constructor Called");
    }

    @Override
    void fun()
    {
        System.out.println("Derived2 fun() called");
    }
}
public class Property2
{
    public static void main(String[] args)
    {
        Derived2 d = new Derived2();
        d.fun(); /* Base2 Constructor Called
        Derived2 Constructor Called
        Derived2 fun() called */
    }
}
