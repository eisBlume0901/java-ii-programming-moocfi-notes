package Part9.PolymorphismQuiz.Interfaces;
import java.util.*;
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
        // Primitive-type variable
        int num = 0;

        // Reference-type variable
        TextMessage message = new TextMessage("Odette",
                "How is your day my dearest sister?");
        System.out.println(message.read());
        // How is your day my dearest sister?

        List<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("Fevie", "What do " +
                "you want to eat for dinner?"));
        textMessage.add(new TextMessage("Alper", "I am " +
                "hanging out with you tonight"));

        for (TextMessage tm : textMessage)
        {
            System.out.println(tm.read());
            /*
            What do you want to eat for dinner?
            I am hanging out with you tonight
             */
        }
    }
}
