package Part8.SimilarityOfObjects.ApproximateComparisonWithHashMap;

import java.util.HashMap;

/*
hashCode method
- crates hash code that tells a bit about the object's content.
- If two objects have the same hash value, they may be equal and
opposite for unequal
 */
public class Main
{
    public static void main(String[] args)
    {
        HashMap<Book, String> borrowers = new HashMap<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        System.out.println("1 " +borrowers.get(bookObject));
        //Output is 1 Pekka
        
        //Output is null because we created a new Book object
        System.out.println("2 " + borrowers.get(new Book("Book Object", 2000, "...")));
        //Output is now 2 Pekka since we created public int hashCode

        //Output is null because we created a new Book object
        System.out.println( "3 "+ borrowers.get(new Book("Test Driven Development", 1999, "...")));
        //Output is now 3 Arto because we created public int hashCode
        //Refer to Book class and see public int hashCode
    }
}
