package Part9.InterfaceAsMethodParameters;

import java.util.ArrayList;
import static java.lang.System.*;

interface Readable
{
    // Behavior
    String read();
}

public class Printer
{
    public void print(Readable readable)
    {
        out.println(readable.read());
    }
}
class TextMessage implements Readable
{
    // State
    // Encapsulate instance variables
    private String sender;
    private String content;


    // Constructor
    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }


    // Getter
    public String getSender() {
        return this.sender;
    }

    @Override
    public String read() {
        return this.content;
    }
}

class Ebook implements Readable {
    // State
    // Encapsulate instance variables
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;


    // Constructor
    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int pages() {
        return this.pages.size();
    }

    @Override
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        this.pageNumber++;
        if (this.pageNumber % this.pages.size() == 0) {
            // this.pageNumber reaches its final page would
            // be perfectly modded with the page size; thus, resulting
            // 0
            this.pageNumber = 0;
        }
    }
}
class ReadingList implements Readable
{
    // Encapsulate instance variables
    private ArrayList<Readable> readables;

    // Constructor
    public ReadingList()
    {
        this.readables = new ArrayList<>();
    }


    // Methods
    public void add(Readable readable)
    {
        this.readables.add(readable);
    }

    public int toRead()
    {
        return this.readables.size();
    }

    public String read()
    {
        String read = "";

        for (Readable readable : this.readables)
        {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }
}
class Main
{
    // Part12.ArrayListAndHashTable.Main Driver
    public static void main(String[] args)
    {
        TextMessage message = new TextMessage
                ("ope", "Oh wow, this printer knows how to print these as well!");
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}");
        Ebook book = new Ebook("Introduction to University Mathematics", pages);


        Printer printer = new Printer();
        printer.print(message);
        printer.print(book); // Prints the content of the book
        // Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}

        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submission yet?"));

        out.println("Joni's to-read:" + jonisList.toRead());
        // The number of text messages jonis has to read is 2

        ReadingList maryList = new ReadingList();
         int i = 0;
         while (i < 10)
         {
             maryList.add(new TextMessage("emerald",
                     "Hey! You have to finish your assignments! It is due today!"));
             i++;
         }

        out.println("Number of text messages Mary has to read: " + maryList.toRead()); // 10
        out.println();
        out.println("Delegating the reading to Claire");

        ReadingList claireList = new ReadingList();
        claireList.add(maryList);
        claireList.read(); // Since Claire already read the messages, mary's list is 0
        out.println("Number of text messages Mary has to read: " + maryList.toRead()); // 0
    }
}