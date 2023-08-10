package Part9.AbstractClasses.GeeksForGeeks;

// If the Child class is unable to provide implementation to all abstract
// methods of the Parent class, then we should declare that Child as abstract
// so that the next level Child class should provide implementation to the
// remaining abstract method - See notes for more info
abstract class Demo9
{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo9
{
    public void m1()
    {
        System.out.println("Inside m1");
    }
}

class SecondChild extends FirstChild
{
    public void m2()
    {
        System.out.println("Inside m2");
    }

    public void m3()
    {
        System.out.println("Inside m3");
    }
}
public class Property9
{
    public static void main(String[] args)
    {
        SecondChild s = new SecondChild();
        s.m1(); // Inside m1 - since it inherited the methods in abstract
        // FirstChild class
        s.m2(); // Inside m2
        s.m3(); // Inside m3
    }
}
