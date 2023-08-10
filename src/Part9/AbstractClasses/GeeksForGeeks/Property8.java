package Part9.AbstractClasses.GeeksForGeeks;

// If a class contains at least one abstract method, then compulsory that
// we should declare the class as abstract otherwise we will get a compile-
// time error.
abstract class Demo
{
    abstract void m1();
}

class Child extends Demo
{
    public void m1()
    {
        System.out.println("Hello");
    }
}
public class Property8
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.m1(); // Hello
    }
}
