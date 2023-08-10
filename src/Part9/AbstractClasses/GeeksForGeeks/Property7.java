package Part9.AbstractClasses.GeeksForGeeks;

// We can use the abstract keywords for declaring top-level classes
// (Outer class) as well as inner class as abstract
abstract class B
{
    // declaring inner class as abstract with abstract method
    abstract class C
    {
        abstract void myAbstractMethod();
    }
}

class D extends B
{
    class E extends C
    {
        void myAbstractMethod()
        {
            System.out.println("Inside abstract method implementation");
        }
    }
}
public class Property7
{
    public static void main(String[] args)
    {
        // Instantiating the outer class
        D outer = new D();

        // Instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();
    }
}
