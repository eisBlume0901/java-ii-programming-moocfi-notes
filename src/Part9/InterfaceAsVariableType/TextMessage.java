package Part9.InterfaceAsVariableType;

interface Readable
{
    // Behavior
    String read();
}
public class TextMessage implements Readable
{
    // State
    // Encapsulate instance variables
    private String sender;
    private String content;


    // Constructor
    public TextMessage(String sender, String content)
    {
        this.sender = sender;
        this.content = content;
    }


    // Getter
    public String getSender()
    {
        return this.sender;
    }

    @Override
    public String read()
    {
        return this.content;
    }

    // Part12.ArrayListAndHashTable.Main Driver
    public static void main(String[] args)
    {
        TextMessage message = new TextMessage("ope", "many types for the same object");

        // interface Readable as Reference-type variable
        // Readable is the parent class and the TextMessage is the child class. - Inheritance
        Readable readable = new TextMessage("ope", "The text message is Readable!");
    }
}
