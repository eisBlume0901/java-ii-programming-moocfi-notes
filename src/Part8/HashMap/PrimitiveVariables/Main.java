package Part8.HashMap.PrimitiveVariables;

public class Main
{
    public static void main(String[] args)
    {
        registerSightingCounter rc = new registerSightingCounter();
        rc.addSighting("Banana");
        System.out.println(rc.timesSighted("Banana")); //output is 1
        System.out.println(rc.timesSighted("")); //Null Pointer Exception Error
        // Will return 0 since the return changed to this.allSightings.getOrDefault(sighted, 0);
    }
}
