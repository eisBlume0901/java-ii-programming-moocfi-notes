package Part9.PolymorphismQuiz.Interfaces;
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
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user interface logic from the application" +
                " logic");
        pages.add("Always program a small part initially that solves a part" +
                " of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your" +
                " own projects");

        Ebook programmingEbook = new Ebook("Tips for programming by MOOCFI Java", pages);

        int page = 0;
        while (page < programmingEbook.pages())
        {
            System.out.println(programmingEbook.read());
            page++;
        }
        /*
Split your method into short, readable entities.
Separate the user interface logic from the application logic
Always program a small part initially that solves a part of the problem.
Practice makes the master. Try different out things for yourself and work on your own projects
         */
    }
}
