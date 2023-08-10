package Part10.ObjectsAndStream;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(new Person("Diana Wynne Jones", 1934), "Howl's Moving Castle", 336));
        books.add(new Book(new Person("Jane Austin", 1775), "Pride and Prejudice", 1813));
        books.add(new Book(new Person("Dan Brown", 2014), "The Da Vinci Code", 2003));
        books.add(new Book(new Person("Fyodor Dostoevsky", 1881), "Crime and Punishment", 1866));

        double average = books
                .stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);
        // Average of the authors' birth years: 1901.0

        // the mapping of a book to an author could also be done with a single map call
        // double average = books.stream()
        //     .mapToInt(book -> book.getAuthor().getBirthYear())

        books
                .stream()
                .filter(book -> book.getName().contains("Howl's"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));
        // Diana Wynne Jones (1934)

    }
}
