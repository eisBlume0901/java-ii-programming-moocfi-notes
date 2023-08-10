package Part9.InterfaceAsReturnTypeOfAMethod;

public class Book implements Packable {

    // Encapsulate instance variable
    private String author;
    private String title;
    private double weight;

    // Constructor
    public Book(String author, String title, double weight)
    {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    @Override
    public double weight()
    {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }

}
