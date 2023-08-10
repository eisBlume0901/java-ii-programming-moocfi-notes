package Part9.ClassInheritance;
/*
Contents of Engine and Parts are overlapping thus, inheritance
should be used
 */
public class EngineWithoutInheritance
{
    private String engineType;
    private String identifier;
    private String manufacturer;
    private String description;

    public EngineWithoutInheritance(String engineType, String identifier, String manufacturer, String description)
    {
        this.engineType = engineType;
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getEngineType()
    {
        return this.engineType;
    }

    public String getIdentifier()
    {
        return this.identifier;
    }

    public String getManufacturer()
    {
        return this.manufacturer;
    }

    public String getDescription()
    {
        return this.description;
    }
}
