package Part9.InterfaceAsReturnTypeOfAMethod;

public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Kate", "Manga is greater than anime", 10);
        System.out.println(book1);

        CD cd1 = new CD("Mary", "123", 2023);
        System.out.println(cd1);

        Box bigBox = new Box(20);
        bigBox.add(new Box(10));
        bigBox.add(new Book("J.R.R Tolkien", "The Hobbit", 5));
        System.out.println(bigBox.weight());

    }
}
