package Part9.InterfaceAsVariableType;

import java.util.*;
public class Ebook implements Readable
{
    // State
    // Encapsulate instance variables
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;


    // Constructor
    public Ebook(String name, ArrayList<String> pages)
    {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public int pages()
    {
        return this.pages.size();
    }

    @Override
    public String read()
    {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage()
    {
        this.pageNumber++;
        if (this.pageNumber % this.pages.size() == 0)
        {
            // this.pageNumber reaches its final page would
            // be perfectly modded with the page size; thus, resulting
            // 0
            this.pageNumber = 0;
        }
    }

    // Part12.ArrayListAndHashTable.Main Driver
    public static void main(String[] args)
    {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");
        pages.add("It is important to understand the base case and the " +
                " recursive case when using recursion. The base case is the" +
                " condition that stops the recursion. ");

        // interface Readable as reference-type variable
        Readable book = new Ebook("Introduction to recursion", pages);

        int page = 0;
        while (page < pages.size())
        {
            System.out.println(book.read());
            page++;
        }

        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));

        ArrayList<String> pages1 = new ArrayList<>();
        pages1.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages1));

        for (Readable readable: readingList)
        {
            System.out.println(readable.read());
        }

        /*
        REMINDER:
        While all Ebooks are Readable, not all Readable are Ebooks.
        Therefore, an Ebook can be assigned to a Readable variable,
        but not the other way around without a type conversion.

        WARNING:
        Type conversion - is not considered good practice.
        Implementation of equals method is recommended.
         */

        Readable readable1 = new TextMessage("ope", "TextMessage is Readable");
//        TextMessage message1 = readable; // does not work
        TextMessage castMessage = (TextMessage) readable1; // works if, and only if, readable is of
        // text message type
    }
}