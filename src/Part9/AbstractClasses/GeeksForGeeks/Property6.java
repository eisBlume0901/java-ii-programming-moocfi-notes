package Part9.AbstractClasses.GeeksForGeeks;

// We can define static methods in an abstract class that can be called
// independently without an object
abstract class Helper
{
    static void demofun()
    {
        System.out.println("Static void demofun() is called");
    }
}
public class Property6 extends Helper
{
    public static void main(String[] args)
    {
        // No need for
        // Helper h = new Property6(); - applicable only if the method is not
        // declared as static but just void methodName();
        Helper.demofun();
    }
}
