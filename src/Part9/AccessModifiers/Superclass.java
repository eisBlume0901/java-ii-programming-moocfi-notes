package Part9.AccessModifiers;

public class Superclass
{
    private String objectVariable;

    public Superclass()
    {
        this("Example");
    }

    public Superclass(String value)
    {
        this.objectVariable = value;
    }

    public String toString()
    {
        return this.objectVariable;
    }
}

class Subclass extends Superclass
{
    public Subclass()
    {
        super("Subclass");
    }

    public String toString()
    {
        return super.toString() + "\n And let's add my own message to it!";
    }
}

class Main
{
    public static void main(String[] args)
    {
        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup); //Example
        System.out.println(sub);
        //Subclass
        // And let's add my own message to it!
        System.out.println(sub.toString());
        //Subclass
        // And let's add my own message to it!
    }
}