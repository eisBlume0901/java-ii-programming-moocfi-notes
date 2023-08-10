package Part10.FilesAndStreams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<String> rows = new ArrayList<>();
        try
        {
            Files.lines(Paths.get("D:\\CEU Computer Science\\Java\\MOOCFI" +
                    "\\Java II Programming MOOCFI\\src\\Part10\\FilesAndStreams\\Sample File"))
                    .forEach(row -> rows.add(row));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(rows);

        System.out.println(read("D:\\CEU Computer Science\\Java\\MOOCFI\\Java II Programming " +
                "MOOCFI\\src\\Part10\\FilesAndStreams\\ClassList", ": "));

        System.out.println(printList("D:\\CEU Computer Science\\Java\\MOOCFI\\Java II Programming " +
                "MOOCFI\\src\\Part10\\FilesAndStreams\\BookList", ","));
    }

    public static List<Person> read(String file, String separator)
    {
        List<Person> students = new ArrayList<>();
        try
        {
            Files.lines(Paths.get(file))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(separator))
                    // deleting the split rows that have less than two parts (this is whitespace)
                    // It can be necessary to put or not
                    .filter(parts -> parts.length >= 2)
                    // Creating persons from the parts
                    .map(parts -> new Person(parts[0], Integer.parseInt(parts[1])))
                    .forEach(person -> students.add(person));
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        return students;
    }

    public static List<Book> printList(String file, String separator)
    {
        List<Book> library = new ArrayList<>();
        try
        {
            Files.lines(Paths.get(file))
                    .map(m -> m.split(separator))
                    .map(parts -> new Book(
                            parts[0],
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            parts[3]))
                    .forEach(data -> library.add(data));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return library;
    }
}


