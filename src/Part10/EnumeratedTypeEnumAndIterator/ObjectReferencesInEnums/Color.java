package Part10.EnumeratedTypeEnumAndIterator.ObjectReferencesInEnums;

public enum Color
{
    /*
    Enumerated types may contain object reference variables.
    However,
    1. Values of the reference variables should be set in an internal constructor of the class
    2. Private access modifier to prevent being modified by the user
     */
    RED("#FF0000"), // It will be error if the constructor is not made
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code; // Object reference variable

    // Encapsulated Constructor
    // so that it would not be modified since it should be constant value
    private Color(String code)
    {
        this.code = code;
    }

    // Getter
    public String getCode()
    {
        return this.code;
    }
}
