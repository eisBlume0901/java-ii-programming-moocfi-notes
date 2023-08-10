package Part9.ClassInheritance;

public class Engine extends Part
/* extends - allows inheritance of the superclass Part to the subclass Engine
class Engine inherits the functionality of the class Part
 */
{
    private String engineType;

    public Engine(String engineType, String identifer, String manufacturer, String description)
    {
        super(identifer, manufacturer, description);
        /* super is used to call the constructor of the superclass.
        The call super(identifier, manufacturer, description) calls the constructor
        public Part(String identifier, String manufacturer, String description)

         */
        this.engineType = engineType;
    }

    public String getEngineType()
    {
        return this.engineType;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VM GOLF 1l 86-91");
        System.out.println(engine.getEngineType()); //Combustion
        System.out.println(engine.getManufacturer()); //volkswagen
    }
}